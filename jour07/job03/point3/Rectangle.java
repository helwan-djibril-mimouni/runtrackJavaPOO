package jour07.job03.point3;

public class Rectangle {
    protected double largeur;
    protected double longueur;

    public Rectangle(double largeur, double longueur){
        this.largeur = largeur;
        this.longueur = longueur;
    }
    
    public double surface(){
        return largeur*longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
}