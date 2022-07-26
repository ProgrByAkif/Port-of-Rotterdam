
package com.company.container;

public abstract class BaseContainer implements IContainer{ //cannot  be  instantiated

    protected int ID; //access modifier

    public BaseContainer(int id)

    {
        SetID(id);

    }

    @Override //override method in sub class
    public void SetID(int id)
    {
        this.ID = id;  //constructor
    }

    @Override
    public int GetID() {
        // TODO Auto-generated method stub
        return ID;
    }

    @Override
    public void AlertDetach()  { //notification
        System.out.println(String.format("(Container: %x) Loskoppeling standaard container",this.ID));
    }

}
