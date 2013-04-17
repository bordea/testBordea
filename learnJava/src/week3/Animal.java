package week3;

public class Animal {   // String nickName, color  ; int averageage ,    , method : isLucky

    protected String nick;

    protected String color;

    protected int avgAge;



    //this is the default Animal constructor
    public Animal(){}

    //  this is an Animal constructor used to create Animal objects
    public Animal(String nickname, String color, int avgAge){
        this.nick = nickname;
        this.color = color;
        this.avgAge = avgAge;
    }

}
