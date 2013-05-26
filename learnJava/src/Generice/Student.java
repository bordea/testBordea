package Generice;
// implementam interface Person<P>
public class Student<G> implements Person<G>, Abilities<G>, IdentityCard<G> {         // vreau sa fac clasa ca sa fie si ea generica
    protected int age;    // in loc de  -->    protected int age;    --> acuma avem variabila generica age

    protected G name;   // in loc de  -->    protected String name;  --> acum avem variabila generica name

    protected G persoana;

    @Override                    // implementeaza metoda cu tip G din interfata   -->   public void setPersoana(P persoana);
    public void setPersoana(G persoana) {
        this.persoana = persoana;
    }

    @Override                    // implementeaza metoda cu tip G din interfata   -->   public P getPersoana(P persoana);
    public G getPersoana(G persoana) {
        return persoana;
    }

    @Override
    public void canRead(G g) {        // afiseaza daca studentul citeste(are 27 de ani) sau nu
        if (g.equals(27)){
            System.out.println("Because this fellow called  " + this.name + " is 27 he can read alright !!! ");
        }
        else {
            System.out.println("This young fellow  called " + this.name + " has either never learned to read or has " +
                    "forgotten !!! " + this.name);
        }
    }

    @Override
    public void hasID(G g) {
        if (this.age > 20){
            System.out.println(this.name + "Has Id because the age is over 20 --> " + this.age);
        }else{
            System.out.println(this.name + "Cum sa aiba ID la doar  " + this.age + " ani !?!?");
        }

    }

    public Integer getIdType(Integer g) {
        int i = 0;
        if (g>19){
            if (g>29){
                i = 3;
            }
            else i = 2;
        }
        else i = 1;
        return i;
    }

    public String getIdType(Student g) {
        if (this.age >20 ){
            return "Buletin";
        }
        else return "Carnet de Elev";
    }

    public G getIdType(G g) {
        return null;
    }

    @Override
    public G getAgeGap(G g) {
        String s;

        return null;
    }

    public Integer getAgeGap(int g) {
        int ageGap = 0;
     //   if ( this.age > 9){
            ageGap = ( this.age /10 ) * 10;
     /*   }
        else{
            ageGap = 0;
        }             */
        return ageGap;
    }
/*    public void dobreake(U u){
        System.out.println(u.toString());
    }
}              */
    public String getAgeGap(String g) {
        String ageGap = "";
        //if (G.)
        return ageGap;
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

    public Student(int g) {                            // contructuorul variabilei g de tip G
        this.age = g;
    }

    public Student(int age, G name) {               // contructuorul pentru variabilele G age si name
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {                                // getter pentru variabila age de tip G
        return age;
    }

    public void setAge(Integer age) {                          // setter pentru variabila age de tip G
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
                ", name='" + name + '\'' +
                ", age=" + age +
                ", persoana='" + persoana + '\'' +
                '}';
    }

}
