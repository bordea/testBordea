package HashMap;

import java.util.*;

import static java.lang.System.out;
//  Enumerate with keyset, values and EntrySet
public final class TestHashMap{

    @SuppressWarnings("unchecked")
    public static void main( String[] args )
    {
        // create a new HashMap
        @SuppressWarnings("Convert2Diamond") final Map<String, String> h = new HashMap<>( 149 /* capacity */,
                0.75f /* loadfactor */ );
        {
            // add some key/value pairs to the HashMap
            h.put( "WA", "Washington" );
            h.put( "NY", "New York" );
            h.put( "RI", "Rhode Island" );
            h.put( "BC", "British Columbia" );
            h.put( "NC", "North Carolina" );
            h.put( "NE", "Nebraska" );
        }
        // look up a key in the HashMap
        String stateName = h.get( "NY" );
        // prints "New York"
        System.out.println( stateName );
        System.out.println( "enumerate all the keys in the HashMap" );
        // keySet gives you a Set, which is not a List.
        // If you need something you can sort, use toArray.
        // If you need a List, then use Arrays.asList.
        // The KeySet is a HashMap.KeySet which is
        // just a view into the original HashMap. Nothing gets duplicated.
        for ( String key : h.keySet() )
        {
            String value = h.get( key );
            // prints lines of the form NY New York
            // in effectively random order, but will be in the same order as values().
            System.out.println( key + " " + value );
            // Don't use the key to get the value, use Map.Entry instead to save the lookup.
        }
        System.out.println( "enumerate all the values in the HashMap" );
        // values gives you a Collection which is not a List.
        // If you need something you can sort, use to Array.
        // If you need a List, then use Arrays.asList.
        // The Collection is a HashMap.Values which is
        // just a view into the original HashMap. Nothing gets duplicated.
        for ( String value : h.values() )
        {
            // prints lines of the form New York
            // in effectively random order, but will be in the same order as keySet()
            System.out.println( value );
        }
        System.out.println( "enumerate all the key/value Entries in the HashMap" );
        // This gives you a Map of Entry items. This is not suitable for sorting.
        for ( Map.Entry<String, String> entry : h.entrySet() )
        {
            // prints lines of the form NY=New York
            // in effectively random order, but will be in the same order as keySet() and values().
            System.out.println( "as Entry: " + entry );
            // this does not require an expensive get lookup to find the value.
            String key = entry.getKey();
            String value = entry.getValue();
            out.println( "as separate key/value fields: " + key + " " + value );
        }
        out.println( "extract the keys into an array" );
        // actual type is a private nested static class HashMap.KeySet
        // This Set is not Serializable.
        Set<String> justKeys = h.keySet();
        // Use toArray that takes an skeleton String[] array,
        // otherwise we end up with a useless Object[] instead of a String[].
        String[] keys = justKeys.toArray( new String[ justKeys.size() ] );
        out.println( "extract values into an array, may contain duplicates unlike a Set." );
        // actual type is a private nested static class HashMap.Values
        // This Collection is not Serializable.
        Collection<String> justValues = h.values();
        String[] values = justValues.toArray( new String[ justValues.size() ] );
        out.println( "extract key/value pair entries into an array." );
        Set<Map.Entry<String, String>> justEntries = h.entrySet();
        @SuppressWarnings("unchecked") Map.Entry<String, String>[] keyValuePairs = justEntries.toArray( new Map
                .Entry[ justEntries.size() ] );
        // Infuriatingly, this generates an unchecked conversion warning message.
        // Type erasure won't let us say:
        // Map.Entry<String, String>[] keyValuePairs =
        // justEntries.toArray ( new Map.Entry<String,String>[justEntries.size()] );
        // There might be some clever way of using Class.asSubclass to mollify the compiler.
        // There so many times when generics create more problems than they solve.

        out.println( "enumerate all the key/value Entries in the HashMap in order" );
        // Eric Sosman came up with this way around the problem.
        // Here is how sort a HashMap:
        // Import the EntrySet into a List
        List<Entry<String, String>> entries =
                new ArrayList<>( h.entrySet() );

        // using an anonymous class for a Comparator. Entry is not Comparable directly.
        Collections.sort( entries, new Comparator<Entry<String, String>>()
        {

            public int compare( Map.Entry<String, String> a, Map.Entry<String, String> b )
            {
                return a.getKey().compareTo( b.getKey() );
            }
        } );
        for ( Map.Entry<String, String> entry : entries )
        {
            out.println( "in order as Entry: " + entry );
            String key = entry.getKey();
            String value = entry.getValue();
            out.println( "in order as separate key/value fields: " + key + " " + value );
        }
        // You could of course use a TreeMap instead of a HashMap,
        // to extract the Entries in key order,
        // but it has more overhead
        // because it keeps the keys in order at all times.
    }
}
