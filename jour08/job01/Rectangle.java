package jour08.job01;

public class Rectangle {
    private double largeur;
    private double longueur;

    public Rectangle(double largeur, double longueur){
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public String toString() {
        String s = "Rectangle :\n largeur : " + largeur + "\n longueur : " + longueur + "\n";
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        boolean b = false;
        if (obj != null){
            if (obj.getClass() == this.getClass()){
                Rectangle r = (Rectangle)obj;
                b = r.largeur == this.largeur && r.longueur == this.longueur;
            }
        }
        return b;
    }
}
