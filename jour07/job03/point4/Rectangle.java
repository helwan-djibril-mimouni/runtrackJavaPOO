package jour07.job03.point4;

public class Rectangle extends Figure{
    protected double largeur;
    protected double longueur;

    public Rectangle(double x, double y, double largeur, double longueur){
        super(x, y);
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

    @Override
    public void affiche() {
        System.out.println("x : " + x + ", y : " + y + ", largeur : " + largeur + ", longueur : " + longueur);
    }
}