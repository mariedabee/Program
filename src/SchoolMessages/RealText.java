package SchoolMessages;

public class RealText implements Text {
    private String text;

    public RealText(String text){
        this.text = text;
        loadFromDisc(text);
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + text);
    }

    private void loadFromDisc(String fileName){
        System.out.println("Loading: " + text);
    }
}
