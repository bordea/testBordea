package Final;

public class Final1{
    public static void main(String[] args){
        final int finalvariable=10;
        System.out.println("Variabila Finala --> " + finalvariable);
        //finalvariable=15;  // facand aceasta operatie vom avea eroare din cauza ca e variabila finala
        getName();
    }
    public static final void getName()
    {
        String finalmethodjava="valoare";
        System.out.println("finalmethodjava --> " + finalmethodjava);
    }
}
