package GCD;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        int num1, num2;
        Scanner stdin = new Scanner(System.in);
        
        System.out.print("Input number 1: ");
        num1 = stdin.nextInt();
        System.out.print("Input number 2: ");
        num2 = stdin.nextInt();
        
        System.out.println(gcd(num1, num2));
        System.out.println("Test git");
    }
    
    static int gcd(int m, int n){
        if(n==0){
            return m;
        }
        else return gcd(n, m%n);
    }
}
