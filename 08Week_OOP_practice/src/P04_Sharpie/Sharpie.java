package P04_Sharpie;

public class Sharpie {

    String color;
    Float width;
    Float inkAmount;

    public Sharpie(String color, Float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100f;
    }

    public void use(){
        this.inkAmount--;
    }
}
