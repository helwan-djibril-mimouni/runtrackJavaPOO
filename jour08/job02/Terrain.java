package jour08.job02;

public class Terrain extends Card {
    private String color;

    public Terrain(String color, int cost) {
        super(cost);
        this.color = color;
    }

    @Override
    public void affiche() {
        System.out.println("Terrain :\n");
        System.out.println("Color : " + color);
        super.affiche();
    }
}
