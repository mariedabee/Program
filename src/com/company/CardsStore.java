package com.company;

import java.util.HashMap;
import java.util.Map;

public class CardsStore {

        private static Map<String, Card> cardMap = new HashMap<String, Card>();


        static
        {
            Student student=new Student(23432,"anna hal", "25" ,"bremen");
            String name =  student.getName();
            cardMap.put("student", new StudenCard(name , 6784));
            cardMap.put("teacher", new TeacherCard("tom hase", 2322));
        }

        public static Card getCardType(String cardType)
        {
            return (Card) cardMap.get(cardType).clone()  ;
        }

}
