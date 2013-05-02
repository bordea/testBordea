package collections.map;

public class Mouse extends Computer{
    int lengthCable;

    public Mouse(int id, String name, int lengthCable) {
        super(id, name);
        this.lengthCable = lengthCable;
    }

    public static void isWireless(Mouse m){
        if (m.lengthCable == 0){
            System.out.println("This is a Wireless Mouse! Use it with care!");
        }
    }

    public int getLengthCable() {
        return lengthCable;
    }

    public void setLengthCable(int lengthCable) {
        this.lengthCable = lengthCable;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", length cable=" + lengthCable +
                '}';
    }
}
