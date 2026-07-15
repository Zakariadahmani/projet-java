public class dragon extends creature implements lootable, volant {
    private element souffle;

   public dragon(String nom, int vie, int niveau) {
        super("Dragon", 200, 250);
        this.souffle = element.FEU;
    }

    public void voler() {
        System.out.println("Le dragon s'envole dans le ciel.");
    }

    @Override
    public void attaquer() {
        System.out.println(nom + " crache du feu du type" + souffle + " !");
    }

    @Override
    public String loot() {
        return "Vous récupérez une écaille de dragon.";
        }
}