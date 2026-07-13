public abstract class creature {

    protected String nom;
    protected int vie;
    protected int niveau;

    public creature (String nom, int vie, int niveau) {
        this.nom = nom;
        this.vie = vie;
        this.niveau = niveau;
    }

    public void afficher() {
        System.out.println(nom + " possède " + vie + " PV.");
    }   

    public abstract void attaquer();
}

