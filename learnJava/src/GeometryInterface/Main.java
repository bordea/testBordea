package GeometryInterface;

public class Main {
    public static void main(String[] args) {
        shapeA circleshape=new circle();
        circleshape.Draw();
        circleshape.Draw();
    }
}

interface shapeA{
    public   String baseclass="shape";
    public void Draw();
}

interface shapeB extends shapeA{
    public   String baseclass="shape2";
    public void Draw2();
}

interface shapeC {
    public String baseclass = "shape3";
    public void Draw3();
}

class circle implements shapeA, shapeB, shapeC{
    public   String baseclass="shape3";

    public void Draw(){
        System.out.println("Drawing Circle here:"+ shapeA.baseclass);
    }

    @Override
    public void Draw2() {
        System.out.println("Drawing Circle here:"+ shapeB.baseclass);
    }

    @Override
    public void Draw3() {
        System.out.println("Drawing Circle here:" + shapeC.baseclass);
    }
}
