package O04_Sharpie;

public class Sharpie {
    public int inkAmount;

    /*Create Sharpie class
We should know about each sharpie their
 - color (which should be a string),
 - width (which will be a floating point number),
 - inkAmount (another floating point number)

When creating one, we need to specify the color and the width
Every sharpie is created with a default 100 as inkAmount
We can use() the sharpie objects
which decreases inkAmount*/


        String color;
        float width;

        public Sharpie(){
            this.inkAmount = 100;
        }

        public Sharpie(String color, float width){
            this.color = color;
            this.width = width;
            this.inkAmount = 100;
        }

        public void use(){
            inkAmount--;
        }
}
