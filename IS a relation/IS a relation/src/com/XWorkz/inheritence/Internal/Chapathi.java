package com.XWorkz.inheritence.Internal;

public class Chapathi extends Food{
    public Chapathi()
    {
        super();
        System.out.println("No args Chapathi Food Constructor");
    }
    @Override
    public void items()
    {
        System.out.println("Food Items");
    }
    @Override
    public void teast()
    {
        System.out.println("Food Teast");
    }
    @Override
    public void price()
    {
        System.out.println("Food Price");
    }
    @Override
    public void name()
    {
        System.out.println("Food Name");
    }
    @Override
    public void type()
    {
        System.out.println("Type of Food");
    }
}
