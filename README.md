
Creational design pattern: 
Prototype Design Pattern, Code explanation:
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
----------------------------------------------
structural design pattern
Facade pattern
I implemented the pattern to a school's cantine registery, the user will choose in the console what to order, and depending on that it, the program will print the price and item number.
1.CashRegister:
Created a “CashRegister” interface, with 2 methods that return the purchased article number and its price.
This class represents “facade” for this pattern.
2. sandwiches, drinks, warmMeals:
Created a "sandwiches, drinks, warmMeals”  implementation classes that will implement “CashRegister” interface, and define prices and item numbers.
These classes represents “subclasses” for this pattern.
3. RegisterKeeper:
Created a “RegisterKeeper” concrete class that will use “CashRegister” interface.
RegisterKeeper class uses the concrete classes to delegate user calls to these classes. “FacadePatternClient”, our demo class, will use “RegisterKeeper” class to show the results.
4. FacadePatternClient:
Created a client “FacadePatternClient” that can purchase the items from CashRegister through RegisterKeeper.
This class represents the “client” for this pattern.
----------------------------------------------

behavioural design pattern:
Strategy Design Pattern, Code explanation:
1. Strategy:
    I created a new package "Management", a new interface "Strategy" that will manage “Courses” . The program will allow you to update/add/delete courses.
2. Course:
   “Course” class has “courseName, teacher, noOfStudents” as variables with getters setters, and “addStudent(Student newStudent)” that will allow you to add a new student to a specific course. (In order to use the student class we import it “import com.company.Student;”).
3. AddCourse, UpdateCourse, DeleteCourse:
   Created a “AddCourse, UpdateCourse, DeleteCourse” classes that will implement “Strategy” interface, and give logic to the method “ManageCourses(String courseName, int courseID)”.
4. Context:
   Created a “Context” class that will ask from “Strategy” interface to execute the type of strategy.
5. StrategyPatternDemo:
   the tester for our program, it will set the course variables based on the user’s input. We then create a new context with the following classes “AddCourse, UpdateCourse, DeleteCourse”.
   context = new Context(new UpdateCourse(course, noOfStudents, courseName, student));

