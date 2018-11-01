package ba.unsa.etf.rpr.tutorijal03;

import java.util.concurrent.TransferQueue;

public class FiksniBroj extends TelefonskiBroj {
    public enum Grad {
        SARAJEVO("033"), TUZLA("035"), ZENICA("032"), BRCKO("049"), TRAVNIK("030"), ORASJE("031"), LIVNO("034"), MOSTAR("036"), BIHAC("037"), GORAZDE("038"), SIROKIBRIJEG("039");
        private String pozivni;
        Grad(String pozivni) {
            this.pozivni = pozivni;
        }
        public String getPozivni() {
            return pozivni;
        }
        public static Grad izPozivnog (String s) throws IllegalArgumentException {
            switch (s){
                case "033": return SARAJEVO;
                case "035": return TUZLA;
                case "032": return ZENICA;
                case "049": return BRCKO;
                case "030": return TRAVNIK;
                case "031": return ORASJE;
                case "034": return LIVNO;
                case "036": return MOSTAR;
                case "037": return BIHAC;
                case "038": return GORAZDE;
                case "039": return SIROKIBRIJEG;
                default: throw new IllegalArgumentException("Pogresan pozivni broj");
            }
        }
    }
    private Grad grad;
    private String broj;
    FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = grad.getPozivni() + "/" + broj;
    }

    @Override
    public String ispisi() {
        return broj;
    }
    @Override
    public int hashCode() {
        return broj.hashCode();
    }
    @Override
    public boolean equals(Object o) {
        FiksniBroj fiksniBroj = (FiksniBroj) o;
        return broj.equals(fiksniBroj.broj);
    }
    @Override
    public String dajBroj() {
        return broj;
    }
}
