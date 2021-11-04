import java.util.Scanner;

public class recursiveProdukt {
    public static class iterativeAndRecursiveSumme {
        public static void main(String[] args) throws Exception {
            Scanner input = new Scanner(System.in);
            System.out.print("Bitte geben Sie das gewünschte Produkt ein: ");
            int r = input.nextInt();
            input.close(); 
            int rProd = recursiveProd(r);
            System.out.println("Rekursives Produkt");
            System.out.println("Das Produkt ist: "+rProd+"");
        }      
    public static int recursiveProd(int helpNum){
        if (helpNum != 0) {
            return helpNum * recursiveProd(helpNum - 1);
        }else {
            return helpNum;
        }
    }  
} 
}
