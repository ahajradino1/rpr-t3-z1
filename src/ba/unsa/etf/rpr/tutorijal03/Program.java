package ba.unsa.etf.rpr.tutorijal03;
import java.util.Scanner;
public class Program {

    public static void main(String[] args) {
        int opcija;
        System.out.println("Izaberite metodu koju zelite pozvati:  \n" +
                "1. Unos  fiksnog broja.\n2. Unos mobilnog broja.\n" +
                "3. Unos medjunarodnog broja.\n" +
                "4. Dodavanje grada.\n" +
                "5. Ispis fiksnog broja.\n" +
                "6. Ispis mobilnog broja.\n" +
                "7. Ispis medjunarodnog broja.\n" +
                "8. Ispis imena korisnika sa zeljenim telefonskim brojem.\n" +
                "9. Ispis korisnika cije ime pocinje zeljenim slovom.\n" +
                "10. Ispis korisnika iz zeljenog grada.\n" +
                "11. Ispis brojeva koristenih u zeljenom gradu.");
        Scanner sc = new Scanner(System.in);
        opcija = sc.nextInt();
    }
}
