package jour07.job03.point4;

public class Figure {
    protected double x;
    protected double y;

    public Figure(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void affiche(){
        System.out.println("x : " + x + ", y : " + y);
    }

    public void setCentre(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
