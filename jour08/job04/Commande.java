package jour08.job04;

public class Commande {
    private int numeroCommande;
    private String dateCommande;
    private Client client;
    
    public Commande(int numeroCommande, String dateCommande, Client client) {
        this.numeroCommande = numeroCommande;
        this.dateCommande = dateCommande;
        this.client = client;
    }
    
    public int getNumeroCommande() {
        return numeroCommande;
    }

    public String getDateCommande() {
        return dateCommande;
    }

    public Client getClient() {
        return client;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
