public class jeu {
    public static void Main(String[] args) {
        creature[] bestiaire = new creature[3];
        bestiaire[0] = new Squelette("Squelette", 50, 10);
        bestiaire[1] = new dragon("Dragon", 200, 250);
        bestiaire[2] = new Hero("Hero", 100, 45);
        bestiaire[3] = new loup("loup", 70, 30);

        for (creature c : bestiaire) {
            c.attaquer();   // POLYMORPHISME : chacun réagit à sa façon
        }
    }
}