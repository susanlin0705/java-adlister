import java.sql.*;

import com.mysql.cj.jdbc.Driver;

//public class MySQLJDBCTest {

//    public static Connection connect() throws SQLException{
//        DriverManager.registerDriver(new Driver());
//        Connection connection = DriverManager.getConnection (
//                Config.getUrl(),
//                Config.getUsername(),
//                Config.getPassword()
//        );
//        return connection;
//    }
//
//    public static void main(String[] args) throws SQLException{
//        Connection connection =connect();
//        try{
////            Connection connection = connect();
//            System.out.println("Connection Successful");
//            Statement statement= connection.createStatement();
//            String queryString = "SELECT * FROM albums";
//            ResultSet results = statement.executeQuery(queryString);
//            if (results != null){
//                System.out.println("It's working");
//                System.out.println(results);
//                while (results.next()){
//                    System.out.println("id: " + results.getLong("id"));
//                    System.out.println("name: " + results.getString("artist_name"));
//                    System.out.println("album_name: " + results.getString("album_name")) ;
//                }
//            }
//            if (statement.execute(queryString)){
//                System.out.println("Statement executed successfully");
//            }else{
//                System.out.println("Statement not working ");
//            }
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
//
//}
