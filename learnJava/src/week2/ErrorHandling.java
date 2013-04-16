package week2;

public class ErrorHandling {
    public static void main (String args[]){
        try {
            int x = 10;
            int y = 0;
            int z = x / y;

            System.out.println( z );
        }
        catch ( Exception err ) {
            System.out.println( err.getMessage( ) );
        }
        try {
            double xx = 10;
            double yy = 0;
            double zz = xx / yy;

            System.out.println( zz );
        }
        catch ( Exception Err ) {
            System.out.println( Err.getMessage( ) );
        }
    }
}
