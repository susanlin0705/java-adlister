import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection;


    public MySQLAdsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUsername(),
                    Config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//
//    public void getOneAd() throws SQLException{
//
//
//            String query = "INSERT INTO ads(user_id, title, description) VALUES (4, 'Hello From Ads Doa', 'this is a description')";
//            Statement stmt = connection.createStatement();
//            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = stmt.getGeneratedKeys();
//
//            rs.next();
//
//    }





    @Override
    public List<Ad> all() throws SQLException {
        List<Ad> ads = new ArrayList<>();
        String selectQuery = "SELECT * FROM ads";
        Statement statement= connection.createStatement();
        ResultSet rs = statement.executeQuery(selectQuery);

        while(rs.next()) {

            long id = rs.getLong("id");
            long userId = rs.getLong("user_id");
            String title = rs.getString("title");
            String description = rs.getString("description");

            ads.add(new Ad(id, userId, title, description));

        }

        return ads;
    }


    @Override
    public Long insert(Ad ad) throws SQLException {

        String insertQuery =
                String.format("INSERT INTO ads(user_id, title, description) VALUES ('%d', '%s', '%s')",
                ad.getUserId(), ad.getTitle(), ad.getDescription());

        System.out.println(insertQuery);

        Statement stmt = connection.createStatement();
        stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            System.out.println("Inserted a new record! New id: " + rs.getLong(1));
            return rs.getLong(1);
        }
       return null;
    }



    public static void main(String[] args) throws SQLException{

        try{
            MySQLAdsDao manager = new MySQLAdsDao();
            System.out.println("Connection Successful");
            Statement statement= manager.connection.createStatement();
            String queryString = "SELECT * FROM users";
            ResultSet results = statement.executeQuery(queryString);
            if (results != null){
                System.out.println("It's working");
                System.out.println(results);
                while (results.next()){
                    System.out.println("id: " + results.getLong("id"));
                    System.out.println("name: " + results.getString("username"));
                }
            }
            if (statement.execute(queryString)){
                System.out.println("Statement executed successfully");
            }else{
                System.out.println("Statement not working ");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

}
