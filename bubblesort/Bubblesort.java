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
        //arr = IntStream.range(1, 100).toArray();
       System.out.println("Ungeordnet:");
       display(arr);
       System.out.println("-------------------------------------------------------------");
       System.out.println("Geordnet:");
       bubblesort(arr);
       display(arr);

        
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

    static void display(int helpArr[]){
        for(int i = 0; i < helpArr.length; i++){
            System.out.println(helpArr[i]);
        }
    }

}
