package ProductAbstract;

public abstract class VirtualProduct extends Product{

    protected String name;

    public VirtualProduct() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
