package Tests;

public class Mathematics extends Test {

    @Override
    void endTest() {
        System.out.println("Time is over. Put your pens down!");
    }

    @Override
    void startTest() {
        System.out.println("You may start the mathematics test!");
    }
}

