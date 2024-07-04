package jour08.job04;

public class Client extends Personne {
    private double chiffreAffaire;

    public Client(int indentite, String nomSocial, String adresse, double chiffreAffaire){
        super(indentite, nomSocial, adresse);
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    protected int getIdentite() {
        return super.getIdentite();
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    protected void affiche() {
        super.affiche();
        System.out.println("Chiffre d'Affaire : " + chiffreAffaire);
    }
}
