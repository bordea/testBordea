package Generice;

public class Main {
    public static void main(String[] args) {
        Student radu = new Student();
        Student cristi = new Student();               // daca avem  Person cristi = new Student(); n putem implementa setAge si setName
        radu.setAge(25);                              // apelam metoda setAge din Student, tipul lui radu
       // System.out.println(radu.getAge());          // afisam age-ul pe care l-am setat mai devreme

        radu.setPersoana(111);                        // setam Id pentru radu --> 111
        radu.setAge(27);                              // apelarea metodei setAge cu un Integer
        radu.setName("Radu");                         // apelarea metodei setName cu un string
        //System.out.println(radu.getPersoana(111));  // afisam rezultatul apelarii metodei getPersoana() cu un integer
       // System.out.println(radu);                     // afisam obiectul de radu tip Student
        radu.canRead(radu.age);
        System.out.println(radu.name + " este in grupul de varsta " + radu.getAgeGap(radu.age));

        cristi.setPersoana("222");                    // apelarea metodei setPersoana cu un string
        cristi.setAge(31);                              // apelarea metodei setAge cu un Integer
        cristi.setName("Cristi");                       // apelarea metodei setName cu un string
        //System.out.println(cristi);                   // afisam obiectul de cristi tip Student
        cristi.canRead(cristi.age);
        int cristiAge = cristi.getAge();
        System.out.println(cristi.name + " este in grupul de varsta " + cristi.getAgeGap(cristi.age));



        //System.out.println(radu.getPersoana("Radu"));     // afisam rezultatul apelarii metodei getPersoana() cu un string
    }
}
