package Tests;

public class History extends Test {

    @Override
    void endTest() {
        System.out.println("Time is over. Put your pens down!");
    }

    @Override
    void startTest() {
        System.out.println("You may start the history test!");
    }
}
