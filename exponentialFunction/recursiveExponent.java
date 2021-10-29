import java.util.Scanner;

public class recursiveExponent {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte geben Sie die gewünschte Grundzahl ein: ");
        int b = input.nextInt();
        System.out.print("Bitte geben Sie den gewünschten Exponenten ein: ");
        int e = input.nextInt();
        input.close(); 
        
        int expon = recursiveExpo(b, e);
        System.out.println("Rekursiver Exponent");
        System.out.println("Die Summe ist: "+expon+"");
    }


public static int recursiveExpo(int helpBase, int helpExpo){	
    if (helpExpo==0){ 
        return 1; 
    }else {  
        helpBase *= recursiveExpo(helpBase, helpExpo-1); 
    }
    return helpBase;
}
}
