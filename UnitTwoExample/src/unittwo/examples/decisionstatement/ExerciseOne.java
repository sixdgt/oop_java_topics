package unittwo.examples.decisionstatement;

public class ExerciseOne {
    public static void main(String args[]){
        // given attributes
        int student_no = 425;
        double obtained_marks = 80;
        double full_marks = 100;
        int pass_marks = 32;
        
        // checking student number
        if(student_no == 425){
            System.out.println("Your percentage will obtain here..");
            
            // calculating student percentage
            double percentage = (obtained_marks/full_marks) * 100;
            System.out.println("Your percentage is: " + percentage);
        } else {
            System.out.println("Student no not found");
        }
    }
}
