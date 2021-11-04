import java.util.Scanner;

public class iterativeAndRecursiveSumme {
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
        int rProd = recursiveProd(r);
        System.out.println("Rekursive Produkt");
        System.out.println("Das Prosukt ist: "+rProd+"");
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
    }else {
        return helpNum;
    }
}
public static int recursiveProd(int helpNum){
	if (helpNum != 0) {
        return helpNum * recursiveSum(helpNum - 1);
    }else {
        return helpNum;
    }
}
}