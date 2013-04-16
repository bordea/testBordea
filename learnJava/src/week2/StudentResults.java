package week2;

public class StudentResults {
    String Full_Name, Exam_Name, Exam_Score, Exam_Grade;
    private Integer age;
    StudentResults(){
        Full_Name = "No given name";
        Exam_Name = "Unknown";
        Exam_Score = "No Score";
        Exam_Grade = "Unknown";
    }
    String fullName(String aName){
            Full_Name = aName;
            return Full_Name;
        }
    String examName (String examCode){
        if (examCode.equals("J1") )
            Exam_Name = "Java Level 1";
        else if (examCode.equals("J2") )
            Exam_Name = "Java Level 2";
        else if (examCode.equals("J3") )
            Exam_Name = "Java Level 3";
        else if (examCode.equals("C1") )
            Exam_Name = "C++ Level 1";
        else if (examCode.equals("C2") )
            Exam_Name = "C++ Level 2";
        else if (examCode.equals("C2") )
            Exam_Name = "C++ Level 3";
        return Exam_Name;
    }
}
