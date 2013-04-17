package week3;

public class MainInheritance {

    public static void main(String[] args){

        User userMarin = new User(1, "Marin",55);  // userMarin is an instance of User
        System.out.println(userMarin);
        String s;
        s = userMarin.ageGroup();
        System.out.println( "is in the " + s + " group");
        System.out.println(userMarin.getAge());
//        System.out.println(userMarin.id);  we cannot call "private" instance variables
        userMarin.setAge(20);
        System.out.println(userMarin.getAge());
        s = userMarin.ageGroup();
        System.out.println( "is in the " + s + " group");

        User userDana = new User("Dana",21);
        System.out.println(userDana);
        s = userDana.ageGroup();
        System.out.println( "is in the " + s + " group");

        User noName = new User(13,45);
        System.out.println(noName);
        s = noName.ageGroup();
        System.out.println( "is in the " + s + " group");

//        -- student code

        Student radu = new Student(10,"Radu_Bordea",25,9,"UBB");
        System.out.println(radu);
        System.out.println(radu.getAge());
        System.out.println(radu.getUniversity());
//        radu.setUniversity("UTCN");
        System.out.println(radu.getUniversity());
        System.out.println("Is Radu smart? " + radu.smart());

        User silvia = new User("Silvia Bordea",56,"Romania");
        System.out.println(silvia);
        System.out.println(silvia.getAge());
        System.out.println(silvia.getCountry());
        System.out.println(silvia.getName() + " is from Romania --> " + silvia.isFromRomania());
    }
}
