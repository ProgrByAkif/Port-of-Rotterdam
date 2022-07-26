
package com.company;

import com.company.container.IContainer;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.*;

public class Crane extends Thread{ //inherits from Thread

    private String name;
    private IContainer container;

    public Crane(String Name){ //constructor
        this.name = Name;
        start();
    }

    public void IsWorking(){
        //logic stop moving containers
    }

    public void IsWaiting(){
        //logic stop moving containers

    }
    public void SetContainer(IContainer container){
        this.container = container;
    }
//    public Thread GetContainer(IContainer container){
//        return new Thread(new Runnable() {
//            @Override
//            public void run() {
//                AlertContainerRequest();
//                SetContainer(container);
//                AlertContainerStored();
//            }
//        });
//
//    }

    public void StoreContainer(IContainer container){
        int delay = ThreadLocalRandom.current().nextInt(1000,6000);
        try {
            Thread.sleep(delay);
            AlertContainerRequest();
            SetContainer(container);
            AlertContainerStored();
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }

    public IContainer GetContainer(){
        return this.container;
    }

    public void AlertContainerRequest(){
        System.out.println(String.format("(%s) %s wil container halen", this.name, this.name));
    }

    public void AlertContainerStored(){
        System.out.println(String.format("(%s) %s heeft container: %x opgehaald", this.name,this.name,container.GetID()));
    }
}

