package TeorieTutorialeRomana.Interfete;

public class Teorie {
/*
The interface is the next step up from an abstract class as we're eliminating any implementation of its methods.
Thie way we have a clear delimitation between the pattern( the interface) and its implementation.
We can look at the interface as a way of cumunicating between objects.
Again, an interface defines a set of methods but does not specify any implementation for them.
Thus a class that implements an interface MUST ALWAYS specify implementation for all interface's methods.

An interface is a collection of methods without implementation and constant declarations.

[public] interface InerfaceName
			[extends SuperInterface1 [,extends SuperInterface2...]]
		{
			// interface bodu --> constants and abstract methods
		}

The interface can only have one modifier: public. This way it'll be accessible to all the classes regardless of the package
they're in. An interface which ain;t public can only be accessed by the classes that belong to its package.
There isn't a limit to how many interfaces can an interface extend. We'll call them superinterfaces and will be separated by comma.

THE CONSTANTS
They can or cannot be declared with public, static and final modifiers which are all implicit. No other modifier can appear
in the variable declaration of an interface.
The constants of an interface must always be initialized.

METHODS WITHOUT IMPLEMENTATION
These can be declared or not with the public modifier which is implicit and no other modifier can appear in a method declaration
of an interface.

A few important points:
An interface's variables are public by default even if the modifier is missing.
An interface's variables are constant by default even if the static and final modifiers don't appear.
An interface's methods are public by default even if the public modifier is missing.
In old Java, the abstract modifier is allowed in the interface declaration and its methods declaration. This was then eliminated
as both the interface and its methods are abstract by default.
 */
/*
The implementation of an interface is made by using the implements keyword.
A class can implement an infinite number of interfaces.
A class which implements an interface must specify the implementation cde for all the methods. For this reason. once we create
 and use a class implementation, an interface shouldn't be modified again. If we do that the signature of the existing methods
 will lead to compilation errors when compiling the implementation classes.
The modifying of an interface automatically implies the modifying of all the classes that implement that specific interface.
An abstract class can also be an interfa's implementation.




 */


}































