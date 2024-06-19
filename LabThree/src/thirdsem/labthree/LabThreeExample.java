package thirdsem.labthree;

public class LabThreeExample {
    public static void main(String args[]){
        // lab three conditional statement with small case study
        // case study: student position and GPA calculation
        
        // student details
        String student_name = "Bibek Tripathi";
        String reg_no = "TU-079-0254";
        
        // marks obtained
        double dsa_marks = 55.00;
        double oop_marks = 49.85;
        double math_marks = 54.45;
        double sad_marks = 56.78;
        double web_tech_marks = 43.45;
        
        // total marks 
        double full_marks = 300.00;
        
        // percentage calculation
        double obtained_marks = dsa_marks + oop_marks +
                math_marks + sad_marks + web_tech_marks;
        double obtained_percentage = (obtained_marks/full_marks) * 100;
        System.out.println("Student Position Calculation");
        System.out.println("Total Obtained Marks: " + obtained_marks);
        System.out.println("Total Obtained Percentage: " + obtained_percentage);
        System.out.println("");
        // lets calculate student position
        if(student_name == "Bibek Tripathi" && reg_no == "TU-079-0254"){ 
            if(obtained_percentage >= 0 && obtained_percentage <= 39.99){
                System.out.println(student_name + " is Fail.");
            } else if (obtained_percentage >= 40 && obtained_percentage <= 59.99){
                System.out.println(student_name + " got Third Division.");
            } else if (obtained_percentage >= 60 && obtained_percentage <= 64.99){
                System.out.println(student_name + " got Second Division.");
            } else if (obtained_percentage >= 65 && obtained_percentage <= 84.99){
                System.out.println(student_name + " got First Division.");
            } else if (obtained_percentage >= 85 && obtained_percentage <= 100){
                System.out.println(student_name + " got Distinction.");
            }
        } else {
            System.out.println("Invalid student registration number.");
        }
        
        // calculating grade points, credit hours and gpa
        System.out.println("");
        System.out.println("Calculating GPA");
        double credit_hour_per_sub = 3.0;
        double total_subject = 5.0;
        double total_gpa = 4.0;
        double total_credit_hour = credit_hour_per_sub * total_subject;
        
        double total_grade_points = credit_hour_per_sub * total_gpa * total_subject;
        
        double obtained_gpa = total_grade_points / total_credit_hour;
        System.out.println("Total Credit Hour: " + total_credit_hour);
        System.out.println("Total Grade Points: " + total_grade_points);
        System.out.println("Obtained Grade: " + obtained_gpa);
    }
}
