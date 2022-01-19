package Tests;

public class TemplatePatternDemo {
    public static void main(String[] args) {

        Test game = new Mathematics();
        game.takeTest();
        System.out.println();
        game = new History();
        game.takeTest();
    }
}
