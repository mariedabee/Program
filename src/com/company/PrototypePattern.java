package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/***
  PrototypePattern:
 it represents the client in this pattern.
 it will call getCardType where the type is "student" and add the returned value using "addCard", then we clone the value that match type "student".
next we create an object from BufferedReader class which simplifies reading text from a character input stream. It buffers the characters in order to enable efficient reading of text data.
student object and the values for its variables will be entered by the user (setters).
 we then create a studentcard with values that were entered by the user "student.getName(), student.getId()", we call "showRecord" method to check if it was successful.
 next we clone the card with the entered data and save it in a new variable "s2". at the end we create a teachercard to test it as well with "showRecord".

 * **/


public class PrototypePattern {

    public static void main(String[] args) throws IOException {
        CardsStore.getCardType("student").addCard();
        CardsStore.getCardType("teacher").addCard();

        Card clonedCard = (Card) CardsStore.getCardType("student");
        System.out.println("card type is: " + clonedCard.Cardtype );


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

