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
/*
Class Declaration
[public][abstract][final] class ClassName
		[extends SuperClassName]
		[implements Interface1 [, Interface2 ... ]]
	{
		// class body
	}
The first art of the declaration it's taken by the class modifiers: public, abstract, final
PUBLIC --> By default, a class can only be used by the classes from the same package with it.(if we don;t specify a package then all
            the classes inside that directory are considered to be of the same package)
           Making a class public makes it available to all the classes regardless of their package appartanance.
ABSTRACT --> A class that has been declared as abstract is like a pattern. We can't make objects of an abstract class so we can't
                instantiate it. It is simply used as a common pattern for a series of subclasses.
FInAL --> The final modifiere tells us that the class will not have any subclasses. We can have two purposes when declaring a final class
 - security : some methods can take as a parameter an object of a class and not a subclass but the type of the object can only be
    found out at the execution. This way we can eliminate any run time errors that may occur this way.
 - obiect orientated programming purpose: the idea that a perfect class mustn't have any subclasses

After the declaration we can make the class a subclass or we can make implement one or more interfaces through it.

The body of the class contains:
    - instance variable and class variable declaration (member variables)
    - instance and class methods declaration and instance and class methods implementation

Acces specifiers for constructors:
private --> No other class can instantiate this classes's objects. This kind of class can contain public methods that can create their
            own objects and make them available to other classes, this way controlling the parameters that create its objects
protected --> Just its subclasses can create object of the classes's type
public --> Any class can instantiate this class
default --> Just the same package classes can instantiate this class



*/


























