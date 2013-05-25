package Generice;
// implementam interface Person<P>
public class Student<G> implements Person<G> {         // vreau sa fac clasa ca sa fie si ea generica
    protected G age;    // in loc de  -->    protected int age;    --> acuma avem variabila generica age

    protected G name;   // in loc de  -->    protected String name;  --> acum avem variabila generica name

    @Override
    public void setPersoana(G persoana) {

    }

    @Override
    public G getPersoana(G persoana) {

        return persoana;
    }

 /*  // implementeaza metoda cu tip integer din interfata    -->        public void setPersoana(P persoana);
    public void setPersoana(Integer persoana) {

    }
    // implementeaza metoda cu tip integer din interfata    -->        public P getPersoana(P persoana);
    public Integer getPersoana(int persoana) {
        age = persoana;
        return age;
    }
    // implementeaza metoda cu tip string din interfata    -->        public void setPersoana(P persoana);
    public void setPersoana(String persoana) {

    }
    // implementeaza metoda cu tip string din interfata    -->        public P getPersoana(P persoana);
    public String getPersoana(String persoana) {
        return persoana;
    }          */

    public Student() {}                         // default constructor

  /*  public Student(int age) {                            // contructuorul variabilei integer age
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
    }    */

    public Student(G g) {                            // contructuorul variabilei g de tip G
        this.age = g;
    }

    public Student(G age, G name) {               // contructuorul pentru variabilele G age si name
        this.age = age;
        this.name = name;
    }

    public G getAge() {                                // getter pentru variabila age de tip G
        return age;
    }

    public void setAge(G age) {                          // setter pentru variabila age de tip G
        this.age = age;
    }

    public G getName() {                             // getter pentru variabila name de tip G
        return name;
    }

    public void setName(G name) {                    // setter pentru variabila name de tip G
        this.name = name;
    }

    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
