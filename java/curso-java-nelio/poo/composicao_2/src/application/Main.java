package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.Comment;
import entities.Post;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		List<Post> posts = new ArrayList<>();
		
//		Comment comment1 = new Comment("Have a nice trip");
//		Comment comment2 = new Comment("Wow that's awesome!");
//		Comment comment3 = new Comment("Good night");
//		Comment comment4 = new Comment("May the Force be with you");
		
		Post post1, post2;
		
		post1 = new Post(formater.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
						"I'm going to visit this wonderful country!", 12);
		
		post1.addComment(new Comment("Have a nice trip"));
		post1.addComment(new Comment("Wow that's awesome!"));
//		post1.addComment(comment1);
//		post1.addComment(comment2);
		
		post2 = new Post(formater.parse("28/07/2018 23:14:19"), "Good night guys", 
						"See you tomorrow", 5);
		
		post2.addComment(new Comment("Good night"));
		post2.addComment(new Comment("May the Force be with you"));
//		post2.addComment(comment3);
//		post2.addComment(comment4);
		
		posts.add(post1);
		posts.add(post2);
		
		for (Post post : posts) {
			System.out.println(post);
		}
	}
}