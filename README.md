
Prototype Design Pattern (crational pattern), Code explanation:
1. Card, StudentCard, TeacherCard:
   Abstract class Card (parent class): this class represents the prototype for this pattern.
   The "StudentCard", and "TeacherCard" represent the Prototype registry of this pattern. They  are subclasses that can access the parent "Card" class with its protected attribute "Cardtype", each subclass will set a value to the cardtype: Cardtype= "student" or "teacher" .
   An abstract method "showRecord()" is created, and it does not have a body. The body is provided by the subclasses, it will return the card number and the name of the cardholder "student or teacher".   
   An abstract method "addCard()" is created, and it does not have a body. The body is provided by the subclasses, it will notify that a card was added + card type that refers to the subclass type.
   An abstract method "Card getClone()" is created, and it returned the cloned object that the "clone()" method will clone.
2. CardsStore:
   This class will clone the cards. we import the HashMap class, then Create a HashMap object "cardMap" that will store "<String, Card>" keys and values. then Add keys and values using "cardMap.put(type, card)".
   we create an object from "student" class that has "id, fullName, age, address" as variables with getters and setters, and we set value.
   In the "Card getCardType" method, we return the cardtype, the values that were saved in the hash map and then clone it.
3. PrototypePattern:  it represents the client in this pattern.
   it will call getCardType where the type is "student" and add the returned value using "addCard", then we clone the value that match type “student".
   next we create an object from BufferedReader class which simplifies reading text from a character input stream. It buffers the characters in order to enable efficient reading of text data.
   student object and the values for its variables will be entered by the user (setters).
   we then create a studentcard with values that were entered by the user "student.getName(), student.getId()", we call "showRecord" method to check if it was successful.
   next we clone the card with the entered data and save it in a new variable "s2". at the end we create a teachercard to test it as well with "showRecord".

