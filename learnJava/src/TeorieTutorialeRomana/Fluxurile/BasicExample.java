package TeorieTutorialeRomana.Fluxurile;

import java.io.*;

public class BasicExample {
    public static void main(String args[]) throws IOException{
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //  cu ajutorul System.in cream un buffer
        System.out.println("Enter characters, 'q' to quit.");
        do {
            c = (char) br.read();                            // citim caracter
            System.out.println(c);                           // printam caracter
        } while(c != 'q');
    }
}