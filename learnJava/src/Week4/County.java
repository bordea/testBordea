package Week4;

public class County {
    protected String name;
    protected int code;
    protected String abr;

    public County(){}

    public County(String name, int code, String abr){
        this.name = name;
        this.code = code;
        this.abr = abr;
    }

    public County(String name,String abr){
        this.name = name;
        this.abr = abr;
    }

    public County(String name, int code){
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "County{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", abr='" + abr + '\'' +
                '}';
    }
}
