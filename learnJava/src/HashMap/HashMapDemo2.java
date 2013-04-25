package HashMap;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;



public class HashMapDemo2    {

    public HashMap buildHashTable(){
        HashMap hashMap = new HashMap();
        hashMap.put( "Name" , "Venu gopal Darur" );
        hashMap.put( "RollNo" , "639" );
        hashMap.put( "UNIVERSITY " , "Some University" );
        hashMap.put( "City" , "Hyderabad" );
        hashMap.put( "State" , "Andhra Pradesh" );
        hashMap.put( "Country" , "India" );
        hashMap.put( null , "India" );
        return hashMap;
    }

    public void prinHashTable( HashMap hashMap ){
        Iterator iterator = hashMap.keySet().iterator();        // Iterate on keys
                                                                //We can also Iterate on values how? i.e. your homework
        while ( iterator.hasNext() ){
            String key = ( String ) iterator.next();
            String value = ( String ) hashMap.get( key );
            System.out.println( key + "\t\t: \t" + value );

        }
    }

    public static void main( String [] args ){
        HashMapDemo2 hashMapDemo = new HashMapDemo2( );
        HashMap hashMap =hashMapDemo.buildHashTable();
        hashMapDemo.prinHashTable( hashMap );
    }

}
