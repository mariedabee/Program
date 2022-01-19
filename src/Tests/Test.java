package Tests;

public abstract class Test {
//    abstract void initialize();
    abstract void startTest();
    abstract void endTest();

    //template method
    public final void takeTest(){

        //start test
        startTest();

        //end test
        endTest();
    }
}

