package P01_PostIt;

public class PostIt {

    private String backGround;
    private String text;
    private String textColor;

    public PostIt(String backGround, String text, String color) {
        this.backGround = backGround;
        this.text = text;
        this.textColor = color;
    }

    public String getBackGround() {
        return backGround;
    }

    public String getText() {
        return text;
    }

    public String getTextColor() {
        return textColor;
    }
}
