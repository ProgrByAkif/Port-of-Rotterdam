
package com.company;

import com.company.container.IContainer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        ContainerSchip containerSchip = new ContainerSchip();
        Crane craneOne = new Crane("Kraan 1");
        Crane craneTwo = new Crane("Kraan 2");
        Quay quay= new Quay();

        List<Truck> trucks = new ArrayList<Truck>();
        trucks.add(new Truck("Truck 1"));
        trucks.add(new Truck("Truck 2"));
        trucks.add(new Truck("Truck 3"));


        while (containerSchip.containers.size()!= 0){
            IContainer containerToCraneOne = containerSchip.GetContainer();
            IContainer containerToCraneTwo = containerSchip.GetContainer();

            craneOne.StoreContainer(containerToCraneOne);
            craneTwo.StoreContainer(containerToCraneTwo);

           IContainer containerOneToKade = craneOne.GetContainer();
           IContainer containerTwoToKade = craneTwo.GetContainer();

            quay.StoreContainer(containerOneToKade);
            quay.StoreContainer(containerTwoToKade);

            trucks.forEach((truck)->truck.StoreContainer(quay.GetContainer()));





        }
    }
}
