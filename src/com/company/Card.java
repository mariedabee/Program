package com.company;

import java.util.HashMap;
import java.util.Map;

// A Java program to demonstrate working of
// Prototype Design Pattern with example
// of a " Cards types in a school management system" class to store existing objects.
abstract class Card implements Cloneable {
    protected String Cardtype;

    abstract void addCard();
    public abstract Card getClone();
    public Object clone()
    {
        System.out.println("Cloning ..");
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }

    public abstract void showRecord();
}
















