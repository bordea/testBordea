package TeorieTutorialeRomana;

public class ObiecteSiClase {
}
/*
Object creation
The object are created by making an instance of a class. Creating an object means declaring it, instantiating it and initializing it
1. Declaring the pbject --> ClassName objectName
2. Instantiating the object using the operator new. This physically creates the object with the space allocation required
3. Initializing --> it's realised through the classes's constructors. The initialization can be done with or without parameters.
        The only condition is that there must be a constructor with those parameters
All these 3 steps can be done on one line as follows
ClassName objectName = new ClassName(param1,param2);

Commit cu exemple cu creare de obiecte si clase si constructori si chemari si metode.
*/
/*
The garbage collector is a process that deals with the distruction of the objects once we're done using them.  Also known as gc

An object is eliminated from the memory by the garbage collector when there's no more reference to this object. The references which
are in fact variablesare distroyed in 2 ways:
 - naturally, when the variable comes out of its domain, for example the end of its method
 - explicit, when we physically attribute the value null to that variable

GC is a low priority process that is being executed periodically. It scans dinamically the memory occupied by the java program that
is running and it marks the objects which have direct or indirect references. After it runs through all the objects it simply eliminates
the unmarked ones from the memory.
We can force the garbage collection process by executing the gc method from the class System.

Before an object is eliminated from the memory gc gets the object to tidy up after itself. After it's used, the object closes the
files and the sockets used, it destroys the references that it has made towards other objects. This way the gc job is easier.
*/
