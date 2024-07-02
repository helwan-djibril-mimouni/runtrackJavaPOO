package jour07.job04.point1;

public class Voiture extends Vehicule{
    protected double cylinderCapacity;
    protected int numberOfDoors;
    protected int horsepower;
    protected int kilometers;

    public Voiture(String brand, int aquisitionYear, double aquisitionPrice, double cylinderCapacity, int numberOfDoors, int horsepower, int kilometers) {
        super(brand, aquisitionYear, aquisitionPrice);
        
        this.cylinderCapacity = cylinderCapacity;
        this.numberOfDoors = numberOfDoors;
        this.horsepower = horsepower;
        this.kilometers = kilometers;
    }

    @Override
    public void affiche() {
        super.affiche();

        System.out.println("Capacity of the Cylinder : " + cylinderCapacity);
        System.out.println("Number of Doors : " + numberOfDoors);
        System.out.println("Horsepower : " + horsepower);
        System.out.println("Kilometers driven : " + kilometers);
    }
}
