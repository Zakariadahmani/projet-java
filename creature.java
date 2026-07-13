public abstract class Creature {

    protected String nom;
    protected int vie;
    protected int niveau;

    public Creature(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
        this.vie = niveau;
    }

    public void afficher() {
        System.out.println(nom + " possède " + vie + " PV.");
    }   

    public abstract void attaquer();
}

