package TeorieTutorialeRomana.Fluxurile;

import java.io.*;


public class FluxExample {

    public static void main(String[] args ){
        String fileName = "streamTestFile.txt";                 // numele fisierului
        String line = null;                                     // cate o linie
        try {
            FileReader fileReader = new FileReader(fileName);  // FileReader reads text files in the default encoding.
            BufferedReader bufferedReader = new BufferedReader(fileReader);  // Always wrap FileReader in BufferedReader.
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();                     // ALWAYS ALWAYS close the file
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '"+ fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }

}

