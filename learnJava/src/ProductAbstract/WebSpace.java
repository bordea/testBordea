package ProductAbstract;

public class WebSpace extends VirtualProduct{

    int Size;

    public WebSpace() {  }

    @Override
    public void description() {
        System.out.println("This is the WebSPACE Product");
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }


}
