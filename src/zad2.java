import java.util.Scanner;
public class zad2
 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Proszę podać dzień");
        int dzien = klawisz.nextInt();
        System.out.println("Proszę podać miesiac");
        int miesiac = klawisz.nextInt();
        System.out.println("Proszę podać ostatnie cyfry roku");
        int cyfry = klawisz.nextInt();

        int liczba = dzien * miesiac;

        if (liczba == cyfry) {
            System.out.println("Jest to magiczna data");
        } else  {
            System.out.println("To nie jest magiczna data");
        }

        klawisz.nextLine();


    }
}
