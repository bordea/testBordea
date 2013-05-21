package InnerClasses;

class Cocosi {
    public void pop() {
        System.out.println("cocosi");
    }
}
class Mancare {
    Cocosi p = new Cocosi() {
        public void sizzle() {
            System.out.println("cocosi saritori anonimi");
        }
        public void pop() {
            System.out.println("cocosi anonimi");
        }
    };
    public void popIt() {
        p.pop();                                                // OK, deoarece clasa Cocosi are metoda pop()
//            p.sizzle();                                       // Nu e legal deoarece Cocosi nu are sizzle
    }

    public static void main (String [] args){
        Cocosi co = new Cocosi();
        co.pop();
//        co.sizzle();
    }
}