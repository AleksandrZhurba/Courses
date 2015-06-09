package lesson_8;

import java.util.HashMap;

public class Premii {

    private HashMap<Emploer, Integer> premii = new HashMap<Emploer, Integer>();

    public void givePrem (Emploer emploer, int count) {
        if (premii.containsKey(emploer)){
            int premia = premii.get(emploer);
            premii.put(emploer, premia + count);
        } else {
            premii.put(emploer, count);
        }
    }

    public void removePrem (Emploer emploer, int count) {
        if (premii.containsKey(emploer)) {
            premii.remove(emploer, count);
        }
    }
    public boolean isEmplWithPrem (Emploer emploer) {
        return premii.containsKey(emploer);
    }

    public int getPrem (Emploer emploer) {
        return premii.get(emploer);
    }
}
