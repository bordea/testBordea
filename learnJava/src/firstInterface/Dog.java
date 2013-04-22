package firstInterface;

interface Pet{
    public void test();
    public void Eat();
    public void travel();
}

interface SmallPet extends Pet{
    public void runs();
}

interface Weight{
    public void theWeight();
}

public class Dog implements Pet,Weight{
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

        Dog hamster = new Dog();
        hamster.Eat();
        hamster.travel();
        hamster.noOfLegs();
        hamster.theWeight();
    }

    @Override
    public void theWeight() {
        System.out.println("This pet has a weight");
    }

}
