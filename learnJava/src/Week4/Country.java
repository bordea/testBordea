package Week4;

public class Country {
    protected String name;
    protected int code;
    protected boolean eu;

    public Country(){};

    public Country (String name, int code, boolean eu){
        this.name = name;
        this.code = code;
        this.eu = eu;
    }

    public Country (String name, boolean eu ){
        this.name = name;
        this.eu = eu;
    }

    public Country(String name, int code){
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", eu=" + eu +
                '}';
    }
}
