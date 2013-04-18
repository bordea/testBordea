package Week4;

public class Geography {
    public static void main(String args[]){
        Country rom = new Country("Romania",40,false);
        Country uk = new Country("UnitedKindgom",39,true);
        Country tur = new Country("Turkey",false);
        Country isr = new Country("Israel",52);

        Country[] array1;
        array1 = new Country[4];
        array1[0]=rom;
        array1[1]=uk;
        array1[2]=tur;
        array1[3]=isr;

        for (int i=0; i<4;i++){
            System.out.println(array1[i]);
        }

        County cluj = new County("ClujCounty",264,"CJ");
        County corn = new County("Cornwall",253);
        County salaj = new County("SalajCounty","SJ");
        County dolj = new County("DoljCounty",264,"DJ");

        County[] array2;
        array2 = new County[4];
        array2[0]=cluj;
        array2[1]=corn;
        array2[2]=salaj;
        array2[3]=dolj;

        for (int i=0; i<4;i++){
            System.out.println(array2[i]);
        }

        City clujNapoca = new City();
        City municipiuArad = new City();
        City zalau = new City();
        City craiova = new City();

    }
}
