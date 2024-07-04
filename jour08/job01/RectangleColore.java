package jour08.job01;

public class RectangleColore extends Rectangle {
    private double largeur;
    private double longueur;
    private String couleur;

    public RectangleColore(double largeur, double longueur, String couleur){
        super(largeur, longueur);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += " couleur : " + couleur + "\n";
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        boolean b = super.equals(obj);
        if (b == true){
            RectangleColore r = (RectangleColore)obj;
            return r.couleur.equals(this.couleur);
        }
        return false;
    }
}
