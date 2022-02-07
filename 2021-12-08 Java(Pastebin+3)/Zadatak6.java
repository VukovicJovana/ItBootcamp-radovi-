import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Zadatak6 {
    public static void main(String[] args) {
        //6. Ispisati proizvod prvih n celih brojeva [1, n].
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int brojac=1;
        for(int i=1; i<=n; i++){
            brojac=brojac*i;

        }
        System.out.println(brojac);
    }

}
