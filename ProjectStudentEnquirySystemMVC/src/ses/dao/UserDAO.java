package ses.dao;

import ses.controller.UserController;
/**
 *
 * @author Mangal Tamang
 */
public interface UserDAO {
    
    public abstract boolean login(UserController uc);
}
