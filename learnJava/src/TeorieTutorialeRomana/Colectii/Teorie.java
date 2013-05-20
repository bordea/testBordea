package TeorieTutorialeRomana.Colectii;

public class Teorie {
/*
A collection is an object that puts together more elements into a single unity. This way we'll have access to types, arrays,
 tables, etc. The collection are used for the easier storage and usage of data and also for trasmitting the data easier from one
 method to another.

When we think at collection we think at the following 3 concepts:
- Interfaces --> abstract data types that describe the collections. These interfaces allow the use of collections independently from
 the interface.
- Implementations --> the concrete implementations of the interfaces describe the collections. These classes will represent reusable
data types.
- The algorithm --> the methods that run various useful perations like searching, sorting for the objects that implement the
 interfaces that describe the collection. These algorithms are also called porlymorfics because the same method can be used
 in different implementations of a collection. We see this way the obvious reusability function.

Advantages, when using collections:
- the developer has access to a set of data types and algorithms that help with structures and operations used in applications
    more often so there could be a lot of time saved
- The effective implementation of collection will shorten the runtime of the program and will also improve its quality. This way we
 could pay less attention at the way we represent and work with the info and just get on with the solution
 */
/*
The COLLECTION Interface is working with a group of ELEMENTS. Its purpose is to use these collections in as general way as
possible. Its methods are split in element methods, collection operations methods and array conversion methods/
public interface Collection {
    // basic operations at element level
    int size();
    boolean isEmpty();
    boolean contains(Object element);
    boolean add(Object element);    // Optional
    boolean remove(Object element); // Optional
    Iterator iterator();

    // collection level operations
    boolean containsAll(Collection c);
    boolean addAll(Collection c);    // Optional
    boolean removeAll(Collection c); // Optional
    boolean retainAll(Collection c); // Optional
    void clear();                    // Optional

    // conversion operations in arrays
    Object[] toArray();
    Object[] toArray(Object a[]);
}
*/
/*
The SET Interface is a Collection with no duplicates. It has the same methods as the collection.
2 of the classes that offer concrete implementations of SET are HashSet and TreeSet.
 */
/*
The LIST Interface describes indexed lists of elements. The lists can contain duplicates and allow the control of the position of
  an element through its index. Added to the Collection methods we'll have methods for positional access, searching and finding
   the index of and element, sorted iteration, sublist extraction.
	public interface List extends Collection {
              // positional access
              Object get(int index);
              Object set(int index, Object element);            // Optional
              void add(int index, Object element);              // Optional
              Object remove(int index);                         // Optional
              abstract boolean addAll(int index, Collection c); // Optional

              // searching
              int indexOf(Object o);
              int lastIndexOf(Object o);

              // Iteration
              ListIterator listIterator();
              ListIterator listIterator(int index);

              // sublist extraction
              List subList(int from, int to);
	}
2 classes that implement LIST are ArrayList and Array( Vector).
 */
/*
The MAP Interface
The implementations of this interface are objects which associate a unique key to each element. They can'y contain duplicate
keys and each key has only 1 element associated to it.
	public interface Map {
              // basic element operations
              Object put(Object key, Object value);
              Object get(Object key);
              Object remove(Object key);
              boolean containsKey(Object key);
              boolean containsValue(Object value);
              int size();
              boolean isEmpty();

              // collection level operations
              void putAll(Map t);
              void clear();

              // displaying the collection
              public Set keySet();
              public Collection values();
              public Set entrySet();

              // methods that help with individual elements operations
              public interface Entry {
                  Object getKey();
                  Object getValue();
                  Object setValue(Object value);
              }
	}
Examples of concrete classes are HashMap, TreeMap and Hashtable.
*/
/*
Collection implementations
All the classes that describe the collections have some common ground:
- they allow the null element
- they're seriazable
- they have the method CLONE already defined
- they have the method TOSTRING already defined, which returns an array of characters for that collection
- allow iterators creation for 'browsing' the collection
- indirect implementation --> these classes have abstract superclasses that offer concrete implementations for the majority
of the methods defined by the interface. The most productive superclasses are AbstractCollection and AbstractMap, from which we
get the AbstractList and AbstractSet and AbstractMap.
HashSet, TreeSet, ArrayList, LinkedList, HashMap and TreeMap are concrete applications of these abstract classes.
The only interface with no implementation is COLLECTION
*/
/*
Each interface that describes a collection has 2 implementations with the basic one being used over 90% of the time.
Depending on the situation, the implementation of different interfaces could offer better performances. This is an example
with ArrayList and LinkedList

//exemplul 1 - List1
import java.util.*;
public class List1 {
	public static void main(String(args[]) {
		List lst = new ArrayList();
		//List lst = new LinkedList();
		final int N = 25000;
		for(int i=0; i < N; i++)
			lst.add(new Integer(i));
		//*
	}
}

//exemplul 2 - List2
we're addingthe following to exemplul 1 (*)
		for(int i=0; i < N; i++)
			lst.get(i);

//exemplul 3 - List3
we're adding the following to exemplul 1 (*)
		for(int i=0; i < N; i++)
			lst.remove(0);

Runtime Tmes are as follow:
 	ArrayList	 	LinkedList
List1 (add)	0.4	 	0.4
List2 (get)	0.4	 	21.3
List3 (remove)	6.9	 	0.4


*/
































}
