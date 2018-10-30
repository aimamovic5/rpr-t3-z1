package ba.unsa.etf.rpr.tutorijal03;
import java.util.HashMap;
import java.util.Set;


public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik = new HashMap<String, TelefonskiBroj>();
    public void dodaj(String ime, TelefonskiBroj broj) {
        this.imenik.put(ime, broj);
    }
    public String dajBroj(String ime) {
        var rezultat = (imenik.get(ime)).ispisi();
        return rezultat;
    }
    public String dajIme(TelefonskiBroj broj) {
        for (String s : imenik.keySet()) {
            if (imenik.get(s).equals(broj)) {
                return s;
            }
        }
    return null;
    }
}
