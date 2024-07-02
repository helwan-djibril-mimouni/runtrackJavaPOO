package jour07.job04.point1;

public class Avion extends Vehicule {
    protected String motorType;
    protected int flyingHours;

    public Avion(String brand, int aquisitionYear, double aquisitionPrice, String motorType, int flyingHours) {
        super(brand, aquisitionYear, aquisitionPrice);
        
        this.motorType = motorType;
        this.flyingHours = flyingHours;
    }

    @Override
    public void affiche() {
        super.affiche();

        System.out.println("Type of Motor : " + motorType);
        System.out.println("Flying Hours : " + flyingHours);
    }

    
}
