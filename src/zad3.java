import java.util.Scanner;
public class zad3 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Proszę podać wage");
        double dzien = klawisz.nextDouble();
        System.out.println("Proszę podać wzrost");
        double miesiac = klawisz.nextDouble();


        double liczba = dzien/(miesiac*2);

        if ((liczba > 18.5) &&(liczba <25)) {
            System.out.println("Masz optymalną wagę");
        } else if(liczba < 18)  {
            System.out.println("Masz niedowage");
        }
        else if (liczba > 25)
        {
            System.out.println("Masz nadwage");
        }
        System.out.println("Twoje BMI :"+liczba);
        klawisz.nextLine();


    }
}
