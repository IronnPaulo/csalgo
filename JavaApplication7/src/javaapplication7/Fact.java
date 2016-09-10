
import java.util.Scanner;




class Calculation
{
    int fact(int n)
    {
        int result;

       if(n==1)
         return 1;

       result = fact(n-1) * n;
       return result;
    }
}

public class Fact
{
     public static void main(String args[])
     {
       Calculation obj_one = new Calculation();
       System.out.println("Enter the Number");
       Scanner stdin = new Scanner (System.in);
       int fact1 = stdin.nextInt();
       int a = obj_one.fact(fact1);
       System.out.println("The product of the number is : " + a);
     }
}