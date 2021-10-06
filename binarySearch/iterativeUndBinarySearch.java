import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import javax.swing.Renderer;

public class iterativeUndBinarySearch {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Länge das Arrays ein: ");
        int r = input.nextInt();
        input.close(); 
        int[] arr = new int[r];
        createRandomArray(arr);
        //arr = IntStream.range(1, 100).toArray();
        Arrays.sort(arr);
        Random randomN = new Random();
        int randomNHelp = randomN.nextInt(arr.length-1);
        int randomNumber = arr[randomNHelp];
        binarySearch(arr, randomNumber);
        iterativeSearch(arr, randomNumber);
        
    }

    static void createRandomArray(int helpArr[]) {
        Random random = new Random();
        for (int i = 0; i < helpArr.length; i++) {
            helpArr[i] = random.nextInt(10000) + 1;
        }
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
               steps++;
                System.out.println("Binär: Die Nummer "+searchNumber+" wurde beim Index "+middle+" in "+steps+" Durchlaeufen gefunden.");
               break;
            } else {
               last = middle - 1;
               steps++;
            }
  
            middle = (first + last) / 2;
       }
     if (first > last) {
     System.out.println(searchNumber 
     + " wurde nicht in der Liste gefunden.\n");
        }
     }

     public static void iterativeSearch(int[] input, int searchNumber){
        int steps = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] == searchNumber){
                System.out.println("Iterativ: Die Nummer "+searchNumber+" wurde beim Index "+i+" in "+steps+" Durchlauefen gefunden.");
            }
            else{
                steps++;
            }
        }
     }
  
}
