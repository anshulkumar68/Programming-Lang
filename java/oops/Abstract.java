package oops;

abstract class Animal // Abstract class
{
    abstract void walk(); // Abstract method means if any class inherting abstract class then that class
                          // should inherit abstract method also

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Horse walk on 4 legs");
    }
    public static void main(String[] args) {
        Chicken c1 = new Chicken();
        c1.walk();
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        Chicken c1 = new Chicken();
        h1.walk();
        h1.sleep();
        // Animal a1 = new Animal();
        // a1.walk();
    }
}
