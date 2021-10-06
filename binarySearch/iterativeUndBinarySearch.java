import java.util.Arrays;
import java.util.Scanner;

public class iterativeUndBinarySearch {
    public static void main(String[] args) throws Exception {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        Arrays.sort(arr);
        binarySearch(arr, 12);
        iterativeSearch(arr, 12);
    }

    public static void binarySearch(int[] input, int searchNumber) {
        int first = 0;
        int last = input.length - 1;
        int middle = (first + last) / 2;
        int steps = 0;
        
        while (first <= last) {
            if (input[middle] < searchNumber) {
                 first = middle + 1;   
                 steps++;           
            } else if (input[middle] == searchNumber) {
               
                System.out.println("Number "+searchNumber+" found at location "+middle+" in "+steps+" steps");
               break;
            } else {
               last = middle - 1;
               steps++;
            }
  
            middle = (first + last) / 2;
       }
     if (first > last) {
     System.out.println(searchNumber 
     + " is not present in the list.\n");
        }
     }

     public static void iterativeSearch(int[] input, int searchNumber){
        int steps = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] == searchNumber){
                System.out.println("Number "+searchNumber+" found at lovation "+i+" in "+steps+" steps.");
            }
            else{
                steps++;
            }
        }
     }
  
}
