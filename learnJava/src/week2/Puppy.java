package week2;

public class Puppy{
    int puppyAge;

    public Puppy(String name){
        System.out.println("Passed Name is :" + name );
    }

    public void setAge( int age ){
        puppyAge = age;
    }

    public int getAge( ){
        System.out.println("The puppy's age is " + puppyAge );
        return puppyAge;
    }

    public static void main(String []args){
        Puppy myPuppy = new Puppy( "Blacky" );
        myPuppy.setAge( 2 );
        myPuppy.getAge( );
        System.out.println("The variable's value is " + myPuppy.puppyAge );
    }
}
