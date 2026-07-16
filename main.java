public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("Zakdz59", 100, 45);
        dragon dragon = new dragon("Dragon", 200, 250);
        Squelette squelette = new Squelette("Squelette", 50, 10);
        loup loup = new loup("loup", 70, 30);

        System.out.println(" HEROS ");
        hero.afficher();
        hero.attaquer();
        hero.soigner();


        System.out.println();

        System.out.println(" DRAGON ");
        dragon.afficher();
        dragon.attaquer();
        dragon.voler();
        dragon.piller();


        System.out.println();

        System.out.println("SQUELETTE ");
        squelette.afficher();
        squelette.attaquer();
        squelette.piller();

        System.out.println();
        
        System.out.println("LOUP ");
        loup.afficher();
        loup.attaquer(); 
        loup.piller();

        System.out.println();
        System.out.println("BESTIAIRE ");
        creature[] bestiaire = new creature[4];
        bestiaire[0] = hero;
        bestiaire[1] = dragon;
        bestiaire[2] = squelette;
        bestiaire[3] = loup;

        System.out.println();
        System.out.println("TOUT LE MONDE ATTAQUE :");
        for (creature c : bestiaire) {
            c.attaquer();
        }
    }
}