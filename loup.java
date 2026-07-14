public class loup extends creature {

    public loup(String nom, int vie ,int niveau) {
    super("loup",70, 30);
    }


    @Override
    public void attaquer() {
        System.out.println(nom + " mords ! ");
        }
}

