package oops;
class Bike{
    void run(){
        System.out.println("Bike is running");
    }
}

public class MethodOverriding extends Bike{
    void run(){
        System.out.println("Bike is running safely");
    }
    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.run();
    }
}
