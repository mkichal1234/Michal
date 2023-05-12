import java.util.Scanner;
public class zad15 {
    public static void main(String[] args) {
        final double BASE_FEE = 10.0;
        final double FEE_UNDER_20 = 0.1;
        final double FEE_20_TO_39 = 0.08;
        final double FEE_40_TO_59 = 0.06;
        final double FEE_OVER_60 = 0.04;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę czeków: ");
        int checks = scanner.nextInt();

        double checkFee;
        if (checks < 20) {
            checkFee = FEE_UNDER_20;
        } else if (checks < 40) {
            checkFee = FEE_20_TO_39;
        } else if (checks < 60) {
            checkFee = FEE_40_TO_59;
        } else {
            checkFee = FEE_OVER_60;
        }

        double totalFee = BASE_FEE + (checkFee * checks);
        System.out.printf("Miesięczna opłata: %.2f zł\n", totalFee);
    }
}

