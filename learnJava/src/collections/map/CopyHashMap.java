package collections.map;

import java.util.*;

public class CopyHashMap{
    public static void main(String a[]){
        HashMap<String, Integer> hashm = new HashMap<String, Integer>();
        hashm.put("Primul Element", 35);
        hashm.put("Al doilea element", 43);
        hashm.put("Al treilea element", 51);
        hashm.put("Al patrulea element", 63);
        hashm.put("Al cincilea element", 71);
        hashm.put("Al saselea element", 82);
        System.out.println(hashm);
        HashMap<String, Integer> subhasm = new HashMap<String, Integer>();
        subhasm.put("The first ",11);
        subhasm.put("The second ", 22);
        subhasm.put("The third ", 22);
        subhasm.put("The forth ", 22);
        hashm.putAll(subhasm);
        System.out.println("HashMap after copy before the sort " + hashm);

        TreeMap sortedHashm = new TreeMap(hashm);
        System.out.println("HahMap after the sort" + sortedHashm);
    }
}
