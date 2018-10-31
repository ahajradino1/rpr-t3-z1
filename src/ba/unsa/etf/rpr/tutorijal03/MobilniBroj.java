package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj{
    private String broj;
    MobilniBroj(int mobilnaMreza, String broj) {
        this.broj = "0" + Integer.toString(mobilnaMreza) + "/" + broj;
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
        MobilniBroj mobilniBroj = (MobilniBroj) o;
        return broj.equals(mobilniBroj.broj);
    }
    @Override
    public String dajBroj() {
        return broj;
    }
}
