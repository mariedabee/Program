package com.company;

import java.util.HashMap;
import java.util.Map;

public class CardsStore {

        private static Map<String, Card> cardMap = new HashMap<String, Card>();

        static
        {
            cardMap.put("student", new StudenCard("marie dabee", 6784));
            cardMap.put("teacher", new TeacherCard("tom hase", 2322));
        }

        public static Card getCardType(String cardType)
        {
            return (Card) cardMap.get(cardType).clone()  ;
        }

}
