package thirdsem.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String args[]){
        try {
            // Driver installation
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // host configuration
            String db_host = "localhost";
            String db_user = "sixdgt";
            String db_password = "1234";
            String db_name = "file_entry_system";
            String db_port = "3306";
            // jdbc:mysql://localhost:3306/file_entry_system
            String url = "jdbc:mysql://" + db_host + ":" + db_port + "/" + db_name;
            
            // connection setup
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            // creating statement
            Statement stmt = con.createStatement();
            // building query
            String sql = "INSERT INTO file_category(`file_category`)"
                    + " VALUES('Lab Report')";
            if(stmt.executeUpdate(sql)> 0){
                System.out.println("Inserted Successfully");
            } else {
                System.out.println("Something went wrong");
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
