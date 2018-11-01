package ba.unsa.etf.rpr.tutorijal03;
import java.util.Scanner;

public class Program {
    public static void unosIspisFiksnogBroja() {
        System.out.println("Unesite fiksni broj u obliku 'xxx-xxx': ");
        Scanner sc = new Scanner(System.in);
        String broj = sc.next();
        System.out.println("Unesite pozivni broj: ");
        String pozivniBroj = sc.next();
      //  FiksniBroj.Grad grad =  FiksniBroj.Grad.valueOf(pozivniBroj);
        FiksniBroj fiksniBroj = new FiksniBroj(FiksniBroj.Grad.izPozivnog(pozivniBroj), broj);
        System.out.println(fiksniBroj.ispisi());
    }
    public static void unosIspisMobilnogBroja() {
        System.out.println("Unesite mobilni broj u obliku 'xxx-xxx'");
        Scanner sc = new Scanner(System.in);
        String broj = sc.next();
        System.out.println("Unesite mobilnu mrezu (60 - 67): ");
        int mreza = sc.nextInt();
        MobilniBroj mobilniBroj = new MobilniBroj(mreza, broj);
        System.out.println(mobilniBroj.ispisi());
    }
    public static void unosIspisMedunarodnogBroja() {
        System.out.println("Unesite medjunarodni broj u obliku 'xx xx-xx-xx'");
        Scanner sc = new Scanner(System.in);
        String broj = sc.nextLine();
        System.out.println("Unesite pozivni broj za drzavu: ");
        String drzava = sc.nextLine();
        MedunarodniBroj medunarodniBroj = new MedunarodniBroj(drzava, broj);
        System.out.println(medunarodniBroj.ispisi());
    }
    public static void dodavanjeBrojaUImenik() {
        System.out.println("Unesite ime korisnika: ");
        Scanner sc = new Scanner(System.in);
        String korisnik = sc.nextLine();
        System.out.println("Unesite 1 za unos fiksnog broja, 2 za unos mobilnog broja, 3 za unos medjunarodnog broja: ");
        int opcija = sc.nextInt();
        if (opcija == 1) unosIspisFiksnogBroja();
        else if (opcija == 2) unosIspisFiksnogBroja();
        else unosIspisMedunarodnogBroja();
    }
    public static void main(String[] args) {
        int opcija;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Izaberite metodu koju zelite pozvati:  \n" +
                    "1. Unos i ispis fiksnog broja.\n" +
                    "2. Unos i ispis mobilnog broja.\n" +
                    "3. Unos i ispis medjunarodnog broja.\n" +
                    "4. Dodavanje grada.\n" +
                    "5. Ispis imena korisnika sa zeljenim telefonskim brojem.\n" +
                    "6. Ispis korisnika cije ime pocinje zeljenim slovom.\n" +
                    "7. Ispis korisnika iz zeljenog grada.\n" +
                    "9. Ispis brojeva koristenih u zeljenom gradu.");
            opcija = sc.nextInt();
            if(opcija == 1) unosIspisFiksnogBroja();
            else if(opcija == 2) unosIspisMobilnogBroja();
            else if(opcija == 3) unosIspisMedunarodnogBroja();
            else if(opcija == 4) dodavanjeBrojaUImenik();
        } while(opcija != 0);
    }
}
