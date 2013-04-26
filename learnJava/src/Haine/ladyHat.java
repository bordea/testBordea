package Haine;

public class ladyHat extends Hats{
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ladyHat(int size, String color, char gen, boolean washable, int age) {
        super(size,color,gen,washable);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size= " + size +
                ", color= '" + color + '\'' +
                ", gen= " + gen +
                ", washable= " + washable +
                ", age applicable to= " + age +
                '}';
    }
}
