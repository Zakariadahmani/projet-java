public class loup extends creature implements lootable {

    public loup(String nom, int vie ,int niveau) {
    super("loup",70, 30);
    }


    @Override
    public void attaquer() {
        System.out.println(nom + " mords ! ");
        }

    @Override
    public String loot() { 
        return "Fourrure de loup (COMMUN)";
    }
}