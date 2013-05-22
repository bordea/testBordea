package Threads;

public class ThreadTest
{
    public static void main( String[] args )
    {
        ExampleThread et1 = new ExampleThread( "Thread #1", "Hello World!" );
        ExampleThread et2 = new ExampleThread( "Thread #2", "Hey Earth!" );

        Thread t1 = new Thread( et1 );
        Thread t2 = new Thread( et2 );

        t1.start();
        t2.start();

        t1.interrupt();   // threadul face clean-up la terminare
    }
}
