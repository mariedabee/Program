package SchoolMessages;

public class ProxyText implements Text {
    private RealText realText;
    private String text;

    public ProxyText(String text){
        this.text = text;
    }

    @Override
    public void display() {
        if(realText == null){
            realText = new RealText(text);
        }
        realText.display();
    }
}
