package P01_PostIt;

public class Main {
    /*Create a PostIt class that has
a backgroundColor
a text on it
a textColor
Create a few example post-it objects:
an orange with blue text: "Idea 1"
a pink with black text: "Awesome"
a yellow with green text: "Superb!"*/

    public static void main(String[] args) {

        PostIt postIt = new PostIt("orange", "Idea 1", "blue");
        PostIt postIt2 = new PostIt("pink", "Awesome", "black");
        PostIt postIt3 = new PostIt("yellow", "Superb", "green");

        System.out.print(postIt.getBackGround() + postIt.getText() + postIt.getTextColor() + "\n");
        System.out.print(postIt2.getBackGround() + postIt2.getText() + postIt2.getTextColor() + "\n");
        System.out.print(postIt3.getBackGround() + postIt3.getText() + postIt3.getTextColor() + "\n");

    }

}
