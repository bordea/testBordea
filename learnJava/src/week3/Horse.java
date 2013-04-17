package week3;

// int speed, String ownerName     method boolean isFast()
public class Horse extends Animal {

    protected int speed;
    protected String owner;

    // this is the default constructor
    public Horse() {}

    // this is a constructor for a horse object with nickname, color, speed and owner
    public Horse(String nickname, String color, int speed, String owner){
        this.nick = nickname;
        this.color = color;
        this.speed = speed;
        this.owner = owner;
    }

    // this is the method that returns the whole horse details nicely in a String
    public String toString() {
        return "The Animal{ " +
                "Nickname - " + nick +
                ", color - " + color +
                ", varsta medie - " + avgAge +
                ", the benefit - " + benefit +
                ", "
                " }"
                ;
}
