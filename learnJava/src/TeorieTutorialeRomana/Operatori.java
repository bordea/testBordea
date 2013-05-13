package TeorieTutorialeRomana;

public class Operatori {
    public static void main(String [] args){
        byte b=1, bb=10;
        int i=100,ii ;
        double d, dd = 10;
        float f, ff;
        print(b);
        b++;
        print(b);
        bb += b;
        print(bb);
        print(i);
        ii = i%19;
        print(ii);
        f = (i*ii)/bb;
        print(f);
        d = f*b;
        ff = (float) (dd %14);
        print(d);
        print(ff);
    }

    public static void print(double d){
        System.out.println(d);
    }
}
