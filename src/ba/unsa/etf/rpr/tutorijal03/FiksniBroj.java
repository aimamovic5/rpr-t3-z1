package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;
    enum Grad {
        SARAJEVO, TUZLA, ZENICA, MOSTAR, BIHAĆ, BANJA_LUKA, TREBINJE, BRČKO, GORAŽDE, ŠIROKI_BRIJEG, ORAŠJE, LIVNO, BIJELJINA, PALE, TRAVNIK;
    }

    @Override
    public String ispisi() {
        String broj = new String();
        if (this.getGrad().equals(Grad.SARAJEVO))
            broj = "033";
        if (this.getGrad().equals(Grad.TUZLA))
            broj = "035";
        if (this.getGrad().equals(Grad.ZENICA))
            broj = "032";
        broj.concat("/" + broj);
        return broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public String getBroj() {
        return broj;
    }

    public FiksniBroj(Grad grad, String broj) {
        this.setGrad(grad);
        this.setBroj(broj);
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
