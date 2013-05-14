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
/*
Member variables declaration
The standard is that the variables are declared before the methods. Not inside the methods but inside the class. The variables
declared inside a method will be local to that method.
When declaring a variable we ought to specify the following
 - its name
 - data Type
 - the level of access to it by other classes
 - if it's constant or not
 - if it's an instance variable or a class

[modifier] DataType variableName [ = InitialValue ] ;

The modifier for variables can be - an access specifier, such as public, protected or private
                                  - one of the rezerved words(keywords), such as static, final, transient and volatile

Implementing methods
Methods describe the behaviour of an object
[modifiers] returnedType methodType ( [arguments] )
		[throws ExceptionType]
	{
		// method body
	}
the modifier can be - of access --> public, protected or private
                    - one of the ezerved words --> static, abstract, final, native, synchronized

Methods can either return an object value or nothing, depending on the declaration. The returned type could bve a primitive
data type or a reference to a class object. If the method doesn't return an object we must ensure that the keyword void is being used.
If we want to return something we must have the return instructions on every possible ending of the method.
*/
/*
Method overloading and overriding
Overloading --> inside a class we could have methods with the same name with the condition that their signature should be different.
                The arguments list should differ either by the number of arguments or by their type. This way when the method is called
                it can be establish which unique method will be executed. This is also called polimorphism
Overriding --> a subclass of a class can rewrite, overrired the method of the superclass by implementing a method with the same name
                and the same signature as the superclass

An overriding method can - ignore the superclasses's method
                         - extend the code of the superclasses's method before doing its own functions
                                This can be done by using super --> super.method();

A final method is a method that can't ever be defined again in any subclass it might have. This is usefull if this method has an
implementation which we want to make sure that won;t be changed, most likely being very important for characterizing an object.
 */

/*
Nested classes
Nested classes, the use of a class inside of another class, is usefull when the nested class ain't used anywhere else outside
the super class
A nested class has access to all its superclass methods.

The nested classes can be declared static or not. If we don't declare a nested class static then we can call it an internal class.
The diference between these two is
 - the nested class reflects the syntactic relation between the classes, one code is inside the other's code
 - the internal class reflects the instances relation of two classes, so that the an instance of the internal class can only exist
    inside the superclass
Most nested classes will be the non-static ones --> the internal classes.

SO AN INTERNAL CLASS IS A CLASS WHOSE INSTANCES CAN ONLY EXIST INSIDE THE INSTANCES OF THE SUPERCLASS AND IT HAS DIRECT
ACCESS TO ALL THE SUPERCLASS MEMBERS.

When compiled, the interal classes produce files that have the $ sign following the name of the superclass.
 */
/*
Abstract classes
An abstract method is a method that cannot ever be instantiated and its use is for another class to make an object concrete.
abstract class abstractClassName{
    class body
}
Should we try and instantiate an object of an abstract class we'll get a compilation error.

Abstract methods
Abstract methods can ONLY appear in abstract classes. The abstract method has no implementation.
 */

/*
The Object Class
Every class has a superclass. The mother of all classes is the class Object.

Class nameClass()  =   Class nameClass() extends Object

This class defines the behaviour of all Java classes
 - the comparison of objects
 - the posibility of having arrays of objects
 - returning the class of an object
 - notifying other objects that a variable has changed

Being a subclass of the Object class, any clas can, in theory, override the methods of the Object Class which aren't final.
(they are equals/hashcode , finaliza, toString)
 */

























