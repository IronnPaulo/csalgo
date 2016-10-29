/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package strassen;

import java.util.Scanner;

/**
 *
 * @author Ironn
 */
public class Strassen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int a[][] = new int[2][2];
        int b[][] = new int [2][2];
        int c[][] = new int[2][2];
        System.out.println("Enter First matrix: ");
            for(int i =0; i <2; i++){
                for(int j=0; j<2; j++){
                    System.out.println("["+i+"]["+j+"]");
                    a[i][j] = stdin.nextInt();
                }
            }
        System.out.println("Enter second matrix: ");
            for(int m =0; m <2; m++){
                for(int n=0; n<2; n++){
                    System.out.println("["+m+"]["+n+"]");
                   b[m][n] = stdin.nextInt();
        // TODO code application logic here
                }
            }
                 int p1 = a[0][0]*(b[0][1] - b[1][1]);
                 int p2 = b[1][1] *(a[0][0] + a[0][1]);
                 int p3 = b[0][0] * (a[1][0]+a[1][1]);
                 int p4 = a[1][1] * (b[1][0] - b[0][1]);
                 int p5 =(a[0][0] + a[1][1])*(b[0][1]+b[1][1]);
                 int p6 = (a[0][1]-a[1][1])*(b[1][0]+b[1][1]);
                 int p7 = (a[1][1]-a[1][0])*(b[0][0]+b[0][1]);
                 
                 int num1 = p6 + p5 + p4 - p2;
                 int num2 = p3 + p4;
                 int num3 = p1 + p2;
                 int num4 = p1 +p5-p3-p7;
                 System.out.println("Final matrix: ");
                 System.out.println(" "+num1+" "+num3);
                 System.out.println(" "+num2+" "+num4);
                 
                         
    }
    
}
