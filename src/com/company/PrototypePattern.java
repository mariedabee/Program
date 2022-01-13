package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypePattern {
    public static void main(String[] args) throws IOException {

        CardsStore.getCardType("student").addCard();
        CardsStore.getCardType("teacher").addCard();
        CardsStore.getCardType("student").addCard();
        CardsStore.getCardType("teacher").addCard();
        Card clonedCard = (Card) CardsStore.getCardType("student");
        System.out.println("card : " + clonedCard.Cardtype +"  "+ clonedCard.toString());


        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Person Id: ");
        int id=Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("Enter person Name: ");
        String name=br.readLine();
        System.out.print("\n");

        StudenCard s1=new StudenCard(name, id);
        s1.showRecord();
        System.out.println("\n");

        StudenCard s2=(StudenCard) s1.getClone();
        StudenCard s3=new StudenCard("tom holland", 555);
        s3.showRecord();



    }
}

