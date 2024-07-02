package jour07.job03.point2;

public class RectangleColore extends Rectangle{
    protected int couleur;

    public RectangleColore(double largeur, double longueur, int couleur){
        super(largeur, longueur);
        this.couleur = couleur;
    }

    public int getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }
}