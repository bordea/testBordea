package ReturnAndBreak;

public class Return {
    static int test(int testval, int target) {          // if the method is void then we don;t need a return at the end of the method
        if(testval > target)
            return +1;
        else if(testval < target)
            return -1;
        else
            return 0;
    }
    public static void main(String[] args) {
        System.out.println(test(10, 5));
        System.out.println(test(5, 10));
        System.out.println(test(5, 5));
    }
}
