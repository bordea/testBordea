package staticUsage;

public class Main {

    public static void main(String[] args){

        Integer i = new Integer(1);  // this is a reference variable , creates a new object of type Integer

        int max = Integer.MAX_VALUE;

        int max2 = i.MAX_VALUE;

        System.out.println(max);

    }
}

class Temperatura {
    int temperaturaDimineata;
    int temperaturaSerar;

    static int FREEZE_TEM = 0;
    static int BOIL_TEMP = 100;

    static void la0Grade(){
        System.out.println("freezing");
    }

    int getTemperaturaDimienata() {
        return temperaturaDimineata;
    }
}
