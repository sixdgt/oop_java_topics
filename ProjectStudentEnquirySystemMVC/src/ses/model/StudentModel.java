package ses.model;
/**
 * This class will hold the data of StudentTable
 */
public class StudentModel {
    // defining private attributes
    private int student_id;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String email;
    private String contact;
    private String dob;
    private String parent_detail;
    private String academic_level;
    private String academic_grade;
    private String academic_stream;
    
    // creating access modifier methods for private attributes
    /**
     * @return student_id
     * this method will return the data of student id
    */
    public int getStudentId(){
        return this.student_id;
    }
    /**
     * @param param_student_id
     * this method will store data in student_id
    */
    public void setStudentId(int param_student_id){
        this.student_id = param_student_id;
    }
    
    /**
     * @return first_name
     * this method will return data of first_name
    */
    public String getFirstName(){
        return this.first_name;
    }
    
    /**
     * @param param_first_name
     * this method will store data in first_name
    */
    public void setFirstName(String param_first_name){
        this.first_name = param_first_name;
    }
    
    /**
     * @return middle_name
     * this method will return data of middle_name
     */
    public String getMiddleName(){
        return this.middle_name;
    }
    
    /**
     * @param param_middle_name
     * this method will store data in middle_name
     */
    public void setMiddleName(String param_middle_name){
        this.middle_name = param_middle_name;
    }
    
    /**
     * @return last_name
     * this method will return data of last_name
     */
    public String getLastName(){
        return this.last_name;
    }
    
    /**
     * @param param_last_name
     * this method will store data in last_name
     */
    public void setLastName(String param_last_name){
        this.last_name = param_last_name;
    }
    
    /**
     * @return email
     * this method will return data of email
     */
    public String getEmail(){
        return this.email;
    }
    
    /**
     * @param param_email
     * this method will store data in email
     */
    public void setEmail(String param_email){
        this.email = param_email;
    }
    
    /**
     * @return contact
     * this method will return data of contact
     */
    public String getContact(){
        return this.contact;
    }
    
    /**
     * @param param_contact
     * this method will store data in contact
     */
    public void setContact(String param_contact){
        this.contact = param_contact;
    }
    
    /**
     * @return dob
     * this method will return data of dob
     */
    public String getDOB(){
        return this.dob;
    }
    
    /**
     * @param param_dob
     * this method will store data in dob
     */
    public void setDOB(String param_dob){
        this.dob = param_dob;
    }
    
    /**
     * @return parent_detail
     * this method will return data of parent_detail
     */
    public String getParentDetail(){
        return this.parent_detail;
    }
    
    /**
     * @param param_parent_detail
     * this method will store data in parent_detail
     */
    public void setParentDetail(String param_parent_detail){
        this.parent_detail = param_parent_detail;
    }
    
    /**
     * @return academic_level
     * this method will return data of academic_level
     */
    public String getAcademicLevel(){
        return this.academic_level;
    }
    
    /**
     * @param param_academic_level
     * this method will store data in academic_level
     */
    public void setAcademicLevel(String param_academic_level){
        this.academic_level = param_academic_level;
    }
    
    /**
     * @return academic_grade
     * this method will return data of academic_grade
     */
    public String getAcademicGrade(){
        return this.academic_grade;
    }
    
    /**
     * @param param_academic_grade
     * this method will store data in academic_grade
     */
    public void setAcademicGrade(String param_academic_grade){
        this.academic_grade = param_academic_grade;
    }
    
    /**
     * @return academic_stream
     * this method will return data of academic_stream
     */
    public String getAcademicStream(){
        return this.academic_stream;
    }
    
    /**
     * @param param_academic_stream
     * this method will store data in academic_stream
     */
    public void setAcademicStream(String param_academic_stream){
        this.academic_stream = param_academic_stream;
    }
}

