import java.util.Scanner;

public class domaciSuma {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 2.[Suma intervala] Korisnik unosi cele brojeve m i n sa konzole, m <= n.
        // Ispisati sumu brojeva [m, n].
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for(int i = m; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}


