package oops;
interface Animal {
    void walk();
    // public void sleep(){ // Interface is complete abstract class so can't create
    // interface method
    // System.out.println("Zzz....");
    // }
}

interface Herbivore {
    void veg();
}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }

    public void veg() {
        System.out.println("Eats vegetable");
    }
}

class Sheep implements Animal {
    public void walk() {
        System.out.println("Sheep walks on 4 legs");
    }

    public void sleep() {
        System.out.println("Zzz....");
    }
}

public class Interface {
    public static void main(String[] args) {
        Sheep s1 = new Sheep();
        s1.walk();
        Horse h1 = new Horse();
        // h1.walk();
        h1.veg();
    }
}
