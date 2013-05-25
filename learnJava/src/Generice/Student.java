package Generice;
// implementam interface Person<P>
public class Student implements Person<Integer> {
    protected int age;

    protected String name;

   // implementeaza metoda cu tip integer din interfata    -->        public void setPersoana(P persoana);
    public void setPersoana(Integer persoana) {

    }
    // implementeaza metoda cu tip integer din interfata    -->        public P getPersoana(P persoana);
    public Integer getPersoana(Integer persoana) {
        age = persoana;
        return age;
    }
    // implementeaza metoda cu tip string din interfata    -->        public void setPersoana(P persoana);
    public void setPersoana(String persoana) {

    }
    // implementeaza metoda cu tip string din interfata    -->        public P getPersoana(P persoana);
    public String getPersoana(String persoana) {
        return persoana;
    }

    public Student() {}                         // default constructor

    public Student(int age) {                            // contructuorul variabilei integer age
        this.age = age;
    }

    public Student(String name) {                        // contructuorul variabilei String name
        this.name = name;
    }

    public Student(int age, String name) {               // contructuorul pentru variabilele integer age si String name
        this.age = age;
        this.name = name;
    }

    public int getAge() {                                // getter pentru variabila age
        return age;
    }

    public void setAge(int age) {                          // setter pentru variabila age
        this.age = age;
    }

    public String getName() {                             // getter pentru variabila name
        return name;
    }

    public void setName(String name) {                    // setter pentru variabila name
        this.name = name;
    }

    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
