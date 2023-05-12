import java.util.Scanner;
public class zad8{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę zakupionych pakietów: ");
        int liczbaPakietow = scanner.nextInt();

        double cenaPakietu = 99.0;
        double rabat = 0.0;
        if (liczbaPakietow >= 10 && liczbaPakietow <= 19) {
            rabat = 0.2;
        } else if (liczbaPakietow >= 20 && liczbaPakietow <= 49) {
            rabat = 0.3;
        } else if (liczbaPakietow >= 50 && liczbaPakietow <= 99) {
            rabat = 0.4;
        } else if (liczbaPakietow >= 100) {
            rabat = 0.5;
        }

        double cenaPoRabacie = cenaPakietu * liczbaPakietow * (1 - rabat);
        System.out.printf("Rabat: %.0f%%\n", rabat * 100);
        System.out.printf("Łączna kwota po rabacie: %.2f zł\n", cenaPoRabacie);
    }

}