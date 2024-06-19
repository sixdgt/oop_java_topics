package thirdsem.unitfour.examples.cases;

public class Student {
    private String name;
    protected String email;
    
    // access method
    // @return String
    public String getName(){
        return this.name;
    }
    
    // @param param_name
    public void setName(String param_name){
        this.name = param_name;
    }
    
    // @return String
    public String getEmail(){
        return this.email;
    }
    
    // @param param_email
    public void setEmail(String param_email){
        this.email = param_email;
    }
}
