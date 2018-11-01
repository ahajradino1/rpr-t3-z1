package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

public class Imenik {
    HashMap<String, TelefonskiBroj> imenik;
    Imenik() {
        imenik = new HashMap();
    }
    void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(ime, broj);
    }
    String dajBroj(String ime) {
        return imenik.get(ime).ispisi();
    }
    String dajIme(TelefonskiBroj broj) {
        for(HashMap.Entry<String, TelefonskiBroj> entry : imenik.entrySet())
            if(entry.getValue().equals(broj)) return entry.getKey();
        return null;
    }
    String naSlovo(char s) {
        String string = "";
        int brojac = 0;
        for(HashMap.Entry<String, TelefonskiBroj> entry : imenik.entrySet())
            if(entry.getKey().charAt(0) == s)
                string += Integer.toString(++brojac) + ". " + entry.getKey() + " - " + entry.getValue().ispisi();
        return string;
    }
    Set<String> izGrada(FiksniBroj.Grad g) {
        SortedSet<String> stanovniciGrada = new TreeSet();
        for(HashMap.Entry<String, TelefonskiBroj> entry : imenik.entrySet())
            if(entry.getValue().dajBroj().substring(0, 3).equals(g.getPozivni())) stanovniciGrada.add(entry.getKey());
        return stanovniciGrada;
    }
    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        Comparator<TelefonskiBroj> comparator = (TelefonskiBroj  broj1, TelefonskiBroj  broj2) -> (broj1.ispisi().compareTo(broj2.ispisi()));
        SortedSet<TelefonskiBroj> brojevi = new TreeSet(comparator);
        for(HashMap.Entry<String, TelefonskiBroj> entry : imenik.entrySet())
            if(entry.getValue().dajBroj().substring(0, 3).equals(g.getPozivni())) brojevi.add(entry.getValue());
        return brojevi;
    }
}

