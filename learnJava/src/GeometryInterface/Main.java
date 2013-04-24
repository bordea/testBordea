package GeometryInterface;

public class Main {
    public static void main(String[] args) {
        shapeA circleshape=new circle();
        circleshape.Draw();
        circleshape.Draw();
    }
}

interface shapeA{
//    public   String baseclass="shape";
    public void Draw();
}

interface shapeB extends shapeA{
//    public   String baseclass="shape2";
    public void Draw2();
}

class circle implements shapeB{
    public   String baseclass="shape3";

    public void Draw(){
        System.out.println("Drawing Circle here:"+baseclass);
    }

    @Override
    public void Draw2() {
        System.out.println("Drawing Circle here:"+baseclass);
    }
}
