//package HomeWork4.task1;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//
//public class User implements Comparable<User>{
//
//    private int id;
//    private String name;
//    private List<Skill> skills = new ArrayList<>();
//
//    public User(int id, String name, Skill... skill) {
//        this.id = id;
//        this.name = name;
//        for (Skill skillItem : skill) {
//            skills.add(skillItem);
//        };
//    }
//
//    @Override
//    public int compareTo(User o) {
//        return this.skills.size()-o.skills.size();
//    }
//}
