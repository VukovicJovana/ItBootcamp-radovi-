import java.util.Scanner;

public class PetakDomaci {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = sc.nextInt();
        int f = 1;
        for (int x =  1; x <= n  ;x++ ) {
            f = f * x;
        }
        System.out.println(f);
    }
}


