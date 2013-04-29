package collections.list;

import java.util.*;

public class CreateAnArrayList {
    public <T> void makeArrayList(T t) {            // take an object of an unknown type and use a "T" to represent the type
        List<T> list = new ArrayList<T>();          // now we can create the list using "T"
        list.add(t);
    }
}