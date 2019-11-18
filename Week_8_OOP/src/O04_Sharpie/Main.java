package O04_Sharpie;

public class Main {

    public static void main(String[] args) {

        Sharpie sharpie1 = new Sharpie("blue" , 2.5f);
        Sharpie sharpie2 = new Sharpie("red" , 3.7f);
        Sharpie sharpie3 = new Sharpie("green" , 6.4f);

        sharpie1.use();
        sharpie2.use();
        sharpie3.use();
        sharpie1.use();

        System.out.println("Color: " + sharpie1.color + ", inkAmount: " + sharpie1.inkAmount + ", width: " + sharpie1.width);
        System.out.println("Color: " + sharpie2.color + ", inkAmount: " + sharpie2.inkAmount + ", width: " + sharpie2.width);
        System.out.println("Color: " + sharpie3.color + ", inkAmount: " + sharpie3.inkAmount + ", width: " + sharpie3.width);

    }

}
