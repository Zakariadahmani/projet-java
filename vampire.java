public class vampire extends creature implements lootable {

    public vampire(String nom, int vie, int niveau) {
        super(nom, vie, niveau);
    }

    @Override
    public void attaquer() {
        System.out.println(nom + " te mord le coup!");
    }

    @Override
    public String piller() {
        return "Vous récupérez du sang de vampire !";
    }
}