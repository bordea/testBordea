package superPack;

/*
Learn about constructor
1. Default construtor .....
2. this cxonstructor
    this(params)  will call Classname(params) constructor
3. super 3'-fro constructor super(args )
          3'' -for calling superclass methods super.superclassmethodname(args)

Rule:
   1. they always have the name of the class

   3. construcotir nu pot fi definiti ca returnand ceva , asta diferentiaza un constructor de o metoda, toate metodele
      returneaza ceva , sau void, construcotriu nu returneaza :

         ex negativ public String Plant(args..) - this is a method that by coninidente has the same name , but not construcotr
 */

public class Plant {

    int id;     // by default int are 0    when defined as instance variables

    String code;   // by default all objects are null;  when defined as instance variables

    String color;   // by default all objects are null;  when defined as instance variables


    public Plant() { }

    public Plant(String red) {
        print("in color costructor");
        this.color= red;
    }

    public Plant(int id) {
        print("in id costructor ");
        if(id <0){
            print("id must be > 0");
        } else {
            this.id = id;
        }
    }

    public Plant(int id, String codeOrColor, boolean isCode) {
        this(id);                                    // when in a constructor you call this, (must be the forst sentence)
        print("in id and code costructor");             // it will call the constructor with the proper signature
//        this.id = id;
        if(isCode){
            this.code = codeOrColor;
        } else{
            this.color = codeOrColor;
        }
    }

    public Plant(int id, String code, String color) {
        this(id,code,true);
//        this(id);                     // this will not even compile , cause :
//        this.code = code;
        this.color = color;
    }

    public Plant(String code, String color) {
//        this(color);                      // this is good
        this(0, code, color);
//        this.code = code;
    }

    public static void main(String[] args){   // "static" methods are utilitar methods
//        this.id;  there is not this in static methods;

        Plant plant = new Plant();
        print(plant.toString());

        Plant redPlant = new Plant("red");
        print(redPlant.toString());

        Plant firstPlant = new Plant(1);
        print(firstPlant.toString());

        Plant aaPlant = new Plant(11,"aa",true);
        print(aaPlant.toString());

        Plant bluePlant = new Plant(22,"co","blue");
        print(bluePlant.toString());

        Plant pinkPlant = new Plant("code","pink");
        print(pinkPlant.toString());

    }

    public void complexPlantMethod(int i){
        print(""+i*i);

        print(String.valueOf(i*i*i));
    }

    public static void print(String printString){
        System.out.println(printString);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
