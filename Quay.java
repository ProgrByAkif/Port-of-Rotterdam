
package com.company;

import com.company.container.IContainer;

import java.util.ArrayList;
import java.util.List;

public class Quay {
    List<IContainer> containers = new ArrayList<IContainer>();

    public Quay(){

    }

    public void StoreContainer(IContainer container){
        if(containers.size() < 5){
            containers.add(container);}

    }

    public IContainer GetContainer(){
        if(containers.size()!=0) {
            return containers.get(containers.size() - 1);
        }
        return null;
    }

}
