package ses.dao.impl;

import ses.controller.StudentController;
import ses.dao.StudentDAO;
import ses.model.StudentModel;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public boolean recordStudent(StudentController sc) {
        boolean status = false;
        System.out.println("This is a method where we record student info");
        return status;
    }

    @Override
    public boolean updateStudent(StudentController sc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public StudentModel selectStudent(StudentController sc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public StudentModel selectStudentById(StudentController sc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean removeStudent(StudentController sc) {
        boolean status = false;
        System.out.println("This is a method where we record student info");
        return status;
    }

}
