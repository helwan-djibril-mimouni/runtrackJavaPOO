package jour08.job04;

public class Personne {
    protected int identite;
    protected String nomSocial;
    protected String adresse;

    protected Personne(int identite, String nomSocial, String adresse){
        this.identite = identite;
        this.nomSocial = nomSocial;
        this.adresse = adresse;
    }

    protected int getIdentite() {
        return identite;
    }

    protected String getNomSocial() {
        return nomSocial;
    }

    protected String getAdresse() {
        return adresse;
    }

    protected void setIdentite(int identite) {
        this.identite = identite;
    }

    protected void setNomSocial(String nomSocial) {
        this.nomSocial = nomSocial;
    }

    protected void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    protected void affiche(){
        System.out.println("Identité : " + identite);
        System.out.println("Nom Social : " + nomSocial);
        System.out.println("Adresse : " + adresse);
    }
}
