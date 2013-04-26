package Haine;

import java.util.*;
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
        Clothes workT = new tShirt(10,"red", 'M',"short",false,"COCA-COLA");
        Clothes blouseBumbac = new blouse(10,"black", 'U',"long",false,"BUMBAC");
        Clothes blouseMohair = new blouse(8,"black", 'M',"long",true,"MOHAIR");

        ArrayList<Clothes> tops = new ArrayList<Clothes>();
        tops.add(sportT);
        tops.add(workT);
        tops.add(blouseBumbac);
        tops.add(blouseMohair);
        print2(tops);

        System.out.println("Budigai");

        Clothes churchTr = new PoshTrousers(16,"blue", 'W',"stofa","biserica");
        Clothes workTr = new PoshTrousers(10,"red", 'M',"blugi","lucru");
        Clothes shortTr = new SportTrousers(10,"black", 'U',"foitza","scurti");
        Clothes longTr = new SportTrousers(8,"black", 'M',"fash","lungi");

        ArrayList<Clothes> bots = new ArrayList<Clothes>();
        bots.add(churchTr);
        bots.add(workTr);
        bots.add(shortTr);
        bots.add(longTr);
        print2(bots);

        System.out.println(" ");
        System.out.println(" HashMap");
        System.out.println(" ");

        HashMap hm1 = new HashMap();

        hm1.put("Cristi hat ", belfastCap);
        hm1.put("Cristi bluza ", sportT);
        hm1.put("Cristi panataloni ", shortTr);
        hm1.put("Dana hat ", belfastLadyHat );
        hm1.put("Dana bluza ", workT);
        hm1.put("Dana pantaloni ", workTr);

        Set set = hm1.entrySet();

        Iterator i = set.iterator();

        while(i.hasNext()) {
            Map.Entry first = (Map.Entry)i.next();
            System.out.println(first.getKey() + " <-- Key + Value --> " + first.getValue());
        }


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
