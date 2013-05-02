package collections.map;

public class Keyboard extends Computer{
    String layout;
    String make;

    public Keyboard(int i, String s, String layout, String make) {
        super(i,s);
        this.layout = layout;
        this.make = make;
    }

    public void isEuropean(Keyboard k){
        if (k.layout.equals("European")){
            System.out.println("You can type with european characters!");
        }
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", layout=" + layout +
                ", make=" + make +
                '}';
    }
}
