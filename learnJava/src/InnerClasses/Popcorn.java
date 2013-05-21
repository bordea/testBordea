package InnerClasses;

class Popcorn {
    public void pop() {
        System.out.println("popcorn");
    }
}
class Food {
    Popcorn p = new Popcorn() {
        public void pop() {
            System.out.println("anonymous popcorn");
        }
    };
}
    /*
Let's look at what's in the preceding code:
        ■ We define two classes, Popcorn and Food.
        ■ Popcorn has one method, pop().
        ■ Food has one instance variable, declared as type Popcorn. That's it for Food.
           Food has no methods.
The Popcorn reference variable refers not to an instance of Popcorn, but to an
instance of an anonymous (unnamed) subclass of Popcorn.
                   Let's look at just the anonymous class code:
2. Popcorn p = new Popcorn() {
3. public void pop() {
4. System.out.println("anonymous popcorn");
5. }
6. };
Line 2 Line 2 starts out as an instance variable declaration of type Popcorn. But
instead of looking like this:
Popcorn p = new Popcorn(); // notice the semicolon at the end
there's a curly brace at the end of line 2, where a semicolon would normally be.
Popcorn p = new Popcorn() { // a curly brace, not a semicolon
You can read line 2 as saying,
Declare a reference variable, p, of type Popcorn. Then declare a new class that
has no name, but that is a subclass of Popcorn. And here's the curly brace that
opens the class definition…

Line 3 Line 3, then, is actually the first statement within the new class
definition. And what is it doing? Overriding the pop() method of the superclass
Popcorn. This is the whole point of making an anonymous inner class—to override
one or more methods of the superclass! (Or to implement methods of an interface,
but we'll save that for a little later.)

Line 4 Line 4 is the first (and in this case only) statement within the overriding
pop() method. Nothing special there.

Line 5 Line 5 is the closing curly brace of the pop() method. Nothing special.

Line 6 Here's where you have to pay attention: line 6 includes a curly brace
closing off the anonymous class definition (it's the companion brace to the one
on line 2), but there's more! Line 6 also has the semicolon that ends the statement
started on line 2—the statement where it all began—the statement declaring and
initializing the Popcorn reference variable. And what you're left with is a Popcorn
reference to a brand-new instance of a brand-new, just-in-time, anonymous (no
name) subclass of Popcorn.
*/