package Week4;

public class Country {
    protected String name;
    protected int code;
    protected boolean eu;

    public class(){};

    public class Country (String name, int code, boolean eu){
        this.name = name;
        this.code = code;
        this.eu = eu;
    }

    public class Country (String name, boolean eu ){
        this.name = name;
        this.eu = eu;
    }

    public class Country(String name, int code){
        this.name = name;
        this.code = code;
    }
}
