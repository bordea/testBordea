package ProductAbstract;

public class Food extends Product{

    protected String name;

    protected int kg;

    public Food() {   }

    @Override
    public void description() {
        System.out.println("This is the description for  " + name + "  -->  " + kg);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }
}
