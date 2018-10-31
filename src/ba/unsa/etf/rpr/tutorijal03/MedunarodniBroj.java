package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    private String broj;
    MedunarodniBroj(String drzava, String broj) {
        this.broj = drzava + "/" + broj;
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
        MedunarodniBroj medunarodniBroj = (MedunarodniBroj) o;
        return broj.equals(medunarodniBroj.broj);
    }
    @Override
    public String dajBroj() {
        return broj;
    }
}
