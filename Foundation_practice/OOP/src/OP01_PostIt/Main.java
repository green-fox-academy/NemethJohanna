package OP01_PostIt;

import java.awt.*;

public class Main {
    /*
    Create a PostIt class that has
        * a backgroundColor
        * a text on it
        * a textColor
     Create a few example post-it objects:
        * an orange with blue text: "Idea 1"
        * a pink with black text: "Awesome"
        * a yellow with green text: "Superb!"
     */

    public static void main(String[] args) {

        PostIt postIt1 = new PostIt("orange", "Idea 1", "blue");
        PostIt postIt2 = new PostIt("pink", "Awesome", "black");
        PostIt postIt3 = new PostIt("yellow", "Superb", "green");

        System.out.println("Background color is: " + postIt1.color + ", text is: \"" + postIt1.text + "\", textColor is: " + postIt1.textColor);
        System.out.println("Background color is: " + postIt2.color + ", text is: \"" + postIt2.text + "\", textColor is: " + postIt2.textColor);
        System.out.println("Background color is: " + postIt3.color + ", text is: \"" + postIt3.text + "\", textColor is: " + postIt3.textColor);

    }
}
