package firstInterface;

interface Pet{
    public void test();
    public void Eat();
    public void travel();

    }

public class Dog implements Pet{
    public void test(){
        System.out.println("  |  Interface Method Implemented  |  ");
    }

    @Override
    public void Eat() {
        System.out.println("the Dog eats");
    }

    @Override
    public void travel() {
        System.out.println("the Dog travels");
    }

    public int noOfLegs(){
        return 4;
    }

    public static void main(String args[]){
        Pet p = new Dog();
        p.test();

        Dog dog1 = new Dog();
        dog1.Eat();
        dog1.travel();


    }
}
