package ProductAbstract;

public class Cosmetic extends Product{

    protected String name;

    public Cosmetic() { }

    @Override
    public void description() {
        System.out.println("Descrierea produsului COSMETIC" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
