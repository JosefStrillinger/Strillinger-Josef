public class Bubblesort {
    
    private boolean run = true;
    private int smaller;
    private int bigger;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Länge das Arrays ein: ");
        int r = input.nextInt();
        input.close(); 
        int[] arr = new int[r];
        createRandomArray(arr);
        //arr = IntStream.range(1, 100).toArray();
       
        
    }

    static void createRandomArray(int helpArr[]) {
        Random random = new Random();
        for (int i = 0; i < helpArr.length; i++) {
            helpArr[i] = random.nextInt(100000) + 1;
        }
    }

    boolean run = true;

    void bubblesort(int helpArr[]){
        
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
    }

}
