package Exercises;

public class MainBuilding {
    public enum Dimensiuni{
        LUNGIME, LATIME, INALTIME
    }
    Dimensiuni dim;
    //public Dimensiuni(Dimensiuni dim){this.dim= dim;}

    public static void main (String [] args) {

        LivingRoom raduLivingRoom = new LivingRoom(20,2,"carpet");
        LivingRoom danaLivingRoom = new LivingRoom(22,1,"wood");
        LivingRoom mamaLivingRoom = new LivingRoom(20,2,"linoleu");
        LivingRoom tataLivingRoom = new LivingRoom(16,3,"linoleu");
        LivingRoom cristiLivingRoom = new LivingRoom(23,2,"wood");

        Bathroom raduBathroom = new Bathroom(17,1,"linoleu",5);
        Bathroom danaBathroom = new Bathroom(19,1,"tiles",1);
        Bathroom mamaBathroom = new Bathroom(21,1,"linoleu",2);
        Bathroom tataBathroom = new Bathroom(20,2,"tiles",1);
        Bathroom cristiBathroom = new Bathroom(18,1,"tiles",4);

        UtilityRoom raduUtilityRoom = new UtilityRoom(15,0,"amex","petrol");
        UtilityRoom danaUtilityRoom = new UtilityRoom(15,0,"bosch","gas");
        UtilityRoom mamaUtilityRoom = new UtilityRoom(16,0,"bosch","oil");
        UtilityRoom tataUtilityRoom = new UtilityRoom(15,1,"albina","oil");
        UtilityRoom cristiUtilityRoom = new UtilityRoom(14,0,"bosch","gas");


    }
}