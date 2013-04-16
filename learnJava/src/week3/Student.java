package week3;

public class Student extends User{

    // this class Student has already defined as instamnce variable id, name, age ....
    // inheritance definition: Student inherits superclass 1. instance variable
//                                                         2. method                    // but not the constructors

    // this is where we define Student specific instance variable;

    private int averageMark;

    private String university;

    public Student (int id, String name, int age, int avg, String univ){
        this.id=id;
        this.name=name;
        this.age=age;
        this.averageMark=avg;
        this.university=univ;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
  //utcn over 5 and ubb over 9     --> true = ok

    public boolean smart(int avg, String uni){
        boolean bool = false;
        if (uni.equals("UTCN")){
            if (avg>5)
                bool=true;
        }
        else if (uni.equals("UBB")){
                if (avg>9)
                    bool=true;
        }
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
