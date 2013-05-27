package everythingObject;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 5/27/13
 * Time: 2:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class ScopeExermple {

    public static void main(String[] args){

        {
            int x = 12; // Only x available

            {
                int q = 96; // Both x & q available
            }

        // Only x available
        // q is  "out of scope" !!!
        }

//        examples

        int i = 0;
        while(i< 5){
            System.out.println("afisezi i" + i);
            int k = 1;
            i += k;
        }

//        int i = i -k;   k is out of scope because it is placed inside {} and we'r trying to use it outside the {}

        {
            String s = new String("a string");
        } // End of scope
        // the object still exists but once the scope of s has ended its reference was distroyed too therefore there's no more
        // access to s anymore


    }
}
