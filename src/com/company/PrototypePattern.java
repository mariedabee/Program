package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypePattern {

    public static void main(String[] args) throws IOException {

        CardsStore.getCardType("student").addCard();
        CardsStore.getCardType("teacher").addCard();

        Card clonedCard = (Card) CardsStore.getCardType("student");
        System.out.println("card : " + clonedCard.Cardtype +"  "+ clonedCard.toString());

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Student student = new Student();
        System.out.print("Enter Person Id: ");
        student.setSid(Integer.parseInt(br.readLine()));
        System.out.print("\n");
        System.out.print("Enter person Name: ");
        student.setName(br.readLine());
        System.out.print("\n");
        System.out.print("Enter person age: ");
        student.setAge(br.readLine());
        System.out.print("\n");
        System.out.print("Enter person adress: ");
        student.setAddress(br.readLine());
        System.out.print("\n");

        StudenCard s1=new StudenCard(student.getName(), student.getId());
        s1.showRecord();
        System.out.println("\n");

        System.out.print("cloning the information you entered: ");
        StudenCard s2=(StudenCard) s1.getClone();
        //StudenCard s3=new StudenCard("tom holland", 555);
        s2.showRecord();

        TeacherCard t1 = new TeacherCard("teacher: daniel olda",2);
        t1.showRecord();



    }
}

