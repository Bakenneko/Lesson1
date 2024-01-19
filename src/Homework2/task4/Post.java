//package Homework2.task4;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//import java.util.ArrayList;
//import java.util.List;
//@NoArgsConstructor
//@Getter
//class Post {
//    private int id;
//    private String title;
//    private String body;
//    private List<Comment> comments;
//
//    public Post(int id, String title, String body) {
//        this.id = id;
//        this.title = title;
//        this.body = body;
//        this.comments = new ArrayList<>();
//    }
//
//    public void addComment(Comment comment) {
//        comments.add(comment);
//    }
//
//    public void displayPostInfo() {
//        System.out.println("Post #" + id + ": " + title + "\n" + body);
//        System.out.println("Comments:");
//        for (Comment comment : comments) {
//            comment.displayCommentInfo();
//        }
//        System.out.println("----------------------------");
//    }
//}
