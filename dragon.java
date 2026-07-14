public class dragon extends creature implements lootable {

   public dragon(String nom, int vie, int niveau) {
        super("Dragon", 200, 250);
    }

    public void voler() {
        System.out.println("Le dragon s'envole dans le ciel.");
    }

    @Override
    public void attaquer() {
        System.out.println(nom + " crache du feu !");
    }

    @Override
    public String loot() {
        return "Vous récupérez une écaille de dragon.";
        }
}