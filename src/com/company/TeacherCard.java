package com.company;

public class TeacherCard extends Card {
    private int id;
    private String name;

    public TeacherCard(String name, int cardno){
        this.name = name;
        this.id = cardno;
        Cardtype = "Teacher card";
        System.out.println("   Teacher cards Records  ");
        System.out.println("---------------------------------------------");
        System.out.println("Name: "+name+"\t"+"Card Number: "+ cardno);
    }

    @Override
    void addCard() { System.out.println("Teacher card added");}
    public Card getClone() { return new TeacherCard(name, id); }
    public void showRecord(){ System.out.println(id+"\t"+name+"\t"); }
}