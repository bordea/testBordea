package everythingObject;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 5/27/13
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class ImbricateClass {

    int i ;
    String name;
    InInteriorulClasei inInteriorulClasei;
    ExempleOfClassComponents exempleOfClassComponents;

    public ImbricateClass(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public void setInInteriorulClasei(InInteriorulClasei inInteriorulClasei) {
        this.inInteriorulClasei = inInteriorulClasei;
    }

    public void setExempleOfClassComponents(ExempleOfClassComponents exempleOfClassComponents){
        this.exempleOfClassComponents = exempleOfClassComponents;
    }                 // metoda care initializeaza un obiect al clasei ExempleOfClassComponents

    public static void main(String[] args){
        ImbricateClass imbricateClass = new ImbricateClass(1, "a");
        imbricateClass.setInInteriorulClasei(new InInteriorulClasei(3));

        System.out.println("afisam imbricare " + imbricateClass.inInteriorulClasei.age);

        ExempluClasa exempluClasa = new ExempluClasa();

        ExempleOfClassComponents exCC = new ExempleOfClassComponents();
        exCC.integeru = 111;
        exCC.bool = true;
        exCC.d = 33.21;

        imbricateClass.setExempleOfClassComponents(new ExempleOfClassComponents());
        System.out.println("Exemplu de Imbricare  " + imbricateClass.exempleOfClassComponents.d);
        imbricateClass.exempleOfClassComponents.integeru = 222;
        System.out.println("Exemplu de Imbricare dupa modificare folosind imbricare " +
                imbricateClass.exempleOfClassComponents.integeru);
    }
}

class InInteriorulClasei{   // we cannot declare more than one public class in one file
    int age;

    InInteriorulClasei(int age) {
        this.age = age;
    }
}

class ExempluClasa{}        // prin simpla declarare a acstei clase putem crea obiecte de tipul acestei clase

class ExempleOfClassComponents{
    int integeru;                               // exemplu de field primitiv
    boolean bool;                               // a class that has only variabile fields doesn't do anything but it holds data
    double d = 1.3;
    ExempluClasa ex = new ExempluClasa();       // exemplu de field reference to an object, initialized with new

    void method1(){}                            // metoda este al doilea element al clasei, pe langa fields
                                                // metoda care returneaza void
    String method2(){                           // metoda care nu primeste nici un parametru si returneaza o valoare String
        return " ";
    }

    String method3(int i, char c){              // metoda care primeste parametri si returneaza o valoare
        return " ";
    }

    void method4(int i, char c){}              // metoda care primeste parametri si returneaza void

   /* ExempleOfClassComponents(int integeru) {
        this.integeru = integeru;
    }   */
}