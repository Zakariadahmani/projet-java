public class troll extends creature implements lootable {

    public troll(String nom, int vie, int niveau) {
        super(nom, vie, niveau);
    }

    @Override
    public String piller() {
        return "Vous récupérez du sang de troll";
    }

    @Override
    public void attaquer() {
        System.out.println("Attaque coup de griffe !");
    }
}