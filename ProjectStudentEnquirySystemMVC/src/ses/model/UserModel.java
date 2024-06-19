package ses.model;

/**
 * This class will hold the information of User
 */
public class UserModel {
    // attributes of user
    private int user_id;
    private String full_name;
    private String username;
    private String password;
    
    // creating getter and setter method for user attributes
    /**
     * @return user_id
     * this method will return data of user_id
     */
    public int getUserId(){
        return this.user_id;
    }
    /**
     * @param param_user_id
     * this method will store data in user_id
     */
    public void setUserId(int param_user_id){
        this.user_id = param_user_id;
    }
    
    /**
     * @return full_name
     * this method will return data of full_name
     */
    public String getFullName(){
        return this.full_name;
    }
    /**
     * @param param_full_name
     * this method will store data in full_name
     */
    public void setFullName(String param_full_name){
        this.full_name = param_full_name;
    }
    
    /**
     * @return username
     * this method will return data of username
     */
    public String getUsername(){
        return this.username;
    }
    /**
     * @param param_username
     * this method will store data in username
     */
    public void setUsername(String param_username){
        this.username = param_username;
    }
    
    /**
     * @return password
     * this method will return data of password
     */
    public String getPassword(){
        return this.password;
    }
    /**
     * @param param_password
     * this method will store data in password
     */
    public void setPassword(String param_password){
        this.password = param_password;
    }
}
