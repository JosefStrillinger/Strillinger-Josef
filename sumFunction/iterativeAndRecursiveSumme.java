import java.util.Scanner;
import java.util.Calendar;

public class iterativeAndRecursiveSumme {
    static Calendar calendar = Calendar.getInstance();
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte geben Sie die gewünschte Summe ein: ");
        int r = input.nextInt();
        input.close(); 
        int iSum = iterativeSum(r);
        System.out.println("Iterative Summe");
        System.out.println("Die Summe ist: "+iSum+"");
        int rSum = recursiveSum(r);
        System.out.println("Rekursive Summe");
        System.out.println("Die Summe ist: "+rSum+"");
        int erSum = endRecursiveSum(r);
        System.out.println("Endrekursive Summe");
        System.out.println("Die Summe ist: "+erSum+"");
    }

public static int iterativeSum(int helpNum){
    long time1 = calendar.getTimeInMillis();
    int sum = 0;
    for(int i = 0; i < helpNum+1; i++){
        sum += i;
    }
    long time2 = calendar.getTimeInMillis();
    timeDiff(time1, time2);
    return sum;
}
public static int recursiveSum(int helpNum){
    long time1 = calendar.getTimeInMillis();
	if (helpNum != 0) {
        return helpNum + recursiveSum(helpNum - 1);
    }
    long time2 = calendar.getTimeInMillis();
    timeDiff(time1, time2);
    return helpNum;
    
}
public static int endRecursiveSum(int helpNum){
    return addSum(0, helpNum);
}
public static int addSum(int m, int n){
    long time1 = calendar.getTimeInMillis();
    if(n == 0){
        return m;
    }
    long time2 = calendar.getTimeInMillis();
    timeDiff(time1, time2);
    return addSum(m+1, n-1);
}
public static void timeDiff(long t1, long t2){
    long tdiff = t2-t1;
    System.out.println("Benötigte Zeit: "+tdiff+"ms");
}
}