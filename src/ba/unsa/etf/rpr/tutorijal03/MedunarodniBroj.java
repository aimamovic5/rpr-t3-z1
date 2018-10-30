package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj {
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
        return super.hashCode();
    }

    @Override
    public String toString() {
        return new String(this.getDrzava().concat("/") + this.getBroj());
    }
}
