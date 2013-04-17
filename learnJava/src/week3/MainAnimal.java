package week3;

public class MainAnimal {

    public static void main(String[] args){
        Animal horseAnimal = new Animal ("BlackBeauty","purple",15);
        System.out.println(horseAnimal);
        System.out.println(horseAnimal.getNickname() + " is lucky --> " + horseAnimal.isLucky());

        Animal cowAnimal = new Animal ("Joiana","white",9,"lapte");
        System.out.println(cowAnimal);
        System.out.println(cowAnimal.isLucky());
        System.out.println(cowAnimal.getNickname() + " is lucky --> " + cowAnimal.isLucky());

    }
}