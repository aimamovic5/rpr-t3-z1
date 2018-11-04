package ba.unsa.etf.rpr.tutorijal03;

public abstract class TelefonskiBroj {
    private String broj;
    public abstract String ispisi();
    public abstract int hashCode();
    public String getBroj() {
        return broj;
    };
    public TelefonskiBroj(String broj) {
        this.broj = broj;
    }
}
