package Java.lab_3;
import java.util.Scanner;
public class Obli_3 {
    public static void main(String [] args) {
        Scanner helltall =new Scanner(System.in);
        System.out.println("Skriv et helltall som er større en 0");
        int n = helltall.nextInt();
        int N = 1;
        for (int i=1; i<=n; i++) {
            N *= i;
        }
        System.out.println(n + "! = "+ N);
    }
}
