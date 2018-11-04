package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava;

    public MedunarodniBroj(String drzava, String broj) {
        super(broj);
        this.setDrzava(drzava);
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    @Override
    public int hashCode() {
        return getDrzava().hashCode();
    }

    @Override
    public String ispisi() {
        return new String(this.getDrzava().concat("/") + this.getBroj());
    }
}
