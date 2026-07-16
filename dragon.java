public class dragon extends creature implements lootable, volant {
    private element souffle;

    public dragon(String nom, int vie, int niveau) {
        super(nom, vie, niveau);
        this.souffle = element.FEU;
    }

    @Override
    public void voler() {
        System.out.println("Le dragon s'envole dans le ciel.");
    }

    @Override
    public void attaquer() {
        System.out.println(nom + " crache du feu du type " + souffle + " !");
    }

    @Override
    public String piller() {
        return "Vous récupérez une écaille de dragon.";
    }
}