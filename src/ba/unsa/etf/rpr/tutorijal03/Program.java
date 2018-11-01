package ba.unsa.etf.rpr.tutorijal03;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.SARAJEVO;

public class Program {
    public static FiksniBroj unosFiksnogBroja() {
        System.out.println("Unesite fiksni broj u obliku 'xxx-xxx': ");
        Scanner sc = new Scanner(System.in);
        String broj = sc.next();
        System.out.println("Unesite pozivni broj: ");
        String pozivniBroj = sc.next();
      //  FiksniBroj.Grad grad =  FiksniBroj.Grad.valueOf(pozivniBroj);
        return new FiksniBroj(FiksniBroj.Grad.izPozivnog(pozivniBroj), broj);
    }
    public static void ispisFiksnogBroja() {
        System.out.println(unosFiksnogBroja().ispisi());
    }
    public static MobilniBroj unosMobilnogBroja() {
        System.out.println("Unesite mobilni broj u obliku 'xxx-xxx'");
        Scanner sc = new Scanner(System.in);
        String broj = sc.next();
        System.out.println("Unesite mobilnu mrezu (60 - 67): ");
        int mreza = sc.nextInt();
        return new MobilniBroj(mreza, broj);
    }
    public static void ispisMobilnogBroja() {
        System.out.println(unosMobilnogBroja().ispisi());
    }
    public static MedunarodniBroj unosMedunarodnogBroja() {
        System.out.println("Unesite medjunarodni broj u obliku 'xx xx-xx-xx'");
        Scanner sc = new Scanner(System.in);
        String broj = sc.nextLine();
        System.out.println("Unesite pozivni broj za drzavu: ");
        String drzava = sc.nextLine();
        return new MedunarodniBroj(drzava, broj);
    }
    public static void ispisMedunarodnogBroja() {
        System.out.println(unosMedunarodnogBroja().ispisi());
    }
    public static void dodavanjeBrojaUImenik() {
        System.out.println("Unesite ime korisnika: ");
        Scanner sc = new Scanner(System.in);
        String korisnik = sc.nextLine();
        System.out.println("Unesite 1 za unos fiksnog broja, 2 za unos mobilnog broja, 3 za unos medjunarodnog broja: ");
        int opcija = sc.nextInt();
        if (opcija == 1) unosFiksnogBroja();
        else if (opcija == 2) unosFiksnogBroja();
        else unosMedunarodnogBroja();
    }
    public static void ispisiSaTelefonskimBrojem() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Ajsa Hajradinovic", new FiksniBroj(SARAJEVO, "123-456"));
        imenik.dodaj("Sara Sarac", new FiksniBroj(SARAJEVO, "456-123"));
        System.out.println("Unesite 1 za unos fiksnog broja, 2 za unos mobilnog broja, 3 za unos medjunarodnog broja: ");
        Scanner sc = new Scanner(System.in);
        int opcija = sc.nextInt();
        TelefonskiBroj telefonskiBroj;
        if (opcija == 1) telefonskiBroj = unosFiksnogBroja();
        else if (opcija == 2) telefonskiBroj = unosFiksnogBroja();
        else telefonskiBroj = unosMedunarodnogBroja();
        if(imenik.dajIme(telefonskiBroj) != null)
            System.out.println(imenik.dajIme(telefonskiBroj));
        else
            System.out.println("Korisnik sa unijetim telefonskim brojem ne postoji!");
    }
    public static void ispisiSaPocetnimSlovom() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Sara Sarac", new FiksniBroj(SARAJEVO, "123-156"));
        imenik.dodaj("Pero Peric", new FiksniBroj(SARAJEVO, "123-656"));
        imenik.dodaj("Ivo Ivic", new MobilniBroj(61, "321-645"));
        imenik.dodaj("Jozo Jozic", new MobilniBroj(64, "987-654"));
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        System.out.println("Unesite pocetno slovo imena korisnika: ");
        Scanner sc = new Scanner(System.in);
        char pocetnoSlovo = sc.next().charAt(0);
        System.out.println(imenik.naSlovo(pocetnoSlovo));
    }
    public static void ispisiKorisnikeIzGrada() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Sara Sarac", new FiksniBroj(SARAJEVO, "123-156"));
        imenik.dodaj("Pero Peric", new FiksniBroj(SARAJEVO, "123-656"));
        imenik.dodaj("Ivo Ivic", new MobilniBroj(61, "321-645"));
        imenik.dodaj("Jozo Jozic", new MobilniBroj(64, "987-654"));
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        System.out.println("Unesite ime grada: ");
        Scanner sc = new Scanner(System.in);
        String imeGrada = sc.next().toUpperCase();
        Set<String> korisnici = imenik.izGrada(FiksniBroj.Grad.valueOf(imeGrada));
        String ispis = "";
        for (String ime: korisnici) {
            ispis += ime + ",";
        }
        System.out.println(ispis);
    }
    public static void ispisiBrojeveIzGrada() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Sara Sarac", new FiksniBroj(SARAJEVO, "123-156"));
        imenik.dodaj("Pero Peric", new FiksniBroj(SARAJEVO, "123-656"));
        imenik.dodaj("Ivo Ivic", new MobilniBroj(61, "321-645"));
        System.out.println("Unesite ime grada: ");
        Scanner sc = new Scanner(System.in);
        String imeGrada = sc.next().toUpperCase();
        Set<TelefonskiBroj> brojevi = imenik.izGradaBrojevi(FiksniBroj.Grad.valueOf(imeGrada));
        String ispis = "";
        for (TelefonskiBroj broj: brojevi) {
            ispis += broj.ispisi() + ",";
        }
        System.out.println(ispis);
    }
    public static void main(String[] args) {
        int opcija;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Izaberite metodu koju zelite pozvati (0 za kraj): \n" +
                    "1. Unos fiksnog broja.\n" +
                    "2. Ispis fiksnog broja.\n" +
                    "3. Unos mobilnog broja.\n" +
                    "4. Ispis mobilnog broja.\n" +
                    "5. Unos medjunarodnog broja.\n" +
                    "6. Ispis medjunarodnog broja.\n" +
                    "7. Dodavanje broja u imenik.\n" +
                    "8. Ispis imena korisnika sa zeljenim telefonskim brojem.\n" +
                    "9. Ispis korisnika cije ime pocinje zeljenim slovom.\n" +
                    "10. Ispis korisnika iz zeljenog grada.\n" +
                    "11. Ispis brojeva koristenih u zeljenom gradu." );
            opcija = sc.nextInt();
            if(opcija == 0) break;
            if(opcija == 1) unosFiksnogBroja();
            else if(opcija == 2) ispisFiksnogBroja();
            else if(opcija == 3) unosMobilnogBroja();
            else if(opcija == 4) ispisMobilnogBroja();
            else if(opcija == 5) unosMedunarodnogBroja();
            else if(opcija == 6) ispisMedunarodnogBroja();
            else if(opcija == 7) dodavanjeBrojaUImenik();
            else if(opcija == 8) ispisiSaTelefonskimBrojem();
            else if(opcija == 9) ispisiSaPocetnimSlovom();
            else if(opcija == 10) ispisiKorisnikeIzGrada();
            else ispisiBrojeveIzGrada();
        } while(opcija != 0);

    }
}
