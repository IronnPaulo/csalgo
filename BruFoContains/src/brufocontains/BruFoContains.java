/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package brufocontains;

import java.util.Scanner;

/**
 *
 * @author Ironn
 */
public class BruFoContains {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String sarr1;
        String sarr2;
        System.out.println("Enter the first String with !pagibig!");
        sarr1 = stdin.nextLine();
        System.out.println("Enter the pagibig you want to find");
        sarr2 = stdin.nextLine();
        
        System.out.println("Result: "+sarr1.contains(sarr2));
        if(sarr1.contains(sarr2)){
            System.out.println("You find your true: "+sarr2);}
        // TODO code application logic here
    }
    
}
