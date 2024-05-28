package _E_Sportiv_Problema010_Flyweight;

import java.util.HashMap;
import java.util.Map;

class PersoanaFactory {
    static final Map<String, Persoana> persoaneMap = new HashMap<>();

    public static Persoana getPersoana(String inaltime, String latime, String culoareTricou) {
        String key = inaltime + latime + culoareTricou;
        Persoana persoana = persoaneMap.get(key);

        if (persoana == null) {
            persoana = new Persoana(inaltime, latime, culoareTricou);
            persoaneMap.put(key, persoana);
        }

        return persoana;
    }
}
