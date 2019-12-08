package O01_PostIt;

import java.awt.*;

public class Main {
    public static void main (String[] args){

        PostIt postIt1 = new PostIt(Color.ORANGE, "Idea 1", Color.BLUE);
        PostIt postIt2 = new PostIt(Color.PINK, "Awesome" , Color.BLACK);
        PostIt postIt3 = new PostIt(Color.YELLOW, "Superb!" , Color.GREEN);

        System.out.println(postIt1.textColor + postIt1.text + postIt1.backgroundColor);
        System.out.println(postIt2.textColor + postIt2.text + postIt2.backgroundColor);
        System.out.println(postIt3.textColor + postIt3.text + postIt3.backgroundColor);



    }
}
