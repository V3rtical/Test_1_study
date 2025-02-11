
/*
This is going to be used to define the following tasks that will be on the final.

1.Accessor(DONE Lines 16-38)
2.Mutator(DONE Lines 16-38)
3.Mutator with rule(DONE Lines 16-38)
4.Constructor(Line 10)
5.inheritance
6.In inheritance, constructor calls Super constructor
7.override
8.Override with call to super
9.Overload
10.Abstract class
11. Interface
UML to code
Code to UML
make your code into UML

NOTES:
*Method Overriding is @Override has to have same name and parameters or else its just Overloading
* Method Overloading is multiple methods with the same name but different parameters.(We use this a lot in constructors)
*Protected used to define something in the sub class from the superclass

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