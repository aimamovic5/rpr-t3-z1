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
    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }


}
