package ses.controller;
import ses.dao.UserDAO;
import ses.dao.impl.UserDAOImpl;

public class UserController {
    public String username;
    public String password;
    public UserDAO ud;
    /**
     * @param uc
     * @return status
     */
    public boolean doLogin(UserController uc){
        boolean status = false;
        ud = new UserDAOImpl();
        if(ud.login(uc)){
            status = true;
        }
        return status;
    }
}
