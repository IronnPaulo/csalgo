/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Coin;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Ironn
 */
public class CoinAlgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Enter a bill: ");
        String bill = stdin.nextLine();
        
        String[] bills = bill.split(Pattern.quote("."));
        String part1 = bills[0];
        String part2 = bills[1];
        
        
       int num1 = Integer.parseInt(part1);
       int num2 = Integer.parseInt(part2);
       
       int coins[] = {10,5,1};
       int num_coins;
       for(int i=0; i<coins.length;i++){
           if(coins[i]<=num1){
               num_coins = num1/coins[i];
               System.out.println(num_coins+" Php "+coins[i]);
               num1 -=num_coins*coins[i];
           }
           
       }
        
       int cents = num2/25;
        System.out.println(cents+ " 25cents");
    }
    
}
