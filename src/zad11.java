import java.util.Scanner;
public class zad11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj nazwiska i czasy ukończenia biegu trzech biegaczy:");
        System.out.print("Biegacz 1 - nazwisko: ");
        String nazwisko1 = input.nextLine();
        System.out.print("Biegacz 1 - czas: ");
        int czas1 = input.nextInt();
        input.nextLine();

        System.out.print("Biegacz 2 - nazwisko: ");
        String nazwisko2 = input.nextLine();
        System.out.print("Biegacz 2 - czas: ");
        int czas2 = input.nextInt();
        input.nextLine();

        System.out.print("Biegacz 3 - nazwisko: ");
        String nazwisko3 = input.nextLine();
        System.out.print("Biegacz 3 - czas: ");
        int czas3 = input.nextInt();
        input.nextLine();


        String pierwszy, drugi, trzeci;
        if (czas1 < czas2 && czas1 < czas3) {
            pierwszy = nazwisko1;
            if (czas2 < czas3) {
                drugi = nazwisko2;
                trzeci = nazwisko3;
            } else {
                drugi = nazwisko3;
                trzeci = nazwisko2;
            }
        } else if (czas2 < czas1 && czas2 < czas3) {
            pierwszy = nazwisko2;
            if (czas1 < czas3) {
                drugi = nazwisko1;
                trzeci = nazwisko3;
            } else {
                drugi = nazwisko3;
                trzeci = nazwisko1;
            }
        } else {
            pierwszy = nazwisko3;
            if (czas1 < czas2) {
                drugi = nazwisko1;
                trzeci = nazwisko2;
            } else {
                drugi = nazwisko2;
                trzeci = nazwisko1;
            }
        }


        System.out.println("Kolejność na mecie: ");
        System.out.println("1. " + pierwszy);
        System.out.println("2. " + drugi);
        System.out.println("3. " + trzeci);

        input.close();
    }
}