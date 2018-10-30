package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    private String Drzava;
    private String Broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.setDrzava(drzava);
        this.setBroj(broj);
    }

    public String getDrzava() {
        return Drzava;
    }

    public void setDrzava(String drzava) {
        Drzava = drzava;
    }

    public String getBroj() {
        return Broj;
    }

    public void setBroj(String broj) {
        Broj = broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String ispisi() {
        return new String(this.getDrzava().concat("/") + this.getBroj());
    }
}
