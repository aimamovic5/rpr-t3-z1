package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;
    enum Grad {
        SARAJEVO, TUZLA, ZENICA, MOSTAR, BIHAĆ, BANJA_LUKA, TREBINJE, BRČKO, GORAŽDE, ŠIROKI_BRIJEG, ORAŠJE, LIVNO, BIJELJINA, PALE;
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
