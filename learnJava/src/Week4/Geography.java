package Week4;

public class Geography {
    public static void main(String args[]){
        Country rom = new Country("Romania",40,false);
        Country hun = new Country("Hungary",39,true);
        Country tur = new Country("Turkey",false);
        Country isr = new Country("Israel",52);

        Country[] array1;
        array1 = new Country[4];
        array1[0]=rom;
        array1[1]=hun;
        array1[2]=tur;
        array1[3]=isr;

        for (int i=0; i<4;i++){
            System.out.println(array1[i]);
        }


    }
}
