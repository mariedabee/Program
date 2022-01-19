# Program 
## Design patterns
###### Team: Mariam Bari, Boris Kamstra



### A. Creational design patterns:
 ####  1. Prototype Design Pattern, Code explanation:
![This is an image](/../main/UML/Prototype.png)
      1.1 Card, StudentCard, TeacherCard:

Abstract class Card (parent class): this class represents the prototype for this pattern.
The "StudentCard", and "TeacherCard" represent the Prototype registry of this pattern. They  are subclasses that can access the parent "Card" class with its protected attribute "Cardtype", each subclass will set a value to the cardtype: Cardtype= "student" or "teacher" .
An abstract method "showRecord()" is created, and it does not have a body. The body is provided by the subclasses, it will return the card number and the name of the cardholder "student or teacher".   
An abstract method "addCard()" is created, and it does not have a body. The body is provided by the subclasses, it will notify that a card was added + card type that refers to the subclass type.
An abstract method "Card getClone()" is created, and it returned the cloned object that the "clone()" method will clone.

      1.2. CardsStore:

   This class will clone the cards. we import the HashMap class, then Create a HashMap object "cardMap" that will store "<String, Card>" keys and values. then Add keys and values using "cardMap.put(type, card)".
   we create an object from "student" class that has "id, fullName, age, address" as variables with getters and setters, and we set value.
   In the "Card getCardType" method, we return the cardtype, the values that were saved in the hash map and then clone it.

      1.3. PrototypePattern: 

it represents the client in this pattern.
   it will call getCardType where the type is "student" and add the returned value using "addCard", then we clone the value that match type “student".
   next we create an object from BufferedReader class which simplifies reading text from a character input stream. It buffers the characters in order to enable efficient reading of text data.
   student object and the values for its variables will be entered by the user (setters).
   we then create a studentcard with values that were entered by the user "student.getName(), student.getId()", we call "showRecord" method to check if it was successful.
   next we clone the card with the entered data and save it in a new variable "s2". at the end we create a teachercard to test it as well with "showRecord".


 ####  2. Factory design pattern:
![This is an image](/../main/UML/factory.png)

A factory design pattern is often implemented by defining an interface. Then, based on said interface, child(sub) classes are created. The child classes have the possibility to alter and override the types of the interface.
Uses
The main use of the factory design pattern, is when you want to have the possibility to easily add and remove instantiations of the main class, without having to alter the entire code base.

      2.1. Students:

This interface serves as the base for the several student sub classes.

     2.2. Dutch, Exchange, International:

The three different students that exist.

    2.3 FactoryPatternDemo:
    
This class constructs the final product. It gathers the available information about the students from the different classes and creates the student.
    
    2.4 StudentFactory:

This class checks if the student type is Dutch, international or exchange. Based in the input, it returns the right student class. If it’s none of those three, it returns null.

----------------------------------------------

### B. structural design pattern
####  1. Facade pattern
![This is an image](/../main/UML/Facade.png)

I implemented the pattern to a school's cantine registery, the user will choose in the console what to order, and depending on that it, the program will print the price and item number.

      1.1 CashRegister:

Created a “CashRegister” interface, with 2 methods that return the purchased article number and its price.
This class represents “facade” for this pattern.

      1.2 sandwiches, drinks, warmMeals:

Created a "sandwiches, drinks, warmMeals”  implementation classes that will implement “CashRegister” interface, and define prices and item numbers.
These classes represents “subclasses” for this pattern.

      1.3 RegisterKeeper:

Created a “RegisterKeeper” concrete class that will use “CashRegister” interface.
RegisterKeeper class uses the concrete classes to delegate user calls to these classes. “FacadePatternClient”, our demo class, will use “RegisterKeeper” class to show the results.

      1.4 FacadePatternClient:
      
Created a client “FacadePatternClient” that can purchase the items from CashRegister through RegisterKeeper. This class represents the “client” for this pattern.

#### 2. Proxy pattern
![This is an image](/../main/UML/proxy.png)

For this pattern, I created a small program that checks whether the right teacher
is trying to add a new grade. There is only one correct teacher that can add a
new grade, anyone else will be denied access.

      2.1 Grade:
This is the interface for this program. It contains only one method: the add() method. Other classes will
later add functionality to this method by overriding it. 

      2.2 Teacher:
This is the teacher class. It contains one variable: the 'name' variable. This variable is used to check
the teacher. It also contains setName() and getName() methods. 

      2.3 RealGrade:
This class implements the Grade interface and overrides the add() method. In this class, the add() method
is only accessible to the right teacher. When the right teacher accesses it, it prints a welcome message
in the terminal. 

      2.4 GradeProxy:
This class implements the Grade interface and overrides the add() method as well. It has two variables: 
'teacher' and 'grade'. Within the add() method, it checks whether the name of a teacher grants the teacher
access. If a teacher's name has access, a welcome message will be displayed in the terminal. If a teacher
doesn't have access, it displays that in the terminal. 


----------------------------------------------
### C. Behavioural design pattern:
####  1. Strategy pattern
![This is an image](/../main/UML/Strategy.png)


      1.1 Strategy:

I created a new package "Management", a new interface "Strategy" that will manage “Courses” . The program will allow you to update/add/delete courses.

      1.2. Course:

“Course” class has “courseName, teacher, noOfStudents” as variables with getters setters, and “addStudent(Student newStudent)” that will allow you to add a new student to a specific course. (In order to use the student class we import it “import com.company.Student;”).
 
      1.3 AddCourse, UpdateCourse, DeleteCourse:
   
Created a “AddCourse, UpdateCourse, DeleteCourse” classes that will implement “Strategy” interface, and give logic to the method “ManageCourses(String courseName, int courseID)”.

      1.4 Context:
   
Created a “Context” class that will ask from “Strategy” interface to execute the type of strategy.

      1.5 StrategyPatternDemo:

   the tester for our program, it will set the course variables based on the user’s input. We then create a new context with the following classes “AddCourse, UpdateCourse, DeleteCourse”.
   context = new Context(new UpdateCourse(course, noOfStudents, courseName, student));

####  2. Template Method pattern
![This is an image](/../main/UML/TemplateMethod.png)

      2.1 Test:
This is the abstract Test class. It contains three methods. The startTest() method to start a test, the endTest() method to end a test. This class also contains the takeTest() method. This is the template method and calls the startTest() and endTest() methods as well. 

      2.2 Mathematics, History:
These are the two concrete implementations of the Test class. They each represent a different test for a different subject. They each override the startTest() and endTest() methods and add their own content to said method. 

      2.3 TemplatePatternDemo:
This class contains the main() method. This method creates both a Mathematics and History object and calls the takeTest() method. When this method is called, the concrete classes will print their respective test messages. It starts and ends the test when called.

