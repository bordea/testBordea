package Exceptions;

class ExempluSimpluExceptionHandling{
    public static void main(String args[]){
        int a=30;
        int b=10;
        System.out.println("Urmeaza TRY ");
        try {
            System.out.println("a/b="+a/b);
            System.out.println("Nu se printeaza asta ");
        } catch (ArithmeticException ae){
            System.out.println("Exceptia --> "+ae.getMessage());
        }
        System.out.println("Dupa CATCH");
    }
}

