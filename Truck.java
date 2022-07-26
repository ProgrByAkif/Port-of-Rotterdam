
package com.company;

import com.company.container.ColdContainer;
import com.company.container.HotContainer;
import com.company.container.IContainer;

import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Thread{ //inherits from Thread
    private String Name;
    private IContainer Container;

    public Truck(String name){ //constructor
        this.Name = name;
        start();
    }

//    public void IsPickingUp() {
//
//    }
//
//    public void IsTakingOff() {
//
//    }
//
    public void StoreContainer(IContainer container){
        this.Container = container;
        AlertLoadedContainer(Container);
    }

    public void AlertLoadedContainer(IContainer container){
        if(container.getClass() == HotContainer.class){
            System.out.println(String.format("(%s) Container: "+this.Container.GetID()+" vastgekoppeld aan verwarmingselementen en geladen op de vrachtwagen",this.Name));
        }

        else if(container.getClass() == ColdContainer.class){
            System.out.println(String.format("(%s) Container: %x vastgekoppeld aan koelingselementen en geladen op de vrachtwagen",this.Name,this.Container.GetID()));
        }

        System.out.println(String.format("(%s) Container: %x geladen op de vrachtwagen",this.Name,this.Container.GetID()));

    }

    public void TransportContainer(IContainer container) {
        //time logic
        //delete container from model
        int delay = ThreadLocalRandom.current().nextInt(1000,6000);
        try {
            Thread.sleep(delay);
            Container = null;
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
//
//    public void IsWaiting(){
//
//    }
}
