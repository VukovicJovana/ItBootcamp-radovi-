import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        //3. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int i;

                 for(i=0; i<=n; i++){
                     System.out.println(i);
                 }
    }
}
