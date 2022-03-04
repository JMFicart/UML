package be.technifutur.distributeur;

import java.util.Map;

public class Distributeur {
    private Map<String, Carte> mapCarte;
    private Carte carteActive;

    public Distributeur(Map<String, Carte> mapCarte) {
        this.mapCarte = mapCarte;
    }

}
