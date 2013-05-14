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
    final public ArrayList<Town> isVillage(ArrayList<Town> a){
        ArrayList<Town> array1 = new ArrayList<Town>();
        ArrayList<Town> array2 = new ArrayList<Town>();
        for (Town t : a){
            if (t.populationInThousands<1000){
                array1.add(t);
            }
            else {
                array2.add(t);
            }
        }
        return array1;
    }

    public String isBig(Town t){
        if (t.populationInThousands>500){
            return "Da";
        }
        else {
            return "Nu";
        }
    }

    protected void finalize()throws Throwable{
        name = null;
        super.finalize();
    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", populationInThousands=" + populationInThousands +
                '}';
    }
}

class Neighbourhood extends Town{
    protected String neighbourhoodName;
    public int numberOfStreets;
    public int tallestbuilding;

    Neighbourhood() {
    }

    Neighbourhood(String name, int populationInThousands, String neighbourhoodName, int numberOfStreets, int tallestbuilding) {
        super(name,populationInThousands);
        this.neighbourhoodName = neighbourhoodName;
        this.numberOfStreets = numberOfStreets;
        this.tallestbuilding = tallestbuilding;
    }

    public String isBig(Neighbourhood n){
        if (n.numberOfStreets>200){
            return "Da, deoarece are " + n.numberOfStreets + " strazi";
        }
        else {
            return "Nu, deoarece are doar " + n.numberOfStreets + " strazi";
        }
    }

    public boolean isBig(int i){
        if (i>50){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Neighbourhood{" +
                "neighbourhoodName='" + neighbourhoodName + '\'' +
                ", numberOfStreets=" + numberOfStreets +
                ", tallestbuilding=" + tallestbuilding +
                '}';
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

        ArrayList<Town> villages = new ArrayList<Town>();

        villages = belfast.isVillage(places);
        System.out.println("The villages are the following");
        for (Town t : villages){
            System.out.println(t);
        }

        for (Town t : places){
            System.out.print(t);
            System.out.println(" este mare? " + t.isBig(t));
        }

        Neighbourhood manastur = new Neighbourhood("Cluj-Napoca",287, "Manastur", 175, 44);
        Neighbourhood damb = new Neighbourhood("Cluj-Napoca", 287, "Dambu Rotund", 250, 22);
        Neighbourhood centru = new Neighbourhood("Cluj-Napoca", 287, "Centru", 240, 77);
        Neighbourhood marasti = new Neighbourhood("Cluj-Napoca", 287, "Marasti", 150, 44);
        Neighbourhood floresti = new Neighbourhood("Cluj-Napoca", 287, "Floresti", 275, 54);

        ArrayList<Neighbourhood> cartiere = new ArrayList<Neighbourhood>();
        cartiere.add(manastur);
        cartiere.add(damb);
        cartiere.add(centru);
        cartiere.add(marasti);
        cartiere.add(floresti);

        for (Neighbourhood n : cartiere){
            System.out.print(n);
            System.out.println(" este mare? " + n.isBig(n));   // argumentul este de tip neighbourhood si returneaza String
        }


        for (Neighbourhood n : cartiere){
            System.out.print(n);                                     // argumentul este de tip int si returneaza boolean
            System.out.println(" are o cladire mai mare de 50 de metri? " + n.isBig(n.tallestbuilding));
        }

    }

}
