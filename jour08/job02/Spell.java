package jour08.job02;

public class Spell extends Card {
    private String name;
    private String explanation;

    public Spell(String name, String explanation, int cost) {
        super(cost);
        this.name = name;
        this.explanation = explanation;
    }

    @Override
    public void affiche() {
        System.out.println("Spell :\n");
        System.out.println("Name : " + name);
        System.out.println("Explanation : " + explanation);
        super.affiche();
    }
}
