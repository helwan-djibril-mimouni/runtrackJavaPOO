package jour07.job03.point1;

public class Circle {
    protected double x;
    protected double y;
    protected double rayon;
    
    public Circle(double x, double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }
    
    public void affiche(){
        System.out.println("x : " + x + ", y : " + y + ", rayon : " + rayon);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setCentre(double x, double y) {
        this.x = x;
        this.y = y;
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
