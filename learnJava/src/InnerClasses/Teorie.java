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
Folosirea instantelor inner si outer din interiorul clasei inner
In general, un obiect se refera la sine insusi prin folosirea de this.
■ this se poate folosi doar codul instantei ( nu din cod static !)
■ referinta this ‘points’ spre obiectul care se executa curent.
■ referinta this este modul prin care un obiect poate sa transmita o referinta catre sine , unei alte metode ( ca argument de metoda )

public void myMethod() {
MyClass mc = new MyClass();
mc.doStuff(this); // pass a ref to object running myMethod
}

Intr-o clasa inner, referinta this se refera la instanta clasei inner. Daca vrem sa transmitem o referinta catre clasa outer dupa cum urmeaza:

class MyInner {
public void seeOuter() {
System.out.println("Outer x is " + x);
System.out.println("Inner class ref is " + this);
System.out.println("Outer class ref is " + MyOuter.this);
}
}

Cele 2 reguli care trebuie respectate cand o clasa inner se auto-referentiaza sau o instantiere outer sunt:
■ Trebuie sa facem referinta a clasei inner din interiorul codului ei, folosind this
■ Ca sa facem referinta la o instanta a clasei outer, folosim ‘NumeleClaseiOuter.this’

Modificatori pentru membri aplicati Clasei Inner
Deoarece o regular inner class este un membru al clasei outer (la fel ca si variabilele si metodele) putem sa ii aplicam urmatorii modificatori:
■ final
■ abstract
■ public
■ private
■ protected
■ static— daca folosim static atunci vom avea o static nested class in loc de o clasa inner
■ strictfp
 */
/*
O regular inner class se situeaza in interiorul clasei outer dar in afara oricarei metode a clasei outer. Deci o gasim la
 acelasi nivel cu variablilele clasei outer.
Putem sa declaram o clasa inner si in interiorul unei metode dar tebuie sa avem grija sa o instantiam doar dupa ce o declaram
si nicidecum inainte.

Ce poate si ce nu poate sa faca un obiect inner method-local
O clasa inner method-local poate fi instantiata doar in interiorul acelei metode unde a fost definita. Nici un alt cod din
orice alta metoda din interiorul sau din exteriorul clasei outer va putea vreodata sa instantieze clasa inner method-local.
 La fel ca si obiectele regular inner class, clasa inner method-local are o relatie speciala cu obiectul clasa outer si poate
  sa ii acceseze membri privati. DAR, obiectele clasei inner nu pot folosi variabilele metodei unde clasa inner a fost declarata.
Variabilele locale ale unei metode sunt stocate pe STACK is exista doar atata timp cat metoda ruleaza. Cand metoda se termina
 de executat STACK-ul este golit si variabilele distruse. Clasa inner, insa, va ramane pe HEAP daca o referinta a ei a fost
  transmisa in alt cod si apoi stocat intr-o instance variable. Deoarece variabilele locale nu au garantata viata pentru
   tot timpul care clasa inner method-local exista in memorie, atunci clasa inner nu le va putea folosi. Solutia ar fi sa
    facem aceste variabile FINALE.
Singuri modificatori pe care putem sa ii aplicam claselor inner method-local sunt abstract si final.(acestea sunt cele mai
 intalnite cazuri)

O CLASA LOCALA DECLARATA INTR-O METODA STATICA ARE ACCES DOAR LA MEMBRII CLASEI OUTER DEOARECE NU EXISTA O ASOCIERE PRINTR-O
 INSTANTIERE A CLASEI OUTER.
DACA SUNTEM INTR-O METODA STATICA ATUNCI NU EXISTA THIS, DECI O CLASA INNER INTR-O METODA STATICA ARE ACELEASI RESTRICTII
 CA SI METODA STATICA → NU ARE ACCES LA INSANCE VARIABLES


Clasele Inner Anonime sunt clase care se declara fara a avea un nume de clasa. Aceste clase se pot defini atat intr-o metoda
 cat si in argumentul pe care il transmitem unei metode.
 */


}
