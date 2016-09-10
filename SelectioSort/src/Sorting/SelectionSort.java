package Sorting;
 
import java.util.Scanner;

/**
 *
 * @author Ironn
 */
public class SelectionSort {
 
    public static int[] doSelectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
     
    public static void main(String a[]){
         
        System.out.println("Enter number of elements: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Enter the numbers: ");
        int arr1[] = new int[n];
        for(int i = 0; i<n ; i++){
            arr1[i] = s.nextInt();
            
         }
        for(int i :arr1){
        }
        
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", "+"i .git");
        }
    }
}
