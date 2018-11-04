package ba.unsa.etf.rpr.tutorijal03;

import java.security.cert.CertPathBuilderResult;

public class FiksniBroj extends TelefonskiBroj implements Comparable {
    private Grad grad;

    @Override
    public int compareTo(Object o) {
        if(o instanceof FiksniBroj)
            return ispisi().compareTo(((FiksniBroj)o).ispisi());
        return 0;
    }

    public enum Grad {
        SARAJEVO, TUZLA, ZENICA, MOSTAR, BIHAC, BANJA_LUKA, TREBINJE, BRCKO, GORAZDE, SIROKI_BRIJEG, ORASJE, LIVNO, BIJELJINA, PALE, TRAVNIK;
    }

    @Override
    public String ispisi() {
        String num = new String();
        if (this.getGrad() == Grad.SARAJEVO)
            num = "033";
        if (this.getGrad().equals(Grad.TUZLA))
            num = "035";
        if (this.getGrad().equals(Grad.ZENICA))
            num = "032";
        num = num + "/" + getBroj();
        return num;
    }

    @Override
    public int hashCode() {
        return this.getGrad().hashCode();
    }

    public FiksniBroj(Grad grad, String broj) {
        super(broj);
        this.setGrad(grad);
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }
}
