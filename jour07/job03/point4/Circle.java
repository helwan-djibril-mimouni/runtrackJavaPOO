package jour07.job03.point4;

public class Circle extends Figure{
    protected double rayon;
    
    public Circle(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }
    
    @Override
    public void affiche() {
        System.out.println("x : " + x + ", y : " + y + ", rayon : " + rayon);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double surface(){
        return Math.PI*rayon*rayon;
    }

    public boolean estInterieur(double x, double y){
        double b = (this.x - x);
        double c = (this.y - y);
        double a = Math.sqrt((b*b) + (c*c));
        return a <= rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}
