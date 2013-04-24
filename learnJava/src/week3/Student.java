package week3;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{

    // this class Student has already defined as instamnce variable id, name, age ....
    // inheritance definition: Student inherits superclass 1. instance variable
//                                                         2. method                    // but not the constructors

    // this is where we define Student specific instance variable;

    private int averageMark;

    private String university;

    ArrayList<Mark> marks = new ArrayList<Mark>();

    public Student (int id, String name, int age, int avg, String univ){
        this.id=id;
        this.name=name;
        this.age=age;
        this.averageMark=avg;
        this.university=univ;
    }

    public Student (int id, String name, int age, int avg, String univ, ArrayList<Mark> marks){
        this.id=id;
        this.name=name;
        this.age=age;
        this.averageMark=avg;
        this.university=univ;
        this.marks =marks;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    //utcn over 5 and ubb over 9     --> true = ok

    public boolean smart(){
        boolean bool = false;
        System.out.println("bool before the if --> " + bool);
        if (university.equals("UTCN")){
            if (averageMark>5){
                bool=true;
            }
            System.out.println("bool before the if --> " + bool);
        }
        else if (university.equals("UBB")){
            if (averageMark>9){
                bool=true;
            }
        }
        System.out.println("bool after the if --> " + bool);
        return bool;
    }

    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", varsta=" + age +
                ",average mark" + averageMark +
                ", university" + university +
                ".";
    }
}
