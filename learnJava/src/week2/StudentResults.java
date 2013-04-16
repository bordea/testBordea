package week2;

public class StudentResults {
    private String Full_Name, Exam_Name, Exam_Score, Exam_Grade;
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
    String examScore (int aScore){
        Exam_Score = aScore + " out of 50";
        return Exam_Score;
    }
    private String getGrade(int aScore){
        String examGrade="";
        if (aScore>=0 && aScore<=10)
            examGrade = "E";
        else if (aScore>10 && aScore<=20)
            examGrade = "D";
        else if (aScore>20 && aScore<=30)
            examGrade = "C";
        else if (aScore>30 && aScore<=40)
            examGrade = "B";
        else if (aScore>40)
            examGrade = "A";
        return "The Grade is " + examGrade;
    }
}
