public class Squelette extends creature {

    public Squelette(String nom, int vie, int niveau) {
        super("Squelette", 50, 10);
    }

    public void piller() {
        System.out.println("Loot : Un os.");
    }

    @Override
    public void attaquer() {
        System.out.println("Le squelette donne un coup d'épée rouillée.");
    }
}