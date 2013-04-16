package week2;

public class ExamDetails {
    public static void main (String args[]){
        StudentResults aStudent = new StudentResults();
        aStudent.Exam_Name = "JAVA Exam";
        System.out.println(aStudent.Exam_Name);
        String bName = aStudent.fullName("Steven Jobs");
        System.out.println( bName );
        String exam = aStudent.examName("C2");
        System.out.println("The name of the exam is --> " + exam);


    }
}
