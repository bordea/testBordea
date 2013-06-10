package staticUsage;

class StaticVariableTest{
    static int var1 = 1;
}

public class staticExample {

    public static void main(String[] args){

        StaticVariableTest svt1 = new StaticVariableTest();
        StaticVariableTest svt2 = new StaticVariableTest();
        int variable1 = 0;
        int variable2 = 0;
        variable1 = svt1.var1;
        variable2 = svt2.var1;
        System.out.println("svt1 -->  " + variable1 + " || svt2 -->  " + variable2);

        StaticVariableTest.var1++;                              // this can only be done with a static member
        variable1 = svt1.var1;
        variable2 = svt2.var1;
        System.out.println("svt1 -->  " + variable1 + " || svt2 -->  " + variable2);

        svt1.var1 ++;         //the piece of memory from var1 has been changed therefore the svt2 will have the new value too
        System.out.println("svt1 -->  " + svt1.var1 +  " || svt2 -->  " + svt2.var1);

        svt2.var1 = 25;
        System.out.println("svt1 --> " + svt1.var1 +  " || svt2 --> " + svt2.var1);

    }
}
