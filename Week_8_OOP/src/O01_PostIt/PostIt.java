package O01_PostIt;

import java.awt.*;

public class PostIt {
    /*Create a PostIt class that has
            a backgroundColor
            a text on it
            a textColor
            Create a few example post-it objects:
    an orange with blue text: "Idea 1"
    a pink with black text: "Awesome"
    a yellow with green text: "Superb!"*/

    public Color backgroundColor;
    public String text;
    public Color textColor;

   public PostIt(){

   }
   public PostIt(Color color, String text, Color textcolor){

   this.backgroundColor = color;
   this.text = text;
   this.textColor = textcolor;


    }

}
