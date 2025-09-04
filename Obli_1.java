package Java.lab_3;
import java.util.Scanner;

public class Obli_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Oppgi brutto årsinntekt (i NOK): ");
        double inntekt = scanner.nextDouble();

        double trinnskatt = 0;

        // Trinn 5
        if (inntekt >= 1410751) {
            trinnskatt += (inntekt - 1410751) * 0.177;
            inntekt = 1410751;
        }   
        // Trinn 4
        if (inntekt >= 942400) {
            trinnskatt += (inntekt - 942400) * 0.167;
            inntekt = 942400;
        }
        // Trinn 3
        if (inntekt >= 697151) {
            trinnskatt += (inntekt - 697151) * 0.137;
            inntekt = 697151;
        }
        // Trinn 2
        if (inntekt >= 306051) {
            trinnskatt += (inntekt - 306051) * 0.04;
            inntekt = 306051;
        }
        // Trinn 1
        if (inntekt >= 217401) {
            trinnskatt += (inntekt - 217401) * 0.017;
        }

        System.out.println("Trinnskatten din er: " + trinnskatt);

        scanner.close();
    }
}