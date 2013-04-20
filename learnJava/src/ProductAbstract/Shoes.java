package ProductAbstract;

public class Shoes extends Product{

    protected String gender;

    protected String name;

    public Shoes() { }

    @Override
    public void description() {
        System.out.println("This is the SHOES description");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
