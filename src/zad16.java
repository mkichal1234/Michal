import java.util.Scanner;
public class zad16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj liczbę zakupionych książek w tym miesiącu: ");
        int liczbaKsiazek = input.nextInt();

        int liczbaPunktow = 0;
        if (liczbaKsiazek == 1) {
            liczbaPunktow = 5;
        } else if (liczbaKsiazek == 2) {
            liczbaPunktow = 15;
        } else if (liczbaKsiazek == 3) {
            liczbaPunktow = 30;
        } else if (liczbaKsiazek == 4) {
            liczbaPunktow = 60;
        } else if (liczbaKsiazek >= 5) {
            liczbaPunktow = 130;
        }

        System.out.println("Otrzymałeś " + liczbaPunktow + " punktów za zakupy w tym miesiącu.");
    }
}
