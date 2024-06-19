package ses.dao.impl;

import ses.controller.UserController;
import ses.dao.UserDAO;
import ses.model.UserModel;
import ses.dbconfig.DbConnection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOImpl implements UserDAO {

    DbConnection con;

    public UserDAOImpl() {
        con = DbConnection.getConnection();
    }

    @Override
    public boolean login(UserController uc) {
        boolean status = false;
        UserModel um = new UserModel();
        String sql = "SELECT * FROM user WHERE username='" + uc.username + "'";
        ResultSet rs = con.selectQueryBuilder(sql);
        try {
            while (rs.next()) {
                um.setUsername(rs.getString("username"));
                um.setPassword(rs.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        if (um.getUsername() != null || um.getPassword() != null) {
            if (um.getUsername().equals(uc.username) && um.getPassword().equals(uc.password)) {
                status = true;
            }
        }
        return status;
    }
}
