package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awsome!");

        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to new Zealand",
                "IM going to visit this wonderful country",
                12);
        p1.addComment(c1);
        p1.addComment(c2);
        System.out.println(p1);
        System.out.println("___________________________________________________________");
        System.out.println();


        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("may the Force be with you");

        Post p2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "good night guys","See you tomorrow¹",
                5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);
    }
}
