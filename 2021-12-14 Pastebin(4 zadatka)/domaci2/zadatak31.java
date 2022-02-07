package domaci2;

public class zadatak31 {
    public static void main(String[] args) {
      /*  31. Napisati funkciju koja racuna proizvod 3 broja.
                Hint kako citati ove zadatke:
        - ... racuna proizvod 3 broja = proseldjuje joj se 3 broja (imace 3 argumenta)
                - funkciju koja racuna = vraca odgovarajuci podatak (nece biti void nego nesto konkretno)*/


        System.out.println(proizvod(9, 5, 2));
    }

    public static int proizvod(int x, int y, int z) {
        int d = x * y * z;
        //System.out.println(z);
        return d;
    }}


