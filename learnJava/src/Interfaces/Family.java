// Exercise 14: (2) Create three interfaces, each with two methods. Inherit a new interface that combines the three,
// adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class.
// Now write four methods, each of which takes one of the four interfaces as an argument. In main( ), create an object
// of your class and pass it to each of the methods.

package Interfaces;

interface actiune{
    void lucreaza();
    void doarme();
}
interface invata{
    void citeste();
    void scrie();
}
interface mananca{
    void supa();
    void desert();
}
interface skills extends actiune,invata,mananca{
    void conduce();
}

class Person implements skills{

}

class Student extends Person implements skills{
    public void conduce() {
        System.out.println("Persoana poate conduce");
    }
    public void lucreaza() {
        System.out.println("Persoana acuma lucreaza");
    }
    public void doarme() {
        System.out.println("Persoana acuma doarme");
    }
    public void citeste() {
        System.out.println("Persoana invata citind");
    }
    public void scrie() {
        System.out.println("Persoana invata scriind");
    }
    public void supa() {
        System.out.println("Persoana mananca supa");
    }
    public void desert() {
        System.out.println("Persoana mananca desert");
    }
}

public class Family {

    public static void main(String[] args){

    }
}
