package TeorieTutorialeRomana.Fluxurile;

import java.io.*;

public class StreamExample {
    public static void main(String [] args) {
        String fileName = "fluxTestFile.txt";
        try {
            byte[] buffer = new byte[1000];             // citim data
            FileInputStream inputStream = new FileInputStream(fileName);
            //cand citim bufferul stocheaza data si returneaza numarul de bytes citit(nu poate fi mai mare decat buffer size)
            int total = 0;
            int nRead = 0;
            while((nRead = inputStream.read(buffer)) != -1) {
                // convertim in String ca sa putem afisa. In realitate nu vom dori aceasta convertire
                System.out.println(new String(buffer));
                total += nRead;
            }
            inputStream.close();
            System.out.println("Read " + total + " bytes");
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}
