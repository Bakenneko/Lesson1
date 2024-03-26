//package Homework5.jdbc;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//
//    public static void main(String[] args) throws SQLException {
//
//        Connection connection = DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/world",
//                "root",
//                "root");
//
//        PreparedStatement preparedStatement = connection.prepareStatement("select * from mytable");
//        ResultSet resultSet = preparedStatement.executeQuery();
//
//        List<Mytable> mytableList = new ArrayList<>();
//        while (resultSet.next()) {
//            int id = resultSet.getInt(1);
//            String dest = resultSet.getString("dest");
//            String country = resultSet.getString("country");
//            mytableList.add(new Mytable(id,dest,country));
//        }
//
//        mytableList.stream().limit(100).forEach(System.out::println);
//
//
//        connection.close();
//    }
//}
