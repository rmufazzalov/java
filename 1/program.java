
/**
 * program
 */
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = iScanner.nextInt();
        int t = n * (n + 1) / 2;
        System.out.println(t);
        iScanner.close();
    }
}