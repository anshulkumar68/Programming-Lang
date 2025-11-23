package oops;
// Polymorphism means many forms

class Student
{
    String name;
    int age;

    public void printinfo(String Name){
        System.out.println(name);
    }

    public void printinfo(int age){
        System.out.println(age);
    }

    public void printinfo(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }
    
    public int printinfo(int a , int b){
        return a+b;
    }
}


public class Polymorphism 
{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Radhee";
        s1.age = 22;

        // s1.printinfo(s1.name);
        s1.printinfo("krishna", 22);
        int res = s1.printinfo(4, 9);
        System.out.println(res);
    }   
}
