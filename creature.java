public abstract class Creature {

    protected String nom;
    protected int vie;

    public Creature(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
    }

    public void afficher() {
        System.out.println(nom + " possède " + vie + " PV.");
    }

   
}

