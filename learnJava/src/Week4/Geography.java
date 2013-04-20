package Week4;

//  County : City[] cities  ,  Country  , name
//  City   : County judet ,  name

public class Geography {
    public static void main(String args[]){

        City[] city1 = new City[2];
        City[] city2 = new City[2];
        City[] city3 = new City[2];

        County cluj = new County (city1,"Ardeal","CLUJ");
        County dolj = new County (city2,"TaraRomaneasca","DOLJ");
        County salaj = new County (city3,"Hungary","SALAJ");
        System.out.println(cluj);

        City clujNapoca = new City(cluj,"Cluj-Napoca",1.1, 111, 10000);
        City huedin = new City(cluj,"Huedin",2.2, 222, 20000);
        City craiova = new City(dolj,"Craiova",5.5, 555, 50000);
        City slatina = new City(dolj,"Slatina",4.4, 444, 40000);
        City zalau = new City(salaj,"Zalau",6.6, 666, 60000);
        City oradea = new City(salaj,"Oradea",3.3, 333, 30000);
        System.out.println(clujNapoca);

        city1[0] = clujNapoca;
        city1[1] = huedin;
        city2[0] = craiova;
        city2[1] = slatina;
        city3[0] = zalau;
        city3[1] = oradea;

        printCityArray(city1);

 /*       System.out.println(cluj);
        System.out.println(clujNapoca);
        printCityArray(city1);*/
    }

    private static void printCityArray(City[] cities){
        System.out.println("Now we're printing the cities array");
        for (int i=0;i< (cities.length); i++){
            System.out.println("Printing element number" + i + " --> " + cities[i].getJudet() +
                                    cities[i].judet + cities[i].brut + cities[i].population + cities[i].surface);
        }
    }





       /* Country rom = new Country("Romania",40,false);
        Country uk = new Country("UnitedKindgom",39,true);
        Country ire = new Country("Ireland",false);
        Country usa = new Country("UnitatedStates",52);

        Country[] array1;
        array1 = new Country[4];
        array1[0]=rom;
        array1[1]=uk;
        array1[2]=ire;
        array1[3]=usa;

        for (int i=0; i<4;i++){
            System.out.println(array1[i]);
        }

        County cluj = new County("ClujCounty",264,"CJ");
        County corn = new County("Cornwall",253);
        County ulster = new County("Ulster","ULS");
        County wdc = new County("Washington",264,"WDC");

        County[] array2;
        array2 = new County[4];
        array2[0]=cluj;
        array2[1]=corn;
        array2[2]=ulster;
        array2[3]=wdc;

        for (int i=0; i<4;i++){
            System.out.println(array2[i]);
        }

        City clujNapoca = new City(array1,array2);
        City london = new City();
        City belfast = new City();
        City boston = new City();

        System.out.println(clujNapoca);

        Continent europa = new Continent("Europa",array1,0101);

        System.out.println(europa);  */

}
