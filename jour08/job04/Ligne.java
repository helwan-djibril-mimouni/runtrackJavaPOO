package jour08.job04;

public class Ligne {
    private Commande commande;
    private Article article;
    private int quantiteCommande;
    
    public Ligne(Commande commande, Article article, int quantiteCommande) {
        this.commande = commande;
        this.article = article;
        this.quantiteCommande = quantiteCommande;
    }
    
    public Commande getCommande() {
        return commande;
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantiteCommande() {
        return quantiteCommande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public void setQuantiteCommande(int quantiteCommande) {
        this.quantiteCommande = quantiteCommande;
    }
}
