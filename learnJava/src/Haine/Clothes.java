package Haine;

public abstract class Clothes {

    int size ;

    String color;

    char gen;   //Women Men Kids Unisex

    public Clothes(int size,String color,char gen){
        this.size = size;
        this.color = color;
        this.gen = gen;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getGen() {
        return gen;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }
}
