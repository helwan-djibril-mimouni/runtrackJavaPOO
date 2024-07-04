package jour08.job04;

public class Article {
    private String reference;
    private String designation;
    private int prixUnitaire;
    private int quantiteStock;

    public Article(String reference, String designation, int prixUnitaire, int quantiteStock) {
        this.reference = reference;
        this.designation = designation;
        this.prixUnitaire = prixUnitaire;
        this.quantiteStock = quantiteStock;
    }

    public Article(Article a){
        this.reference = a.reference;
        this.designation = a.designation;
        this.prixUnitaire = a.prixUnitaire;
        this.quantiteStock = a.quantiteStock;
    }

    public String getReference() {
        return reference;
    }

    public String getDesignation() {
        return designation;
    }

    public int getPrixUnitaire() {
        return prixUnitaire;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrixUnitaire(int prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public void affiche(){
        System.out.println("Référence : " + reference);
        System.out.println("Désignation : " + designation);
        System.out.println("Prix Unitaire : " + prixUnitaire);
        System.out.println("Quantité de Stock : " + quantiteStock);
    }
}
