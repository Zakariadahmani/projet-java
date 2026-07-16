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

    public Boolean Vivant() {
    return vie > 0;
        }

    public void subirDegats(int degats) {
    vie = vie - degats;   // void : modifie l'objet, ne renvoie rien
} 

    public abstract void attaquer();


    protected Faction faction;

public creature(String nom, int pv, int niveau, Faction faction) {
    this.nom = nom;
    this.vie = pv;
    this.niveau = niveau;
    this.faction = faction;
    }
}

