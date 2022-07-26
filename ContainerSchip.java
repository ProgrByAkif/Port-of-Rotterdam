
package com.company;
import com.company.container.ColdContainer;
import com.company.container.HotContainer;
import com.company.container.IContainer;
import com.company.container.StandardContainer;

import java.util.*;

public class ContainerSchip {

    List<IContainer> containers = new ArrayList<IContainer>(); // Arraylist  of containers
    int amountContainers;

    public ContainerSchip()
    {
        for(int i = 0; i<33; i++)
        {
            containers.add(new StandardContainer(i));
        }

        for(int i = 33; i<66; i++)
        {
            containers.add(new HotContainer(i));
        }

        for(int i = 66; i<100; i++)
        {
            containers.add(new ColdContainer(i));
        }

        amountContainers = containers.size();
    }

    public List<IContainer> GetAmountContainers() {
        return containers;
    }
    public IContainer GetContainer(){
        int containerId = this.containers.size()-1;
        IContainer container = containers.get(containerId);


        container.AlertDetach();
        containers.remove(containerId);


        AlertContainerMoved(containerId);
        amountContainers = containers.size();

        return container;

    }


    public void AlertContainerMoved(int id) { //notification
        System.out.println(String.format("(Containerschip) Container: %x gegeven", id));
    }
}
