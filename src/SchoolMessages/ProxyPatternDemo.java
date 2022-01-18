package SchoolMessages;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Text text = new ProxyText("abc");

        //text will be loaded from disk
        text.display();

        //text will not be loaded from disk
        text.display();
    }
}
