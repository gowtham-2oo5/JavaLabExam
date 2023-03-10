import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat nf;
            nf=NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            String ind=nf.format(payment);
            nf=NumberFormat.getCurrencyInstance(Locale.US);
            String us=nf.format(payment);
            nf=NumberFormat.getCurrencyInstance(Locale.CHINA);
            String china=nf.format(payment);
            nf=NumberFormat.getCurrencyInstance(Locale.FRANCE);
            String france=nf.format(payment);
            String r="Rs.";
            String indf=ind.substring(1, ind.length());
            String india=r+indf;
            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
    }
}
