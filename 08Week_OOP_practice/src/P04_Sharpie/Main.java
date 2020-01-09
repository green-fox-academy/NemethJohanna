package P04_Sharpie;

public class Main {
    /*Create Sharpie class
We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
When creating one, we need to specify the color and the width
Every sharpie is created with a default 100 as inkAmount
We can use() the sharpie objects
which decreases inkAmount*/

    public static void main(String[] args) {

        Sharpie sharpie = new Sharpie("blue", 0.5f);
        Sharpie sharpie2 = new Sharpie("green", 0.7f);
        Sharpie sharpie3 = new Sharpie("yellow", 1.7f);

        sharpie.use();
        sharpie2.use();
        sharpie3.use();

        System.out.println(sharpie.inkAmount);
        System.out.println(sharpie2.inkAmount);
        System.out.println(sharpie3.inkAmount);
    }
}
