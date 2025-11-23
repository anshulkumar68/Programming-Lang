package array;
// import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        int num=5, result=1;
        for(int i=num; i>0; i--)
        {
            result=result*i;
        }
        System.out.println("Result is: "+result);
    }
}


// public class Factorial
// {
//     public static void main(String[] args)
//     {
//         try (Scanner sc = new Scanner(System.in)) {
//             System.out.println("Enter number: ");
//             int num = sc.nextInt();
//             int fact=1;
//             for(int i=num; i>=1; i--)
//                 fact = fact*i;

//             System.out.println("Factorial is: "+fact);
//         }
//     }
// }