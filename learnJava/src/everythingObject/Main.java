package everythingObject;

public class Main {

    public static void main(String[] args){

//        You manipulate objects with references

        String s ;  // this is a string referecne      // the fact that we have a reference doesn't mean we have an object yet
        s = "aaa";  // However, this uses a special Java feature: Strings can be initialized with quoted text. Normally, you
                    // must use a more general type of initialization for objects

        String s2 = new String("aaa");      // this line creates a new string and also HOW to make the string by initializing it
        //  last 2 lines do the same thing
        // When you create a reference, you want to connect it with a new object. You do so, in general, with the new operator.
        // The keyword new says, “Make me a new one of these objects.”

        if(s.equals(s2)){                         //  we used .equals to comapre because String is object , and object has method equals
            System.out.println("are equal");
        }else  {
            System.out.println("are not equal");
        }                                            // this will go on the if branch because ...

        int numneric = 10;
        int numneric2 = 10;
        if(numneric == numneric2){
            System.out.println("are equal");
        }


    }
}
