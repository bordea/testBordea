package Generice;

public class ContainerTest {

    public static void main(String[] args) {

        Container<Integer> container = new Container<Integer>();
        container.setElement(10);

        int val = container.getElement();
        System.out.println("value : " + val);
    }
}
