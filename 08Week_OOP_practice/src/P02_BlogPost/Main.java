package P02_BlogPost;

public class Main {
    /*Create a BlogPost class that has
    an authorName
    a title
    a text
    a publicationDate
    Create a few blog post objects:
    "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
    Lorem ipsum dolor sit amet.
    "Wait but why" titled by Tim Urban posted at "2010.10.10."
    A popular long-form, stick-figure-illustrated blog about almost everything.
    "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
    Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.*/
    public static void main(String[] args) {

        BlogPost post1 = new BlogPost("John Doe", "Lorem Ipsum", "2000.05.04", "Lorem ipsum dolor sit amet.\n");
        System.out.printf("%s titled by %s posted at %s.\n", post1.title, post1.authorName, post1.publicationDate);
        System.out.println(post1.text);

        BlogPost post2 = new BlogPost("Tim Urban", "Wait but why", "2010.10.10", "A popular long-form, stick-figure-illustrated blog about almost everything.\n\n");
        System.out.printf("%s titled by %s posted at %s.\n", post2.title, post2.authorName, post2.publicationDate);
        System.out.println(post2.text);


    }

}
