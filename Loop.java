
//package demodialog;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        n = sc.nextInt();
        for (int i = 10; i <= n; i++) {
            System.out.print(i + "");
        }
        System.out.println();
        for (int i = n; i >= 10; i--) {
            System.out.print(i + "");
        }
        System.out.println();
    }
}
