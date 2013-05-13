package TeorieTutorialeRomana;

import java.util.ArrayList;

class Town{
    String name;

    protected int populationInThousands;

    public Town(){}

    public Town(String name){
        this.name = name;
    }

    public Town(int populationInThousands){
        this.populationInThousands = populationInThousands;
    }

    public Town(String name, int populationInThousands){
        this.name = name;
        this.populationInThousands = populationInThousands;
    }

    public void isCity(Town t){
        if (t.populationInThousands>1000){
            System.out.println(t.name + " este un CITY pentru ca populatia sa este de " + t.populationInThousands * 1000);
        }
        else {
            System.out.println(t.name + " este doar un TOWN pentru ca populatia sa este de doar " + t.populationInThousands * 1000);
        }
    }

}

public class ExampleeObjectAndClass {
    public static void main(String[] args){
        Town belfast = new Town("Belfast",200);
        Town london = new Town("London",3000);
        Town cluj = new Town("Cluj",300);
        Town mesteacan = new Town("Mesteacan",2500);
        Town apahida = new Town("Apahida",30);

        System.out.println("Populatia din " + belfast.name + " se ridica la " + belfast.populationInThousands);

        belfast.populationInThousands = cluj.populationInThousands - 10;

        System.out.println("Populatia din " + cluj.name + " se ridica la " + cluj.populationInThousands);
        System.out.println("Populatia din " + belfast.name + " este cu 10 mii mai mica --> " + belfast.populationInThousands);

        ArrayList<Town> places = new ArrayList<Town>();
        places.add(belfast);
        places.add(london);
        places.add(cluj);
        places.add(mesteacan);
        places.add(apahida);

        for (Town t : places){
            t.isCity(t);
        }
    }
}
