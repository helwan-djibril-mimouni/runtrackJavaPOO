package jour07.job04.point2;

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

    @Override
    public void calculePrix(int anneeActuelle) {
        int loss = anneeActuelle - aquisitionYear;
        currentPrice = aquisitionPrice - (aquisitionPrice * (2*loss/100));
        int loss2 = 0;
        int k = kilometers;
        while (k>0){
            k -= 10000;
            if (k > -5000){
                loss2++;
            }
        }
        currentPrice -= 5*loss2;
        if (brand == "Renault" || brand == "Fiat"){
            currentPrice -= currentPrice*0.1;
        }
        if (brand == "Ferrari" || brand == "Porsche"){
            currentPrice += currentPrice*0.2;
        }
        if (currentPrice < 0){
            currentPrice = 0;
        }
    }
}
