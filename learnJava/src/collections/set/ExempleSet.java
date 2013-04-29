package collections.set;

// Demonstrate HashSet.
import java.util.*;

class HashSetDemo {
    public static void main(String args[]) {
// create a hash set
        HashSet<String> hs = new HashSet<String>();
        Set<Boolean> booleanList = new HashSet<Boolean>();

        booleanList.add(hs.add("B"));
        booleanList.add(hs.add("A"));
        booleanList.add(hs.add("B"));
        booleanList.add(hs.add("A"));
        booleanList.add(hs.add("D"));
        booleanList.add(hs.add("E"));
        booleanList.add(hs.add("C"));
        booleanList.add(hs.add("F"));

        for (String h: hs){
            print(h);
        }

        for (Boolean b: booleanList){
            print2 (b);
        }

        for (Iterator<String> iyetarot = hs.iterator(); iyetarot.hasNext(); ) {
            String elememnt = iyetarot.next();
            print(elememnt);
        }

        HashSet<Integer> hi = new HashSet<Integer>();
        booleanList.add(hi.add(56));
        booleanList.add(hi.add(146));
        booleanList.add(hi.add(5));
        booleanList.add(hi.add(654));
        booleanList.add(hi.add(123));
        booleanList.add(hi.add(450));
        booleanList.add(hi.add(45));
        booleanList.add(hi.add(7));

        for (Integer h: hi){
            print3(h);
        }

        Set<User> setUsers = new HashSet<User>();
        User radu = new User(11,"Radu Bordea");
        User dana = new User(22,"Dana Bordea");
        User cristi = new User(33,"Cristi Bordea");
        User silvia = new User(44,"Silvia Bordea");
        User marin = new User(55,"Marin Bordea");
        User radu2 = new User(11,"Radu Bordea");
        setUsers.add(radu);
        setUsers.add(cristi);
        setUsers.add(dana);
        setUsers.add(silvia);
        setUsers.add(marin);
        setUsers.add(radu2);

        setUsers.add(marin);

        for (User h: setUsers){
            print4(h);
        }

        print("radu " + radu);
        print("radu2 " + radu2);

        if (radu.equals(radu2)){
            print("yes, it's there already !!");
        }


    }
    //******************************

    public static void print (String s){
        System.out.println(s);
    }
    public static void print2 (Boolean s){
        System.out.println(s);
    }
    public static void print3 (Integer s){
        System.out.println(s);
    }
    public static void print4 (User s){
        System.out.println(s);
    }
}