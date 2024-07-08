package jour08.job04;

import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class Commerciale {
    private Vector<Article> articles = new Vector<>();
    private Vector<Client> clients = new Vector<>();
    private Vector<Commande> commandes = new Vector<>();
    private Vector<Ligne> lignes = new Vector<>();

    public void passerCommande(Commande c){
        commandes.add(c);
    }

    public void annulerCommande(Commande c){
        commandes.remove(c);
    }

    public void ajouterArticle(Article a){
        articles.add(a);
    }

    public void supprimerArticle(Article a){
        articles.remove(a);
    }

    public void ajouterClient(Client c){
        clients.add(c);
    }

    public void supprimerClient(Client c){
        clients.remove(c);
    }

    public static void main(String[] args) {
        Commerciale commerciale = new Commerciale();
        boolean running = true;
        int option = -1;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        while (running) {
            System.out.println("Gestion commerciale\n");
            System.out.println("1: Ajouter article");
            System.out.println("2: Supprimer article");
            System.out.println("3: Ajouter client");
            System.out.println("4: Supprimer client");
            System.out.println("5: Passer commande");
            System.out.println("6: Annuler commande");
            System.out.println("7: Quitter");

            while (option < 1 || option > 7){
                System.out.println("Option :");
                option = scanner.nextInt();
                scanner.nextLine();
            }

            switch (option) {
                case 1:
                    System.out.println("Référence (string) :");
                    String ref = scanner.nextLine();
                    System.out.println("Désignation (string) :");
                    String des = scanner.nextLine();
                    System.out.println("Prix Unitaire (int) :");
                    int prix = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Quantité de Stock (int) :");
                    int quan = scanner.nextInt();
                    scanner.nextLine();
                    Article article = new Article(ref, des, prix, quan);
                    commerciale.ajouterArticle(article);
                    System.out.println("Article ajouté");
                    break;
                
                case 2:
                    System.out.print("Référence de l'article à supprimer: ");
                    String reference = scanner.nextLine();
                    article = commerciale.articles.stream()
                        .filter(a -> a.getReference().equals(reference))
                        .findFirst()
                        .orElse(null);
                    if (article != null) {
                        commerciale.supprimerArticle(article);
                        System.out.println("Article supprimé");
                    } else {
                        System.out.println("Article non trouvé");
                    }
                    break;
                
                case 3:
                    System.out.print("Identité (int) : ");
                    int identite = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nom Social (string) : ");
                    String nomSocial = scanner.nextLine();
                    System.out.print("Adresse (string) : ");
                    String adresse = scanner.nextLine();
                    System.out.print("Chiffre d'Affaire (double) : ");
                    double chiffreAffaire = scanner.nextDouble();
                    scanner.nextLine();
                    Client client = new Client(identite, nomSocial, adresse, chiffreAffaire);
                    commerciale.ajouterClient(client);
                    System.out.println("Client ajouté");
                    break;
                
                case 4:
                    System.out.print("Identité du client à supprimer: ");
                    identite = scanner.nextInt();
                    scanner.nextLine();
                    client = commerciale.clients.stream()
                        .filter(c -> c.getIdentite() == identite)
                        .findFirst()
                        .orElse(null);
                    if (client != null) {
                        commerciale.supprimerClient(client);
                        System.out.println("Client supprimé");
                    } else {
                        System.out.println("Client non trouvé");
                    }
                    break;

                case 5:
                    System.out.print("Numéro de Commande (int) : ");
                    int numeroCommande = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Date de Commande (string) : ");
                    String dateCommande = scanner.nextLine();
                    System.out.print("Identité du Client (int) : ");
                    int id = scanner.nextInt();
                    client = commerciale.clients.stream()
                        .filter(c -> c.getIdentite() == id)
                        .findFirst()
                        .orElse(null);
                    if (client != null) {
                        Commande commande = new Commande(numeroCommande, dateCommande, client);
                        commerciale.passerCommande(commande);
                        System.out.println("Commande passée");
                    } else {
                        System.out.println("Client non trouvé");
                    }
                    break;

                case 6:
                    System.out.print("Numéro de la commande à annuler: ");
                    numeroCommande = scanner.nextInt();
                    scanner.nextLine();
                    Commande commande = commerciale.commandes.stream()
                        .filter(c -> c.getNumeroCommande() == numeroCommande)
                        .findFirst()
                        .orElse(null);
                    if (commande != null) {
                        commerciale.annulerCommande(commande);
                        System.out.println("Commande annulée");
                    } else {
                        System.out.println("Commande non trouvée");
                    }
                    break;

                case 7:
                    running = false;
                    break;

                default:
                    break;
            }

            System.out.println();
            System.out.println("Liste des articles:");
            for (Article a : commerciale.articles) {
                a.affiche();
                System.out.println();
            }

            System.out.println();
            System.out.println("Liste des clients:");
            for (Client c : commerciale.clients) {
                c.affiche();
                System.out.println();
            }

            System.out.println();
            System.out.println("Liste des commandes:");
            for (Commande c : commerciale.commandes) {
                System.out.println("Numéro de Commande: " + c.getNumeroCommande());
                System.out.println("Date de Commande: " + c.getDateCommande());
                System.out.println("Client :");
                c.getClient().affiche();
                System.out.println();
            }

            option = -1;
        }
        
        scanner.close();
    }
}
