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
