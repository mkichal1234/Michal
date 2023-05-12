import java.util.Scanner;
public class zad1 {

    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Proszę podać cyfrę z przedziału od 1 do 10");
        int cyfra = klawisz.nextInt();
        if (cyfra ==1){
            System.out.println("I");
        }
        else if (cyfra ==2) {
            System.out.println("II");
        }
        else if (cyfra ==3) {
            System.out.println("III");
        }
        else if (cyfra ==4) {
            System.out.println("IV");
        }
        else if (cyfra ==5) {
            System.out.println("V");
        }
        else if (cyfra ==6) {
            System.out.println("VI");
        }
        else if (cyfra ==7) {
            System.out.println("VII");
        }
        else if (cyfra ==8) {
            System.out.println("VIII");
        }
        else if (cyfra ==9) {
            System.out.println("IX");
        }
        else if (cyfra ==10) {
            System.out.println("X");
        }
        else if (cyfra >10) {
            System.out.println("Zła liczba");
        }

        klawisz.nextLine();
    }
}

