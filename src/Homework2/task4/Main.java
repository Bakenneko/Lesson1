//package Homework2.task4;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//
//        List<Post> posts = new ArrayList<>();
//        List<Comment> comments = new ArrayList<>();
//
//        posts.add(new Post(1, "sunt aut facere repellat provident occaecati...", "quia et suscipit..."));
//        posts.add(new Post(2, "qui est esse", "est rerum tempore vitae..."));
//        posts.add(new Post(3, "ea molestias quasi exercitationem repellat qui ipsa sit aut", "et iusto sed quo iure..."));
//
//        comments.add(new Comment(1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi..."));
//        comments.add(new Comment(2, "quo vero reiciendis velit similique earum", "Jayne_Kuhic@sydney.com", "est natus enim nihil..."));
//        comments.add(new Comment(3, "odio adipisci rerum aut animi", "Nikita@garfield.biz", "quia molestiae reprehenderit..."));
//        comments.add(new Comment(7, "repellat consequatur praesentium vel minus molestias voluptatum", "Dallas@ole.me", "maiores sed dolores..."));
//        comments.add(new Comment(8, "et omnis dolorem", "Mallory_Kunze@marie.org", "ut voluptatem corrupti velit..."));
//        comments.add(new Comment(13, "aut inventore non pariatur sit vitae voluptatem sapiente", "Kariane@jadyn.tv", "fuga eos qui dolor rerum..."));
//        comments.add(new Comment(14, "et officiis id praesentium hic aut ipsa dolorem repudiandae", "Nathan@solon.io", "vel quae voluptas qui exercitationem..."));
//        comments.add(new Comment(15, "debitis magnam hic odit aut ullam nostrum tenetur", "Maynard.Hodkiewicz@roberta.com", "nihil ut voluptates blanditiis..."));
//
//        for (Comment comment : comments) {
//            for (Post post : posts) {
//                if (comment.getId() == post.getId()) {
//                    post.addComment(comment);
//                }
//            }
//        }
//
//        for (Post post : posts) {
//            post.displayPostInfo();
//        }
//    }
//}
//
