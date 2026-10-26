import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę (a): ");
        int a = skaner.nextInt();

        System.out.print("Podaj drugą liczbę (b): ");
        int b = skaner.nextInt();

        int suma = a + b;
        System.out.println("Suma liczb " + a + " i " + b + " wynosi: " + suma);
        skaner.close();
    }
}