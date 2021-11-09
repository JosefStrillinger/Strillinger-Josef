import java.util.Scanner;

public class iterativeAndRecursiveSumme {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte geben Sie die gewünschte Summe ein: ");
        int r = input.nextInt();
        input.close(); 
        long time;
        long time2;
        time = System.nanoTime();
        int iSum = iterativeSum(r);
        time2 = System.nanoTime();
        System.out.println("Iterative Summe");
        System.out.println("Die Summe ist: "+iSum+"");
        timeDiff(time, time2);

        time = System.nanoTime();
        int rSum = recursiveSum(r);
        time2 = System.nanoTime();
        System.out.println("Rekursive Summe");
        System.out.println("Die Summe ist: "+rSum+"");
        timeDiff(time, time2);

        time = System.nanoTime();
        int erSum = endRecursiveSum(r);
        time2 = System.nanoTime();
        System.out.println("Endrekursive Summe");
        System.out.println("Die Summe ist: "+erSum+"");
        timeDiff(time, time2);
    }

public static int iterativeSum(int helpNum){
    int sum = 0;
    for(int i = 0; i < helpNum+1; i++){
        sum += i;
    }
    return sum;
}
public static int recursiveSum(int helpNum){
	if (helpNum != 0) {
        return helpNum + recursiveSum(helpNum - 1);
    }
    return helpNum;
    
}
public static int endRecursiveSum(int helpNum){
    return addSum(0, helpNum);
}
public static int addSum(int m, int n){
    int comp = 0;
    if(n==comp){
        return m;
    }
    
    return addSum(m+n, n-1);
}
public static void timeDiff(long t1, long t2){
    long tdiff = t2-t1;
    System.out.println("Benötigte Zeit: "+tdiff/1000+"ms");
}
}