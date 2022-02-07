public class zadatakk {

    //42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".
    public static void main(String[] args) {

        String[] nizImena = {"Ana", "Ivana", "Luka", "Stefan", "Marija", "Dusan"};

        System.out.println(proveraNiza( nizImena));
    }

    public static String proveraNiza(String nizImena[]) {

        String Marija = "Ime Marija ne postoji u ovom nizu.";
        String Petar = "Ime Petar ne postoji u ovom nizu";

        for (int i = 0; i < nizImena.length; i++) {
            if (nizImena[i] == "Marija") {

                Marija = "Ime Marija postoji u ovom nizu.";

            } else if (nizImena[i] == "Petar") {
                Petar = "Ime Petar postoji u ovom nizu.";
            }
        }
        return Marija + " " + Petar + ".";
    }
}





