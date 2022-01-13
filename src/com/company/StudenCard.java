package com.company;

public class StudenCard extends Card {

    private int id;
    private String name;
    public StudenCard(String name, int cardno)
        {
            System.out.println("   Student cards Records  ");
            System.out.println("---------------------------------------------");
            System.out.println("Name: "+ name+"\t"+"Card Number: "+ cardno);

            this.id=cardno;
            this.name=name;
            Cardtype= "student";
        }

        @Override
        void addCard()
        {
            System.out.println("student card added");
        }

    @Override
    public Card getClone() {

        return new StudenCard(name, id);
    }
    public void showRecord(){

        System.out.println(id+"\t"+name+"\t");
    }
}


