
/*
This is going to be used to define the following tasks that will be on the final.
-pvn(public/private, return value, name);
1.Accessor(DONE Lines 16-38)
2.Mutator(DONE Lines 16-38)
3.Mutator with rule(DONE Lines 16-38)
4.Constructor(Line 10)
5.inheritance (Line 6 Folder Sub)
6.In inheritance, constructor calls Super constructor (Line 9)
7.override (Line 13)
8.Override with call to super *This is used with super. for metheods or super(); for constructor. with @override above. (Line 10 Folder: Sub)
9.Overload *this is used for constructors or methods that have different parameters(Line 27 Super folder)
10.Abstract class *Same as super class however its used abstract instead of public and cannot have objects created from it. Super() is the accessor
and uses Extend like super class and is used more for default values.
11. Interface *interface is used with interface prefix and holds certain method names and parameters needed but does not do any logic.
The logic in an interface is done in a class and is class (name) implements Vehicle. USES implemented in class

SOLID
S-The Single Responsibility Principle:Each class has one responsibility
O-Open-Closed Principle:open to extension closed to modification
L-Liskov Substitution Principle: Super classes should be a general while sub should have specifics
I-Interface Segregation Principle: making sure interfaces have the methods they actually need for the task
D-Dependency Inversion Principle: Making more modules in code than concrete ones to be used

UML to code
Code to UML
make your code into UML

UML:
#Protected
-Closed
+Open
---------------
Super.Java
_______________
#ones;
#cents;
#hundreds;
_______________
+Super()

+void set_ones()
+set_cents()
+set_cents()
+set_hundreds()
+get_ones()
+double get_cents()
+get_hundreds()
+Total()
---------------

NOTES*:
*Method Overriding(Runtime polymorph) is @Override has to have same name and parameters or else its just Overloading
* Method Overloading(compile time poly morph) is multiple methods with the same name but different parameters.(We use this a lot in constructors)
*Protected used to define something in the sub class from the superclass
variable = variable (compared) variable ? 0 : 1;
           If true: If false;
hp = _hp>=1 ? _hp : 1;

*/
package Main;
import Super.Super;
import Sub.Sub;

public class Main {
    public static void main(String[] args) {
    Super SuperObj = new Super(10, 5, 3);
    Super SubObj = new Sub(2);
    System.out.println(SuperObj.get_cents());
    System.out.println(SuperObj.get_ones());
    System.out.println(SuperObj.get_hundreds());
    System.out.println(SuperObj.Total());
    System.out.println(SubObj.Total());
    }
}