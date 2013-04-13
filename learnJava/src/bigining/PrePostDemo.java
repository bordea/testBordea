package bigining;

class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;

        System.out.println(i);
        ++i;

        System.out.println(i);

        System.out.println(++i);
        System.out.println("valoarea nu se schimba deoarece incrementarea are loc dupa printare");
        System.out.println(i++);

        System.out.println(i);

// ++ inainte sau dupa incrementeaza inainte, respectiv dupa operatie
    }
}
