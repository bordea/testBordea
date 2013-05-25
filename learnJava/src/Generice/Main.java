package Generice;

public class Main {
    public static void main(String[] args) {
        Student radu = new Student();
        radu.setAge(25);                            // apelam metoda setAge din Studen, tipul lui radu
        System.out.println(radu.getAge());          // afisam age-ul pe care l-am setat mai devreme

        radu.setPersoana(111);                      // setam Id pentru radu --> 111
        System.out.println(radu.getPersoana(111));  // afisam rezultatul apelarii metodei getPersoana() cu un integer

        System.out.println(radu.getPersoana("Radu"));     // afisam rezultatul apelarii metodei getPersoana() cu un string
    }
}
