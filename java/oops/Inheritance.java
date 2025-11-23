package oops;
// Inheritance 
// Inheritance is a mechanism of driving a new class from an existing class

// Single level Inheritance
// class A // Super class
// {
    // int s = 5;

    // public void printsquare(int s) {
    //     System.out.println("Area of square: " +s*s);
//     }
// }

// public class Inheritance extends A { // derived class
//     int l = 4, h = 5;

//     public void printrectangle() {
//         System.out.println("Area of circle is: " +(1/2)*l * h);
//     }

//     public static void main(String[] args) {
//         Inheritance inobj = new Inheritance();
//         inobj.printsquare(4);
//         inobj.printrectangle();
//     }
// }


// Multilevel inheritance
class A // Super class
{
    int s = 5;

    public void printsquare(int s) {
        System.out.println("Area of square: " +s*s);
    }
}

class B extends A { // Intermediate sub class
    int l = 4, h = 5;

    public void printrectangle(int l, int h) {
        System.out.println("Area of circle is: "+l*h);
    }
}

public class Inheritance extends B{ // derived class
    public static void main(String[] args) {
        Inheritance inobj = new Inheritance();
        inobj.printsquare(3);
        inobj.printrectangle(6, 5);
    }
}

// Heirarchichal Inheritance
// class A // Super class
// {
//     int s = 5;

//     public void printsquare(int s) {
//         System.out.println("Area of square: " +s*s);
//     }
// }

// class B extends A { // derived class
//     int l = 4, h = 5;

//     public void printrectangle(int l, int h) {
//         System.out.println("Area of rectangle is: "+l*h);
//     }
// }

// class C extends A{
//     float radius =5;
//     public void putcircle(float radius){
//         System.out.println("Area of circle is: "+3.14*radius*radius);
//     }
// }
// public class Inheritance extends A{ // derived class
//     public static void main(String[] args) {
//         Inheritance inobj = new Inheritance();
//         C cobj = new C();
//         B bobj = new B();
//         inobj.printsquare(6);
//         cobj.printsquare(8);
//         bobj.printsquare(11);
//     }
// }

// Hybrid inheritance