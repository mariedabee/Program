package com.company;

public class StudenCard extends Card {

    private int id;
    private String student =  new Student().getName();

    public StudenCard(String student, int cardno) {
        this.id=cardno;
        this.student=student;
        Cardtype= "student";
        System.out.println("   Student cards Records  ");
        System.out.println("---------------------------------------------");
        System.out.println("student: "+ student+"\t"+"Card Number: "+ cardno);
    }

    @Override
    void addCard() {  System.out.println("student card added"); }
    public Card getClone() { return new StudenCard(student, id); }
    public void showRecord(){ System.out.println(id+"\t"+student+"\t"); }
}


