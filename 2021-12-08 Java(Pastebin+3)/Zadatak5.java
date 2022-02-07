import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        //5. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=-14; i<=n*2; i++) {
            System.out.println(i);



        }
    }
}
