package typeCasting;
//  program for Widening casting is done automatically when passing a smaller size type to a larger size type:

class Widening
{
    public static void main(String[] args)
    {
        int myInt=24;
        double myDouble = myInt;    // Automatic type castingAutomatic casting: int to double

        System.out.println(myInt);
        System.out.println(myDouble);
    }
}

