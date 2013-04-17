package week3;

// TODO add also country  - String and also defina a method :
// public boolean isFromRomania() {
//  if(this.country.equal("Romnania")){
//        return true;
//    else
//     return false
//  }
public class User {   // this is a a class , the User class

    protected int id;  // instance variable           // 3 types : private (only in the class), protected (in the subclasses)
//                                                              public - everywhere
    protected String name ;  // second instance variable

    protected int age;

    protected String country;

    //TODO add country

    // default conctructor
    public User(){}

    // this is User constructor
    // this can be used top create objects
    public User(int idConstructorParam, String nameConstuctorParam, int ageConstructor) {
        this.id = idConstructorParam;
        this.name = nameConstuctorParam;
        this.age = ageConstructor;
    }

    // constructor that construct an object given a name
    public User(String name) {
        this.name = name;
    }

    // constructor that construct an object given a id
    public User(int idNum) {
        this.id = idNum;
    }

    public User (String name, int age){
        this.name = name;
        this.age = age;
    }

    public User (int id, int age){
        this.id=id;
        this.age=age;
    }

    public User (String name, int age, String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String ageGroup(){
        System.out.println("... in ageGroup method ... with object " + this);
        System.out.println("... in ageGroup method ... with object age " + this.age);
        if (this.age >= 50 )
            return "Old";
        else
            return "Young";
    }

     // this is the getter age
     public int getAge(){
         return age;
     }

     // this is the setter age
     public void setAge(int newAge){
          this.age = newAge;
     }

    public boolean isFromRomania(){
        boolean bool=false;
        if (this.country.equals("Romania"))
            bool = true;
        return bool;
    }

    public String toString() {
        return "User{ " +
                "id= " + id +
                ", name= " + name + '\'' +
                ", varsta= " + age +
                ", country= " + country +
                " }"
                ;
    }
}
