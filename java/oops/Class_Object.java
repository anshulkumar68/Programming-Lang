package oops;
// package CLASS&OBJECT;

class Pen
{ 
    String color;                                   // data
    String type;    // ball point and gel 
    
    public void write(){                            //member
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student
{
    String name;
    int age;
    // Student st;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Class_Object
{
    public static void main(String[] args) 
    {
        Pen p1 = new Pen();             //first object 
        p1.color = "blue";
        p1.type = "gel";
        p1.write();

        Pen p2 = new Pen();             //second object of same class
        p2.color = "red";
        p2.type = "ballpoint";
        
        p1.printColor();
        p2.printColor();

        Student s1 = new Student();
        s1.name = "GetLost";
        s1.age = 69;
        s1.printinfo();
    }    
}
