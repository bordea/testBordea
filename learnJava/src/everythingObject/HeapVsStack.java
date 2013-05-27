package everythingObject;

public class HeapVsStack {

    public static void main(String[] args){
        // definition of stack and heap ....

        int i = 0;   // this is defined on stack, this variable will be destroyed when method finishes

        Integer nr = new Integer(1); /// this is an object, all objects live on the heap !!!!!!!

        // cristi, nr este o referecne variable, si traieste pe stack, deci va fi distrusa, dar obiectul care il referentiaza este obiect
//        deci el este in heap. (New Integer(1))

        // never used Character
        char c = 'a';
//        char c2 = 'aa';
        Character ch = new Character(c);
        Character ch1 = new Character('x');   // this line does the same thing with the line above it

//        int [] array = new int[];  // compilatorul asteapta ca noi sa initializam noul array creat
        int [] array = new int[1];
        System.out.println(array[0]);   // afiseaza valoarea atribuita by default --> null
        i = array[0];       // aceaste operatie nu face o referinta
        i += array[0];      // aceasta operatie face o referinta

    }
}
