package ses.dao;

import ses.controller.StudentController;
import ses.model.StudentModel;

public interface StudentDAO {
    public abstract boolean recordStudent(StudentController sc);
    
    public abstract boolean updateStudent(StudentController sc);
    
    public abstract StudentModel selectStudent(StudentController sc);
    
    public abstract StudentModel selectStudentById(StudentController sc);
    
    public abstract boolean removeStudent(StudentController sc);
}
