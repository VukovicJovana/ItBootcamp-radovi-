import java.util.Scanner;

public class Grananja1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite broj ");
        int broj = scanner.nextInt();


        if(broj % 2 == 0) {
            System.out.print("Uneti broj je paran.");
        } else {
            System.out.print("Uneti broj je neparan.");
        }

    }
}
