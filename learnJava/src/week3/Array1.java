package week3;

/*      1. creezi un sir de int cu varstele celor de la noi din familie si il afisezi
        2. creezi un sir de String cu numele celor din familie si il afisezi
        3. creezi un sir de User si il populezi cu useri din familia noastra si apoi il afisezi */
public class Array1 {

    public static void main(String args[]){
        int[] ageArray;
        ageArray = new int[5];
        // assigned values to all the array elements
        ageArray[0] = 24;
        ageArray[1] = 26;
        ageArray[2] = 31;
        ageArray[3] = 56;
        ageArray[4] = 57;
        //printing out the entire array
        for (int i=0; i<5; i++)
            System.out.println("ageArray[" + i + "] = " + ageArray[i]);

        String[] nameArray;
        nameArray = new String[5];
        nameArray[0] = "Dana";
        nameArray[1] = "Radu";
        nameArray[2] = "Cristi";
        nameArray[3] = "Silvia";
        nameArray[4] = "MArin";
        for (int i=0; i<5; i++)
            System.out.println("numeArray[" + i + "] = " + nameArray[i]);


        User[] userArray;
        userArray = new User[5];
        userArray[0] = new User(1111, nameArray[0], ageArray[0],"Romania");
        userArray[1] = new User(1307, nameArray[1], ageArray[1],"Anglia");
        userArray[2] = new User(2712, nameArray[2], ageArray[2],"Irlanda");
        userArray[3] = new User(2202, nameArray[3], ageArray[3],"Romania");
        User marinBordea = new User(1105,"Marin",57,"Romania");
        userArray[4] = marinBordea;
        for (int i=0; i<5; i++)
            System.out.println("userArray[" + i + "] = " + userArray[i]);

    }
}
