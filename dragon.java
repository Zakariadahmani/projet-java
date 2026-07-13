public class dragon extends creature {

    public dragon() {
        super("Dragon", 200, 250);
    }

    public void voler() {
        System.out.println("Le dragon s'envole dans le ciel.");
    }

    public void loot() {
        System.out.println("Loot : Écaille de dragon.");
    }

    @Override
    public void attaquer() {
        System.out.println("Le dragon crache du feu !");
    }
}