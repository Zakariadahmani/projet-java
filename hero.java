public class Hero extends creature implements soignable {

    private String arme;

    public Hero(String nom, int vie, int niveau) {
        super(nom, vie, niveau);
        arme = "lancepierre";
    }

    @Override
    public void soigner(int points) {
        vie += points;
        System.out.println(nom + " se soigne (+" + points + " PV).");
    }

    @Override
    public void attaquer() {
        System.out.println(nom + " attaque avec son " + arme + ".");
    }
}