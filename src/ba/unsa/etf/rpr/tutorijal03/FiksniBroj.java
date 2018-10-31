package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    public enum Grad {
        SARAJEVO(0), TUZLA(1), ZENICA(2), BRCKO(3), TRAVNIK(4), ORASJE(5), LIVNO(6), MOSTAR(7), BIHAC(8), GORAZDE(9), SIROKIBRIJEG(10);
        private int indeks;
        private String pozivni[] = {"033", "035", "032", "049", "030", "031", "034", "036", "037", "038", "039"};
        Grad(int indeks) {
            this.indeks = indeks;
        }
        public String dajPozivni() {
            return pozivni[indeks];
        }
    }
    private Grad grad;
    private String broj;
    FiksniBroj(Grad grad, String broj) {
        String s = "";
        if(grad == Grad.SARAJEVO) s += "033/";
        else if(grad == Grad.TUZLA) s += "035/";
        else if(grad == Grad.ZENICA) s += "032/";
        else if(grad == Grad.BRCKO) s += "049/";
        else if(grad == Grad.TRAVNIK) s += "030/";
        else if(grad == Grad.ORASJE) s += "031/";
        else if(grad == Grad.LIVNO) s += "034/";
        else if(grad == Grad.MOSTAR) s +="036/";
        else if(grad == Grad.BIHAC) s += "037/";
        else if(grad == Grad.GORAZDE) s += "038/";
        else if(grad == Grad.SIROKIBRIJEG) s += "039/";
        s += broj;
        this.grad = grad;
        this.broj = s;
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
