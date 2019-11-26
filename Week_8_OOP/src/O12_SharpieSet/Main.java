package O12_SharpieSet;

import O04_Sharpie.Sharpie;

public class Main {
    public static void main(String[] args) {
        /*
        Reuse your Sharpie class
        Create SharpieSet class
            - it contains a list of Sharpie
            - countUsable() -> sharpie is usable if it has ink in it
            - removeTrash() -> removes all unusable sharpies
        */

        SharpieSet sharpieSet = new SharpieSet();

        Sharpie sharpie1 = new Sharpie("blue" , 2.5f);
        Sharpie sharpie2 = new Sharpie("red" , 3.7f);
        Sharpie sharpie3 = new Sharpie("green" , 6.4f);
        Sharpie sharpie4 = new Sharpie("black" , 5.4f);
        Sharpie sharpie5 = new Sharpie("pink" , 6.2f);
        Sharpie sharpie6 = new Sharpie("orange" , 3.9f);
        Sharpie sharpie7 = new Sharpie("brown" , 4.4f);

    }
}
