package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    private String Broj;
    private int MobilnaMreza;

    public String getBroj() {
        return Broj;
    }

    public void setBroj(String broj) {
        Broj = broj;
    }

    public int getMobilnaMreza() {
        return MobilnaMreza;
    }

    public void setMobilnaMreza(int mobilnaMreza) {
        MobilnaMreza = mobilnaMreza;
    }

    @Override
    public String ispisi() {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
