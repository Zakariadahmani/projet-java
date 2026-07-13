public class Hero extends creature {

    private String arme;

    public Hero(String nom) {
    super(nom, 100, 45);
    arme = "lancepierre";
    }
    
    public void soigner() {
        vie += 20;
        System.out.println(nom + " se soigne (+20 PV).");
    }

    @Override
    public void attaquer() {
        System.out.println(nom + " attaque avec son " + arme + ".");
    }
}