package oops;
class Adder{

    static int add(int a, int b){
        return a+b;
    }

    static int add(int a, int b, int c){
        return a+b+c;
    }

    static float add(float a, float b){
        float res = a+b;
        return res;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Adder.add(9, 2);
        Adder.add(5.5f, 1.5f);
    }
}
