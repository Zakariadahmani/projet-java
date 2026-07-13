public class Squelette extends Creature {

    public Squelette() {
        super("Squelette", 50, 10);
    }

    public void loot() {
        System.out.println("Loot : Un os.");
    }

    @Override
    public void attaquer() {
        System.out.println("Le squelette donne un coup d'épée rouillée.");
    }
}