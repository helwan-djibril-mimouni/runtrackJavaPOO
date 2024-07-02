package jour07.job04.point1;

public class Vehicule {
    protected String brand;
    protected int aquisitionYear;
    protected double aquisitionPrice;
    protected double currentPrice;
    
    public Vehicule(String brand, int aquisitionYear, double aquisitionPrice) {
        this.brand = brand;
        this.aquisitionYear = aquisitionYear;
        this.aquisitionPrice = aquisitionPrice;
    }

    public void affiche(){
        System.out.println("Brand : " + brand);
        System.out.println("Year of Aquisition : " + aquisitionYear);
        System.out.println("Price at Aquisition : " + aquisitionPrice);
        System.out.println("Current Price : " + currentPrice);
    }
}
