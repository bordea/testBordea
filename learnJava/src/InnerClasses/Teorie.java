package InnerClasses;

public class Teorie {
/*
Inner Classes permit declararea unei clase in interiorul altei clase. Acestea au un scope deoarece putem sa le facem membre ale
unei alte clase. La fel cum clasele au membri variabile si metod, o clasa poate sa aiba clase membre.
Avem mai multe modele de clase inner in functie de cum si unde definim inner classes,
    inclusiv top-level nested class --> inner class care e marcata ca si statica.
Cele patru topicuri care vor fi parcuerse sunt:
■ Inner classes
■ Method-local inner classes
■ Anonymous inner classes
■ Static nested classes
 */
/*
Relatia dintre ineer class si ouer class(clasa in care exista inner class) permite codului din inner class sa aiba acces
la membri outer class ca si cum inner class ar fi parte din outer class. In alte cuvint inner class este parte a outer class !
O instanta a inner class are acces la toti membri outer class, chiar si la cei privati.

Codarea unei Regular Clase Inner --> Regular se refera implicit la clase care nu sunt:
■ Static
■ Method-local
■ Anonymous

Clasa Inner se defineste in interiorul {} outer clasei.

class OuterClass {
    class InnerClass { }
}

O regular inner classe nu poate avea declaratii statice de nici un fel si automat nu va avea main.
Singurul mod prin care putem accesa o clasa inner este printr-o instantiere a clasei outer.

Instantierea unei clase inner
Pentru a crea o instanta a clasei inner trebuie sa avem instanta a clasei outer cu care sa aiba legatura. NU EXISTA EXCEPTII
 deci o instanta de clasa inner nu poate fi niciodata pe cont propriu, fara a avea legatura diecta cu o instanta a outer clasei.

Instantierea unei clase inner din interiorul clasei outer. De obicei, clasa outer creaza instanta clasei inner deoarece
clasa outer este cea care vrea sa foloseasca instanta clasei inner.
*/
/*
Daca vrem sa cream o instanta a clasei inner suntem nevoiti sa instantiam clasa outer. Daca nu avem o referinta a unei instante a clasei outer nu putem instantia clasa inner dintr-o metoda statica a clasei outer sau din orice cod din orice clasa. Compilerul permite clasei inner sa acceseze membri clasei outer.
Codul pentru a crea o instanta din afara codului non-static este urmatorul:
public static void main(String[] args) {
MyOuter mo = new MyOuter(); 			// instantierea! Musai!
MyOuter.MyInner inner = mo.new MyInner();
inner.seeOuter();
}

sau

public static void main(String[] args) {
MyOuter.MyInner inner = new MyOuter().new MyInner();
inner.seeOuter();
}

Invocarea clasei se face asemanator cu invocarea unei metode din clasa outer doar ca in loc de metoda avem o instantiere a clasei inner. Invocarea propriu-zisa se face cu keywordul new. Instantierea unei clase inner este singurul caz in care invocam new pe o instanta in loc sa invocam new ca sa construim o instanta.

Diferentele dintre codul de instantiere a clasei inner din interiorul unei clase outer (non-static) si codul de instantiere din afara clasei outer.
■ Din interiorul codului clasei outer folosim numele clasei inner normal

MyInner mi = new MyInner();

■ Din afara codului clasei outer (inclusiv codul metodelor statice din metodele clasei outer)

MyOuter.MyInner

1. Ca sa o instantiam trebuie sa facem referinta si la clasa outer:

new MyOuter().new MyInner();

2. sau daca avem deja o instanta a clasei outer:

outerObjRef.new MyInner();
 */
/*




 */



}
