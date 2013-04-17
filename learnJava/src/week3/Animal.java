package week3;

public class Animal {   // String nickName, color  ; int averageage ,    , method : isLucky

    protected String nick;

    protected String color;

    protected int avgAge;

    protected String benefit;

    //this is the default Animal constructor
    public Animal(){}

    //  this is an Animal constructor used to create Animal objects with nickname, color and averaAge
    public Animal(String nickname, String color, int avgAge){
        this.nick = nickname;
        this.color = color;
        this.avgAge = avgAge;
    }

    // this is an Animal constructor used to create Animal objects with nickname, color, averaAge and Benefit
    public Animal(String nickname, String color, int avgAge, String benefit){
        this.nick = nickname;
        this.color = color;
        this.avgAge = avgAge;
        this.benefit = benefit;
    }

    // this is the constructor for an animal with nickname and average age
    public Animal(String nickname, int avgAge){
        this.nick = nickname;
        this.avgAge = avgAge;
    }


    // this is the getter for the color
    public  String getColor(){
        return color;
    }

    // this is the setter for the color
    public void setColor(String newColor){
        this.color = newColor;
    }

    // this is the getter for the name
    public  String getNickname(){
        return nick;
    }

    // this is the setter for the name
    public void setNickname(String newNick){
        this.nick = newNick;
    }

    // this method tells if an animal is lucky(purple)
    public boolean isLucky(){
        boolean bool = false;
        if (this.color.equals("purple")){
            bool = true;
        }
        return bool;
    }

    // this is the method that returns the whole user details nicely in a String
    public String toString() {
        return "The Animal{ " +
                "Nickname - " + nick +
                ", color - " + color +
                ", varsta medie - " + avgAge +
                ", the benefit - " + benefit +
                " }"
                ;
    }
}
