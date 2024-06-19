package ses.controller;

import ses.dao.StudentDAO;
import ses.dao.impl.StudentDAOImpl;

public class StudentController {
    public boolean addStudent(){
        boolean status = false;
        StudentController sc = new StudentController();
        StudentDAO sd = new StudentDAOImpl();
        if(sd.recordStudent(sc)){
            status = true;
        }
        return status;
    }
    
    public boolean removeStudent(){
        boolean status = false;
        StudentController sc = new StudentController();
        StudentDAO sd = new StudentDAOImpl();
        if(sd.removeStudent(sc)){
            status = true;
        }
        return status;
    }
}
