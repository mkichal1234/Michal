import java.util.Scanner;
public class zad7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Podaj pierwsze imię: ");
        String name1 = input.nextLine();

        System.out.print("Podaj drugie imię: ");
        String name2 = input.nextLine();

        System.out.print("Podaj trzecie imię: ");
        String name3 = input.nextLine();

        System.out.print("Podaj czwarte imię: ");
        String name4 = input.nextLine();

        String first, second, third, fourth;

        if (name1.compareTo(name2) < 0) {
            first = name1;
            second = name2;
        } else {
            first = name2;
            second = name1;
        }

        if (name3.compareTo(name4) < 0) {
            third = name3;
            fourth = name4;
        } else {
            third = name4;
            fourth = name3;
        }

        if (first.compareTo(third) < 0) {
            System.out.println(first);
            if (second.compareTo(third) < 0) {
                System.out.println(second);
                System.out.println(third);
                System.out.println(fourth);
            } else {
                System.out.println(third);
                if (second.compareTo(fourth) < 0) {
                    System.out.println(second);
                    System.out.println(fourth);
                } else {
                    System.out.println(fourth);
                    System.out.println(second);
                }
            }
        } else {
            System.out.println(third);
            if (fourth.compareTo(first) < 0) {
                System.out.println(fourth);
                System.out.println(first);
                System.out.println(second);
            } else {
                System.out.println(first);
                if (fourth.compareTo(second) < 0) {
                    System.out.println(fourth);
                    System.out.println(second);
                } else {
                    System.out.println(second);
                    System.out.println(fourth);
                }
            }
        }
    }
}