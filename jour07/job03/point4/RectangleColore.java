package jour07.job03.point4;

public class RectangleColore extends Rectangle{
    protected int couleur;

    public RectangleColore(double x, double y, double largeur, double longueur, int couleur){
        super(x, y, largeur, longueur);
        this.couleur = couleur;
    }

    public int getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }
}