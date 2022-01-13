package com.company;
import java.util.HashMap;
import java.util.Map;

/***

  CardsStore:
 we import the HashMap class, then Create a HashMap object "cardMap" that will store "<String, Card>" keys and values. then Add keys and values using "cardMap.put(type, card)".
 we create an object from "student" class that has "id, fullName, age, address" as variables with getters and setters, and we set value.
 in the "Card getCardType" method, we return the cardtype, the values that were saved in the hashmap and then clone it.

 * */

public class CardsStore {
        private static Map<String, Card> cardMap = new HashMap<String, Card>();

        static {
            Student student=new Student(23432,"anna hal", "25" ,"bremen");
            String name =  student.getName();
            cardMap.put("student", new StudenCard(name , 6784));
            cardMap.put("teacher", new TeacherCard("tom hase", 2322));
        }

        public static Card getCardType(String cardType) {
            return (Card) cardMap.get(cardType).clone()  ;
        }

}
