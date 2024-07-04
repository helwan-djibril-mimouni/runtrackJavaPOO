package jour08.job02;

public class Creature extends Card {
    private String name;
    private int damagePoints;
    private int healthPoints;

    public Creature(String name, int damagePoints, int healthPoints, int cost){
        super(cost);
        this.name = name;
        this.damagePoints = damagePoints;
        this.healthPoints = healthPoints;
    }

    @Override
    public void affiche() {
        System.out.println("Creature :\n");
        System.out.println("Name : " + name);
        System.out.println("Damage : " + damagePoints);
        System.out.println("Health : " + healthPoints);
        super.affiche();
    }    
}
