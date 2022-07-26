
package com.company.container;

public class HotContainer extends BaseContainer { //inherits from BaseContainer

    public HotContainer(int id) {
        super(id);
        // TODO Auto-generated constructor stub
    }
    @Override  //override method in sub class
    public void AlertDetach(){  //notification
        System.out.println(String.format("(Container: %x) Loskoppeling van verwarmingselementen",this.ID));

    }

}
