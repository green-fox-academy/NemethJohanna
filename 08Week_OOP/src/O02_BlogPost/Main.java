package O02_BlogPost;

public class Main {
    public static void main(String[] args) {

    BlogPost post1 = new BlogPost("John Doe" , "\"Lorem Ipsum\"" , "Lorem ipsum dolor sit amet. " , "2000.05.04.");
    BlogPost post2 = new BlogPost("Tim Urban" , "Wait but why" , "A popular long-form, stick-figure-illustrated blog about almost everything." , "2010.10.10.");
    BlogPost post3 = new BlogPost("William Turton" , "\"One Engineer Is Trying to Get IBM to Reckon With Trump\"" , "\"Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.\n\"" +
            "When I asked to take his picture outside one of IBM’s New York City offices,\n" +
            "he told me that he wasn’t really into the whole organizer profile thing." , "2017.03.28.");

        System.out.println(post1.title + " titled by: " + post1.authorName + ", posted at " + post1.date);
        System.out.println(post1.text);
        System.out.println();

        System.out.println(post2.title + " titled by: " + post2.authorName + ", posted at " + post2.date);
        System.out.println(post2.text);
        System.out.println();

        System.out.println(post3.title + " titled by: " + post3.authorName + ", posted at " + post3.date);
        System.out.println(post3.text);
        System.out.println();

        //System.out.println(post1.text);



    }
}
