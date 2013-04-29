package collections.map;

import java.util.*;

public class TestingMap {
    public static void main(String args[]) {
        Map<String,String> countryNames = new HashMap<String,String>(200);
        countryNames.put("GB", "Great Britain");
        countryNames.put("FR", "France");
        countryNames.put("IT", "Italy");
        countryNames.put("FW", "Far Far Away");

        for (Map.Entry<String,String> entry : countryNames.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        Map<String,Integer> countryCodes = new HashMap<String,Integer>(200);
        countryCodes.put("GB", 44);
        countryCodes.put("FR", 37);
        countryCodes.put("IT", 42);
        countryCodes.put("FW", 100);

        for (Map.Entry<String, Integer> entry : countryCodes.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        User radu = new User(11,"Radu Bordea");
        User dana = new User(22,"Dana Bordea");
        User cristi = new User(33,"Cristi Bordea");
        User silvia = new User(44,"Silvia Bordea");
        User marin = new User(55,"Marin Bordea");
        User radu2 = new User(11,"Radu Bordea");

        Map<String,User> countryUsers = new HashMap<String,User>(200);
        countryUsers.put("GB", radu);
        countryUsers.put("FR", dana);
        countryUsers.put("IT", cristi);
        countryUsers.put("FW", silvia);

        for (Map.Entry<String, User> entry : countryUsers.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }


        Map<String,User> codNumericPersonal = new HashMap<String, User>();
        codNumericPersonal.put("Radu", radu);

    }
}
