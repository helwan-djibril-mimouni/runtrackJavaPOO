package jour07.job04.point2;

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

    @Override
    public void calculePrix(int anneeActuelle) {
        int time = 1000;
        if (motorType == "Hélices"){
            time = 100;
        }
        int loss = 0;
        int k = flyingHours;
        while (k>0){
            k -= time;
            if (k > -time/2){
                loss++;
            }
        }
        currentPrice -= 10*loss;
        if (currentPrice < 0){
            currentPrice = 0;
        }
    }
}
