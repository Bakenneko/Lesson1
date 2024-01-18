package Homework2.task4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
class Comment {
    private int id;
    private String name;
    private String email;
    private String body;

    public Comment(int id, String name, String email, String body) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public void displayCommentInfo() {
        System.out.println("Comment #" + id + ": " + name + " (" + email + ")\n" + body);
    }
}
