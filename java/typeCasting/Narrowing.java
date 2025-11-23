package typeCasting;
// Narrowing casting must be done manually by placing the type in parentheses in front of the value:

class Narrowing
{
    public static void main(String[] args)
    {
        double myDouble = 9.78d;    
        int myInt = (int) myDouble;      //  Manual casting: double to int

        System.out.println(myDouble);
        System.out.println(myInt);        
    }
}