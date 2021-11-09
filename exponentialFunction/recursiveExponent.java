import java.util.Scanner;

public class recursiveExponent {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte geben Sie die gewünschte Grundzahl ein: ");
        int b = input.nextInt();
        System.out.print("Bitte geben Sie den gewünschten Exponenten ein: ");
        int e = input.nextInt();
        input.close(); 
        
        long time1;
        long time2;

        time1 = System.nanoTime();
        long expon = recursiveExpo(b, e);
        time2 = System.nanoTime();
        System.out.println("Rekursiver Exponent");
        System.out.println("Die Summe ist: "+expon+"");
        timeDiff(time1, time2);

        time1 = System.nanoTime();
        long expon2 = endRecursiveExpo(b, e);
        time2 = System.nanoTime();
        System.out.println("Endrekursiver Exponent");
        System.out.println("Die Summe ist: "+expon2+"");
        timeDiff(time1, time2);
    }


public static long recursiveExpo(int helpBase, int helpExpo){	
    if (helpExpo==0){ 
        return 1; 
    }else {  
        helpBase *= recursiveExpo(helpBase, helpExpo-1); 
    }
    return helpBase;
}
public static long endRecursiveExpo(int helpBase, int helpExpo){
    return erExpoHelp(helpBase, helpExpo);
}
public static long erExpoHelp(int hb, int he){
    if(he==0){
        return 1;
    }
    return hb *= erExpoHelp(hb, he-1);
}
public static void timeDiff(long t1, long t2){
    long tdiff = t2-t1;
    System.out.println("Benötigte Zeit: "+tdiff/1000+"ms");
}
}
