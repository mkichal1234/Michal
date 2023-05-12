import java.util.Scanner;
public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę sekund: ");
        int seconds = scanner.nextInt();

        if (seconds >= 86400) {
            int days = seconds / 86400;
            System.out.println("Liczba dni: " + days);
            seconds -= days * 86400;
        }

        if (seconds >= 3600) {
            int hours = seconds / 3600;
            System.out.println("Liczba godzin: " + hours);
            seconds -= hours * 3600;
        }

        if (seconds >= 60) {
            int minutes = seconds / 60;
            System.out.println("Liczba minut: " + minutes);
            seconds -= minutes * 60;
        }

        System.out.println("Liczba sekund: " + seconds);
    }
}

