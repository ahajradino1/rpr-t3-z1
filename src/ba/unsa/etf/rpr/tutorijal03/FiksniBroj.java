package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    public enum Grad {
        SARAJEVO("033"), TUZLA("035"), ZENICA("032"), BRCKO("049"), TRAVNIK("030"), ORASJE("031"), LIVNO("034"), MOSTAR("036"), BIHAC("037"), GORAZDE("038"), SIROKIBRIJEG("039");
        private final String pozivni;
        Grad(String pozivni) {
            this.pozivni = pozivni;
        }
        public String getPozivni() {
            return pozivni;
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
