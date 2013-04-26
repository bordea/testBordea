package Haine;

import java.util.ArrayList;

public class Main {

    public static void main (String args []){
        Clothes belfastCap = new capHat(12, " blue", 'M' , true, "festive");
        print1(belfastCap);
        Clothes dublinCap = new capHat(14, "green", 'M',true, "sport");
        print1(dublinCap);

        Clothes belfastLadyHat = new ladyHat(8,"black",'F',true,30);
        print1(belfastLadyHat);
        Clothes dublinLadyHat = new ladyHat(10,"white",'F',false,10);
        print1(dublinLadyHat);

        ArrayList<Clothes> hats = new ArrayList<Clothes>();
        hats.add(belfastCap);
        hats.add(belfastLadyHat);
        hats.add(dublinCap);
        hats.add(dublinLadyHat);
        print2(hats);

        System.out.println("Bluze");

        Clothes sportT = new tShirt(16,"blue", 'W',"long",true,"PEPSI");
        Clothes workT = new tShirt(10,"red", 'M',"short",false,"PEPSI");
        Clothes blouseBumbac = new blouse(10,"black", 'U',"long",false,"PEPSI");
        Clothes blouseMohair = new blouse(8,"black", 'M',"long",true,"MOHAIR");

        ArrayList<Clothes> tops = new ArrayList<Clothes>();
        tops.add(sportT);
        tops.add(workT);
        tops.add(blouseBumbac);
        tops.add(blouseMohair);
        print2(tops);

        System.out.println("Budigai");

        Clothes churchT = new PoshTrousers(16,"blue", 'W',"stofa","biserica");
        Clothes workTr = new PoshTrousers(10,"red", 'M',"blugi","lucru");
        Clothes shortT = new SportTrousers(10,"black", 'U',"foitza","scurti");
        Clothes longT = new SportTrousers(8,"black", 'M',"fash","lungi");

        ArrayList<Clothes> bots = new ArrayList<Clothes>();
        bots.add(churchT);
        bots.add(workTr);
        bots.add(shortT);
        bots.add(longT);
        print2(bots);



    }
    public static void print1(Clothes c){
        System.out.println(c);
    }


    public static void print2(ArrayList<Clothes> list){
        System.out.println("Afisare lista ");
        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
