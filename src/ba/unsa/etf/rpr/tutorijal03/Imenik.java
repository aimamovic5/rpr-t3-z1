package ba.unsa.etf.rpr.tutorijal03;
import java.util.HashMap;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik = new HashMap<String, TelefonskiBroj>();
    public void dodaj(String ime, TelefonskiBroj broj) {
        this.imenik.put(ime, broj);
    }
}
