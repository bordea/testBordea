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

class YoungPerson implements invata,mananca{
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

class Student extends YoungPerson implements skills{
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
    static void method1(actiune a){a.doarme();a.lucreaza();};
    static void method2(invata i){i.citeste();i.scrie();};
    static void method3(mananca m){m.desert();m.supa();};
    static void method4(skills s){s.conduce();};

    public static void main(String[] args){
        Student radu = new Student();
        method1(radu);
        method2(radu);
        method3(radu);
        method4(radu);
    }
}
