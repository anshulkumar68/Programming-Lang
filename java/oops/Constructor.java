package oops;
// package OOP;
// Types of constructor    
// 1. Default constructor
// 2. Parameterized constructor
// 3. Copy constructor

//copy constructor
class Student
{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s2){
        this.name = s2.name;  // this.name refers class data & name refers the variables which are passed as parameter
        this.age = s2.age;
    }

    Student(){
            System.out.println("Constructor is called");        // default constructor
       }
}
//  Parameterized constructor
class Pen
{
    String color;
    int pentip;  //0.5 , 0.7

    public void write(){
        System.out.println(this.color);
        System.out.println(this.pentip);
    }

    Pen(String color, int pentip){
        this.color = color;
        this.pentip = pentip;
    }
}

public class Constructor
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        s1.name = "GetLost";
        s1.age = 67;

        Student s2 = new Student(s1);               // copy  constructor
        // s1.printinfo();
        s2.printinfo();

        Pen p1 = new Pen("violent", 7);
        p1.write();
    }    
}