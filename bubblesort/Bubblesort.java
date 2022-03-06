import java.util.Random;
import java.util.Scanner;

public class Bubblesort {
    

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Länge das Arrays ein: ");
        int r = input.nextInt();
        input.close(); 
        int[] arr = new int[r];
        createRandomArray(arr);
        int[] help1 = arr;
        int[] help2 = arr;
        int[] help3 = arr;
        //arr = IntStream.range(1, 100).toArray();
        System.out.println("Ungeordnet:");
        display(arr);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Bubblesort | Geordnet:");
        bubblesort(help1);
        display(help1);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Selectionsort | Geordnet: ");
        selectionSort(help2);
        display(help2);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Insertionsort | Geordnet: ");
        insertionSort(help3);
        display(help3);
    }

    static void createRandomArray(int helpArr[]) {
        Random random = new Random();
        for (int i = 0; i < helpArr.length; i++) {
            helpArr[i] = random.nextInt(100000) + 1;
        }
    }

    private static void bubblesort(int helpArr[]){
        long time1 = System.nanoTime();
        long time2;

        boolean run = true;
        int smaller;
        int bigger;

        for (int i = 0; i < helpArr.length && run == true; i++) {
            run = false;
        
           for (int y = 0; y < helpArr.length-1; y++) {
                if(helpArr[y] > helpArr[y + 1]) {
                    bigger = helpArr[y];
                    smaller = helpArr[y + 1];
                    helpArr[y] = smaller;
                    helpArr[y + 1] = bigger;
                    run = true;
                }
            }
        }
        time2 = System.nanoTime();
        System.out.println("Zeit: "+(time2-time1)/1000+" ms");

    }

    private static void selectionSort(int helpArr[]){
        long time1 = System.nanoTime();
        long time2;
        int l = helpArr.length;
        for(int i = 0; i < l; i++){
            int min = i;
            for(int j = i+1; j < l; j++){
                if(helpArr[j] < helpArr[min]){
                    min = j;
                }
            }
            int temp = helpArr[min];
            helpArr[min] = helpArr[i];
            helpArr[i] = temp;
        }
        time2 = System.nanoTime();
        System.out.println("Zeit: "+(time2-time1)/1000+" ms");

    }

    private static void insertionSort(int helpArr[]){
        long time1 = System.nanoTime();
        long time2;
        int n = helpArr.length;
        for(int i = 1; i < n; i++){
            int key = helpArr[i];
            int j = i - 1;
            while(j >= 0 && helpArr[j] > key){
               helpArr[j + 1] = helpArr[j];
                j = j-1;
            }
            helpArr[j+1] = key;
        }
        time2 = System.nanoTime();
        System.out.println("Zeit: "+(time2-time1)/1000+" ms");
    }

    static void display(int helpArr[]){
        for(int i = 0; i < helpArr.length; i++){
            System.out.println(helpArr[i]);
        }
    }

}
