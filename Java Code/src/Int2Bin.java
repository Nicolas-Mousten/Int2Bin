import java.util.Scanner;

public class Int2Bin {
    public static void main(String[] args) {
        //write your code here
        //udskriv programs function til skærm
        System.out.println("Opretter fra binært tal til decimal tal");
        // opret et objekt af scanner
        Scanner scanner = new Scanner(System.in);
        //skriv til skærmen at bruger skal indtaste binært tal
        System.out.print("Indtast venlist bin tal: ");
        String num = scanner.next();
        //omregning
        double result = 0;

        for (int i = 0; i < num.length(); i++) {
            result = result + Math.pow(2,i) * Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        //Print the total
        System.out.println("Omvandlingen blev til:");
        System.out.println((int)result);


        /*
            for (i = 0; i < num.length; ++i)
            {
                // omregn fra bin til dec
                result = result + Math.pow(2, i) * num[i];
            }
        */

    }
}
