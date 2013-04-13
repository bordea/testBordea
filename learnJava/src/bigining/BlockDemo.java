package bigining;

class Bicycle{
}

class BlockDemo {
     public static void main(String[] args) {
          boolean condition = true;

          if (condition) {                                              // begin block 1
               System.out.println("Condition is true.");
          }                                                             // end block one
          else {                                                        // begin block 2
               System.out.println("Condition is false.");
          }                                                             // end block 2
//EXPRESSIONS
          int cadence = 0;
          int[] anArray = new int[1];
          anArray[0] = 100;
          System.out.println("Element 1 at index 0: " + anArray[0]);

          int result = 1 + 2; // result is now 3
          int res = 3;
          if (result == res)
                System.out.println("value1 == value2");
//STATEMENTS
          // declaration statement
          Double aValue;
          // assignment statement
          aValue = 8933.234;
          // increment statement
          aValue++;
          // method invocation statement
          System.out.println("Hello World!");
          // object creation statement
          Bicycle myBike = new Bicycle();
     }
}
