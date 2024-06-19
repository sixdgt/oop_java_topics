package ses.dbconfig;
// importing required package
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * here this class will handle all the database connection configuration we will
 * implement singleton design pattern
 */
public class DbConnection {
    private static final String DB_USER = "sixdgt";
    private static final String DB_PASSWORD = "1234";
    private static final String DB_NAME = "project_ses";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/" + DB_NAME;
    static Connection CON = null;
    Statement STMT = null;
    
    /**
     * @return DbConnection Object
     * this method will return the Connection object
     * handles the database connection
     */
    public static DbConnection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            CON = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return new DbConnection();
    }
    
    /**
    * Select Query builder class
    * @param sql
    * @return rs - rs is a ResultSet object. So, it will hold data retrieve from DB
    */
    public ResultSet selectQueryBuilder(String sql){
        ResultSet rs = null;
        try {
            STMT = CON.createStatement();
            rs = STMT.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return rs;
    }
    /**
     * @param sql
     * Note: iud stands for i = insert, u = update and d = delete
     * @return status
     * this method helps to build insert, update and delete query
     */
    public boolean iudQueryBuilder(String sql){
        boolean status = false;
        try {
            STMT = CON.createStatement();
            if(STMT.executeUpdate(sql) == 1){
                status = true;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return status;
    }
}
