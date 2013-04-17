package week3;

public class MainAnimal {

    public static void main(String[] args){
        Animal horseAnimal = new Animal ("BlackBeauty","purple",15);
        System.out.println(horseAnimal);
        System.out.println(horseAnimal.getNickname() + " is lucky --> " + horseAnimal.isLucky()+  " because its color is " +
                horseAnimal.getColor());

        Animal cowAnimal = new Animal ("Joiana","white",9,"lapte");
        System.out.println(cowAnimal);
        System.out.println(cowAnimal.getNickname() + " is lucky --> " + cowAnimal.isLucky() + " because its color is " +
                cowAnimal.getColor());
        cowAnimal.setColor("purple");
        System.out.println(cowAnimal.getNickname() + " is lucky --> " + cowAnimal.isLucky() + " because its color is " +
                cowAnimal.getColor());

        Animal dogAnimal = new Animal ("Blacky",20);
        System.out.println(dogAnimal);
        dogAnimal.setColor("brown");
        System.out.println(dogAnimal.getNickname() + " is lucky --> " + dogAnimal.isLucky() + " because its color is " +
                                dogAnimal.getColor());


    }
}