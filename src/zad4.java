import java.util.Scanner;
public class zad4  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wynik pierwszego testu: ");
        int wynik1 = scanner.nextInt();

        System.out.print("Podaj wynik drugiego testu: ");
        int wynik2 = scanner.nextInt();

        System.out.print("Podaj wynik trzeciego testu: ");
        int wynik3 = scanner.nextInt();

        double srednia = (wynik1 + wynik2 + wynik3) / 3.0;
        int ocena = 0;

        if (srednia >= 90) {
            ocena = 5;
        } else if (srednia >= 80) {
            ocena = 4;
        } else if (srednia >= 70) {
            ocena = 3;
        } else if (srednia >= 60) {
            ocena = 2;
        } else {
            ocena = 1;
        }

        System.out.println("Średnia wyników testów: " + srednia);
        System.out.println("Ocena: " + ocena);
    }
}