public class zadatak41 {


    public static void main(String[] args) {


        double[] nizBrojeva = {2.8, 1.8, 20.7, 3.3, 5.97, 0.05, 23.25};

        System.out.println("Prosecna vrednost niza je jednaka broju " + prosecnaVrednost(nizBrojeva) + ".");


    }
    public static double prosecnaVrednost(double nizBrojeva[]){

        double suma = 0;
        double prosecnavrednost;

        for (int i = 0; i < nizBrojeva.length; i++) {

            suma = suma + nizBrojeva[i];
        }
        prosecnavrednost = suma / nizBrojeva.length;
        return prosecnavrednost;

    }
}



