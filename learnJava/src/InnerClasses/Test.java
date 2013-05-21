package InnerClasses;

class Test {
    public static void main (String[] args) {
        Animal h = new Horse();
        h.eat();                        // totul este in regula pentru ca eat apartine Animal class
     //   h.buck();                     // eroare pentru ca Animal class nu are buck
    }
}
