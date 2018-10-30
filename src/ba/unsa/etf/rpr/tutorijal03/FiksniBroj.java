package ba.unsa.etf.rpr.tutorijal03;

import java.security.cert.CertPathBuilderResult;

public class FiksniBroj extends TelefonskiBroj implements Comparable {
    private Grad grad;
    private String broj;

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
        if (this.getGrad().equals(Grad.SARAJEVO))
            num = "033";
        if (this.getGrad().equals(Grad.TUZLA))
            num = "035";
        if (this.getGrad().equals(Grad.ZENICA))
            num = "032";
        num = num + "/" + broj;
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
