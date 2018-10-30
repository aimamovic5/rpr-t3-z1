package ba.unsa.etf.rpr.tutorijal03;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;


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
    public String naSlovo(char s) {
        String rezultat = new String();
        int i = 1;
        for (String str : imenik.keySet()) {
            if(str.charAt(0) == s) {
                rezultat.concat(Integer.toString(i) + ". " + str + " - " + imenik.get(str));
                rezultat.concat(System.lineSeparator());
                i++;
            }
        }
        return rezultat;
    }
    public Set<String> izGrada(FiksniBroj.Grad g) {
        Set<String> set = new TreeSet();
        for (String str : imenik.keySet()) {
            if (imenik.get(str) instanceof FiksniBroj)
                if (((FiksniBroj) imenik.get(str)).getGrad() == g)
                    set.add(str);
        }
        return set;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        Set<TelefonskiBroj> set = new TreeSet();
        for (String str : imenik.keySet()) {
            if (imenik.get(str) instanceof FiksniBroj)
                if (((FiksniBroj) imenik.get(str)).getGrad() == g)
                    set.add(imenik.get(str));
        }
        return set;
    }
}
