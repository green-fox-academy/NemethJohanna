package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication
//        implements CommandLineRunner
{

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }
//
//    private PostRepository postRepository;
//
//    public RedditApplication(PostRepository postRepository) {
//        this.postRepository = postRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        Post post1 = new Post("FRIENDS (2020) Movie Teaser Trailer", "https://www.youtube.com/watch?v=Gpa5S8DgPzs");
//        Post post2 = new Post("Marriage Story | Official Trailer", "https://www.youtube.com/watch?v=BHi-a1n8t7M");
//        Post post3 = new Post("WONDER WOMAN - Official Trailer [HD]", "https://www.youtube.com/watch?v=1Q8fG0TtVAYv");
//        Post post4 = new Post("Dunkirk Trailer", "https://www.youtube.com/watch?v=F-eMt3SrfFU");
//        Post post5 = new Post("Inception (2010) Official Trailer", "https://www.youtube.com/watch?v=YoHD9XEInc0");
//        Post post6 = new Post("GREYHOUND - Official trailer (HD)", "https://www.youtube.com/watch?v=eyzxu26-Wqk");
//        Post post7 = new Post("Parasite - Official trailer (2019)", "https://www.youtube.com/watch?v=5xH0HfJHsaY");
//        Post post8 = new Post("FORD v FERRARI | Official trailer", "https://www.youtube.com/watch?v=zyYgDtY2AMY");
//        Post post9 = new Post("CAPTAIN PHILLIPS - Official International Trailer", "https://www.youtube.com/watch?v=GEyM01dAxp8");
//        Post post10 = new Post("Forrest Gump - Trailer", "https://www.youtube.com/watch?v=bLvqoHBptjg");
//        Post post11 = new Post("ONCE UPON A TIME IN HOLLYWOOD - Official Trailer (HD)", "https://www.youtube.com/watch?v=ELeMaP8EPAA");
//        Post post12 = new Post("The Red Sea Diving Resort | Official Trailer", "https://www.youtube.com/watch?v=80WflPMzAcw");
//        Post post13 = new Post("Murder Mystery | Trailer", "https://www.youtube.com/watch?v=5YEVQDr2f3Q");
//        Post post14 = new Post("The Lion King Official Trailer", "https://www.youtube.com/watch?v=7TavVZMewpY");
//        Post post15 = new Post("1917 Final Trailer (2019)", "https://www.youtube.com/watch?v=A8ajLN9RAsA");
//
//        postRepository.save(post1);
//        postRepository.save(post2);
//        postRepository.save(post3);
//        postRepository.save(post4);
//        postRepository.save(post5);
//        postRepository.save(post6);
//        postRepository.save(post7);
//        postRepository.save(post8);
//        postRepository.save(post9);
//        postRepository.save(post10);
//        postRepository.save(post11);
//        postRepository.save(post12);
//        postRepository.save(post13);
//        postRepository.save(post14);
//        postRepository.save(post15);
//
//    }
}
