
package com.company.container;

public class ColdContainer extends BaseContainer{ //inherits from BaseContainer

    public ColdContainer(final int id) {
        super(id);
        // TODO Auto-generated constructor stub
    }

    @Override //override method in sub class
    public void AlertDetach() { //notification
        System.out.println(String.format("(Container: %x) Loskoppeling van koude elementen",this.ID));

    }
}
