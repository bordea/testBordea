package superPack;

public class Tree extends Plant{

    int age;

    int height;

    public Tree(int id, String code, String color, int age) {
        super(id,code,color);
        this.age = age;
    }

    public Tree(int id, String code, String color, int age, int height){
        this(id,code,color,age);
        this.height = height;
    }

    public Tree(int id,int height){
        super(id);
        this.height=height;
    }

    public void complexTreeMethod(int i){
        print(""+2*i);

        print(String.valueOf(3*i));

        super.complexPlantMethod(i);
    }

    public static void main(String[] args){
        Plant firstPlant = new Plant(1,"cod1","color1");
        Plant.print(firstPlant.getCode());

        Tree firstTree = new Tree(111,"cod11","color11",35);
        Plant.print(firstTree.toString());

        Tree secondTree = new Tree(222,"cod3","color3",60,10);
        Plant.print(secondTree.toString());

        Tree tallTree = new Tree(333,15);

        tallTree.complexPlantMethod(3);

        tallTree.complexTreeMethod(5);

// tree care are id, color,height
    }

    @Override
    public String toString() {
        String plantString = super.toString();
        String treeString = "Tree{" +
                "age=" + age +
                ", height=" + height +
                '}';
        return plantString + treeString;
    }
}
