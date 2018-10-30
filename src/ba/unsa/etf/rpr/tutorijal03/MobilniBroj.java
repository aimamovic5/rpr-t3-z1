package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    private String Broj;
    private int mobilnaMreza;

    MobilniBroj(int mobilnaMreza, String Broj) {
        this.setMobilnaMreza(mobilnaMreza);
        this.setBroj(Broj);
    }
    public String getBroj() {
        return Broj;
    }

    public void setBroj(String broj) {
        Broj = broj;
    }

    public int getMobilnaMreza() {
        return mobilnaMreza;
    }

    public void setMobilnaMreza(int mobilnaMreza) {
        this.mobilnaMreza = mobilnaMreza;
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
