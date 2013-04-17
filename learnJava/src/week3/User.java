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

    // constructor that construct an object given an id
    public User(int idNum) {
        this.id = idNum;
    }

    // constructor that construct an object given a name and age
    public User (String name, int age){
        this.name = name;
        this.age = age;
    }

    // constructor that construct an object given an id and age
    public User (int id, int age){
        this.id=id;
        this.age=age;
    }

    // constructor that construct an object given a name, age and a country
    public User (String name, int age, String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }

    // this is the method that return old or young depending on age ( < > 50 )
    public String ageGroup(){
        System.out.println("... in ageGroup method ... with object " + this);
        System.out.println("... in ageGroup method ... with object age " + this.age);
        if (this.age >= 50 )
            return "Old";
        else
            return "Young";
    }

    // this is the getter name
    public String getName(){
        return name;
    }

    // this is the setter name
    public String setName(String newName){
        return newName;
    }

    // this is the getter age
    public int getAge(){
        return age;
    }

    // this is the setter age
    public void setAge(int newAge){
        this.age = newAge;
    }

    // this is the getter country
    public String getCountry(){
        return country;
    }

    // this is the setter country
    public void setCountry(int newCountry){
        this.age = newCountry;
    }

    //this is the method that return true if the user is from Romania and false if not
    public boolean isFromRomania(){
        boolean bool=false;
        if (this.country.equals("Romania"))
            bool = true;
        return bool;
    }

    //  this is the method that putts together all the user details in a card
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
