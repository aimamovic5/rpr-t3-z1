package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    private String Broj;
    private int mobilnaMreza;

    MobilniBroj(int mobilnaMreza, String broj) {
        super(broj);
        this.setMobilnaMreza(mobilnaMreza);
    }


    public int getMobilnaMreza() {
        return mobilnaMreza;
    }

    public void setMobilnaMreza(int mobilnaMreza) {
        this.mobilnaMreza = mobilnaMreza;
    }

    @Override
    public String ispisi() {
        return new String("0" + Integer.toString(this.getMobilnaMreza()) + "/" + getBroj());
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
