package superPack;

public class DefaultConstructor extends Plant{


    public static void main (String args[]){
                                                //regula 5 the default constructor is being generated when we don;t type one
        Plant DefaultConstructor = new Plant(2,"the_code","the_color");
        print(DefaultConstructor.toString());

    }
}
