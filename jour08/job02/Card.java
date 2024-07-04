package jour08.job02;

public class Card {
    private int cost;

    public Card(int cost){
        this.cost = cost;
    }

    public void affiche(){
        System.out.println("Cost : " + cost);
    }
}
