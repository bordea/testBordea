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

        City clujNapoca = new City(cluj,"Cluj-Napoca");
        City huedin = new City(cluj,"Huedin");
        City craiova = new City(dolj,"Craiova");
        City slatina = new City(dolj,"Slatina");
        City zalau = new City(salaj,"Zalau");
        City oradea = new City(salaj,"Oradea");

        city1[0] = clujNapoca;
        city1[1] = huedin;
        city2[0] = craiova;
        city2[1] = slatina;
        city3[0] = zalau;
        city3[1] = oradea;

        System.out.println(cluj);



















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
}
