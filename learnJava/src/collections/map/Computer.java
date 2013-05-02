package collections.map;

public abstract class Computer {
    int id;
    String name;

    protected Computer() {    }

    protected Computer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void isInternal(){   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
