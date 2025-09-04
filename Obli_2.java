package Java.lab_3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Obli_2 {
    public static void main(String[] args){
        List<String> karakterer = new ArrayList<String>();
        Scanner poeng=new Scanner(System.in);
        for (int i=1; i<=10; i++){
            String Bokstav="";
            
            System.out.println("Skriv inn poeng summen din");
            double karakter = poeng.nextDouble();
            if(karakter<0 || karakter>100) {
                System.out.println("Dette er ikke gyldig skriv inn et nummer mellom 0 og 100");
                double karakter2 = poeng.nextDouble();
                if (karakter2<=39 && karakter2>0) {
                System.out.println("Karakterne din er F");
                Bokstav="F";
                }
                if (karakter2<=49 && karakter2>39) {
                System.out.println("Karakterne din er E");
                Bokstav="E";
                }
                if (karakter2<=59 && karakter2>49) {
                System.out.println("Karakterne din er D");
                Bokstav="D";
                }
                if (karakter2<=79 && karakter2>59) {
                System.out.println("Karakterne din er C");
                Bokstav="C";
                }
                if (karakter2<=89 && karakter2>79) {
                System.out.println("Karakterne din er B");
                Bokstav="B";
                }
                if (karakter2<=100 && karakter2>89) {
                System.out.println("Karakterne din er A");
                Bokstav="A";
                }
            }
        
            if (karakter<=39 && karakter>=0) {
            System.out.println("Karakterne din er F");
            Bokstav="F";
            }
            if (karakter<=49 && karakter>39) {
            System.out.println("Karakterne din er E");
            Bokstav="E";
            }
            if (karakter<=59 && karakter>49) {
            System.out.println("Karakterne din er D");
            Bokstav="D";
            }
            if (karakter<=79 && karakter>59) {
            System.out.println("Karakterne din er C");
            Bokstav="C";
            }
            if (karakter<=89 && karakter>79) {
            System.out.println("Karakterne din er B");
            Bokstav="B";
            }
            if (karakter<=100 && karakter>89) {
            System.out.println("Karakterne din er A");
            Bokstav="A";
            }
            karakterer.add(Bokstav);
            
        
        }
        System.out.println(karakterer);
        poeng.close();
    }

}

