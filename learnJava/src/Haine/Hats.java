package Haine;

public abstract class Hats extends Clothes{
    boolean washable;

    public Hats(int size,String color,char gen,boolean washable){
        super(size,color,gen);
        this.washable = washable;
    }

    public boolean isWashable() {
        return washable;
    }

    public void setWashable(boolean washable) {
        this.washable = washable;
    }


}
