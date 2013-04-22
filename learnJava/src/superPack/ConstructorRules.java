package superPack;

public class ConstructorRules extends Plant{

    protected int id;

    protected String cod;

    protected String color;

    public ConstructorRules(){}                     //regula 2 --> costructorii au ACELASI NUME cu clasa

    public ConstructorRules(int id, String cod, String color) {      //regula 3  --> constructorii NU AU RETURN TYPE
        super(id,cod,color);
    }

    public static String ConstructorRules(){                          //regula 4
        String s = "Rule This is the method with the same name as the class and the constructor!!";
        return s;
    }

    public static void main (String args[]){
        Plant ConstructorRules = new Plant(1,"codul","culoarea");
        print(ConstructorRules.toString());

        print(ConstructorRules());
    }
}
