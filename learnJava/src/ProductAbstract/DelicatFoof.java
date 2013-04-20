package ProductAbstract;

public class DelicatFoof extends Food{

    protected String aroma ;

    public DelicatFoof() {  }

    @Override
    public void description() {
        System.out.println("This is the description for  " + aroma);
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }
}
