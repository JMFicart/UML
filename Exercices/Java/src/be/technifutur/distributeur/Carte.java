package be.technifutur.distributeur;

public class Carte {
    private int montant;
    private int nbEssais;
    private String code;

    public Carte(int montant, String code) {
        this.montant = montant;
        this.code = code;
        this.nbEssais = 0;
    }

    public boolean isCodeValide(String code) {
        boolean valid = this.code.equals(code);
        if(valid){
            nbEssais = 0;
        } else {
            nbEssais++;
        }
        return valid;
    }

    public int getNbEssais() {
        return nbEssais;
    }

    public boolean autorisation(int montant){
        boolean aut = this.montant >= montant;
        if (aut){
            this.montant -= montant;
        }
        return aut;
    }
}
