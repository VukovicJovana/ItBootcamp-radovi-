import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //4. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.
        int n= sc.nextInt();
        int i;
        for(i=n; i<=0;i++){
            System.out.println(i);
        }
    }
}
