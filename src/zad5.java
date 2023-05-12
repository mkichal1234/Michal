import java.util.Scanner;
public class zad5 {
    public static void main(String[] args) {
        double masa, ciężar;

        Scanner input = new Scanner(System.in);
        System.out.print("Podaj masę obiektu w kilogramach: ");
        masa = input.nextDouble();

        ciężar = masa * 9.81; // przyjęta wartość przyspieszenia ziemskiego w m/s^2

        System.out.println("Ciężar obiektu wynosi: " + ciężar + " N");

        if (ciężar > 1000) {
            System.out.println("Obiekt jest zbyt ciężki!");
        } else if (ciężar < 10) {
            System.out.println("Obiekt jest za lekki!");
        }
    }
}
