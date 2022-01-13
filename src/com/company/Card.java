package com.company;

// A Java program to demonstrate working of
// Prototype Design Pattern with example
// of a " Cards types in a school management system" class to store existing objects.

/***
Card, StudenCard, TeacherCard:
 abstract class Card (parent class): this class represents the prototype for this pattern.
 The "StudenCard", and "TeacherCard" are subclasses that can access the parent "Card" class with its protected attribute "Cardtype", each subclass will set a value to the cardtype: Cardtype= "student" or "teacher" .
 An abstract method "showRecord()" is created, and it does not have a body. The body is provided by the subclasses, it will return the card number and the name of the cardholder "student or teacher".
 An abstract method "addCard()" is created, and it does not have a body. The body is provided by the subclasses, it will notify that a card was added + card type that refers to the subclass type.
 An abstract method "Card getClone()" is created, and it returned the cloned object that the "clone()" method will clone.
 * */

abstract class Card implements Cloneable {
    protected String Cardtype;

    public abstract void showRecord();

    abstract void addCard();

    public abstract Card getClone();

    public Object clone() {
        System.out.println("Cloning ..");
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
















