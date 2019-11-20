package OP04_Sharpie;

public class Main {
    public static void main(String[] args) {
        /*Create Sharpie class
            - We should know about each sharpie their
                + color (which should be a string),
                + width (which will be a floating point number),
                + inkAmount (another floating point number)
            - When creating one, we need to specify the color and the width
            - Every sharpie is created with a default 100 as inkAmount
            - We can use() the sharpie objects
                * which decreases inkAmount*/

        Sharpie sharpie1 = new Sharpie("blue", 6.5f);
        Sharpie sharpie2 = new Sharpie("green", 5.2f);
        Sharpie sharpie3 = new Sharpie("red", 3.6f);
        Sharpie sharpie4 = new Sharpie("yellow", 4.2f);
        Sharpie sharpie5 = new Sharpie("brown", 4.7f);

        sharpie1.use();
        sharpie4.use();
        sharpie4.use();
        sharpie1.use();
        sharpie1.use();
        sharpie3.use();
        sharpie3.use();
        sharpie3.use();
        sharpie3.use();
        sharpie3.use();
        sharpie3.use();

        System.out.println("Sharpie 1 ink amount is: " + sharpie1.inkAmount);
        System.out.println("Sharpie 2 ink amount is: " + sharpie2.inkAmount);
        System.out.println("Sharpie 3 ink amount is: " + sharpie3.inkAmount);
        System.out.println("Sharpie 4 ink amount is: " + sharpie4.inkAmount);
        System.out.println("Sharpie 5 ink amount is: " + sharpie5.inkAmount);

    }
}
