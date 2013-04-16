package week2;

public class ExamDetails {
    public static void main (String args[]){
/*        StudentResults aStudent = new StudentResults();
        aStudent.Exam_Name = "JAVA Exam";
        System.out.println(aStudent.Exam_Name);
        String bName = aStudent.fullName("Steven Jobs");
        System.out.println( bName );
        String exam = aStudent.examName("C2");
        System.out.print("The name of the exam is --> " + exam);
        String score = aStudent.examScore(30);
        System.out.println(" And the mark is --> " + score );
        String grade = aStudent.examGrade(30);
        System.out.print("The grade --> " + grade); */
        Certificates c1 = new Certificates();
        String exam = c1.examName("J2");
        System.out.println("the name of the exam is " + exam);
        String award = c1.certificateAwarded(40);
        System.out.println( exam + " " + award );

    }
}
