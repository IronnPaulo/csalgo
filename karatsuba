/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karatsun;

import java.util.Scanner;

/**
 *
 * @author idpanganiban
 */
public class Karatsun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("KARATSUBA");
        String x,y;
        Scanner stdin = new  Scanner(System.in);
        System.out.println("Enter 1st Number:  ");
        x = stdin.nextLine();
        System.out.println("Enter 2nd Number: ");
        y = stdin.nextLine();
        System.out.println("x: "+x+" y: "+y);
        int a = Integer.parseInt(x.substring(0,2));
        int b = Integer.parseInt(x.substring(2,4));
        int c = Integer.parseInt(y.substring(0,2));
        int d = Integer.parseInt(y.substring(2,4));
        System.out.println("a: "+a+" b :"+b);
        System.out.println("c: "+c+" d :"+d);
        
        int ac = (a * c);
        int ad = (a*d);
        int bc = b*c;
        int bd = b*d;
      int adbc = (ad + bc)*100;
      int ac1 = ac * 10000;
      
      int xy = ac1 + adbc +bd;
        System.out.println("ad:"+ ad);
        System.out.println("bc: "+bc);
        System.out.println("ac: "+ac1);
        System.out.println("adbc: "+adbc);
        System.out.println("bd: "+bd);
        System.out.println("Product: "+ xy);
      
        
    }
    
}
