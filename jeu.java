public class jeu {
    public static void main(String[] args) {

        Hero hero = new Hero("Zakdz59", 100, 45);
        dragon dragon = new dragon("Dragon", 200, 250);
        Squelette squelette = new Squelette("Squelette", 50, 10);
        loup loup = new loup("loup", 70, 30);
        troll troll = new troll("troll", 20, 5);
        vampire vampire = new vampire("vampire", 130, 60);

        System.out.println(" HEROS ");
        hero.afficher();
        hero.attaquer();
        hero.soigner(20);


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

        System.out.println(" TROLL ");
        troll.afficher();
        troll.attaquer();
        troll.piller();

        System.out.println();

        System.out.println(" VAMPIRE ");
        vampire.afficher();
        vampire.attaquer();
        vampire.piller ();

        System.out.println();
        System.out.println("BESTIAIRE ");
        creature[] bestiaire = new creature[6];
        bestiaire[0] = hero;
        bestiaire[1] = dragon;
        bestiaire[2] = squelette;
        bestiaire[3] = loup;
        bestiaire[4] = troll;
        bestiaire[5] = vampire;

        System.out.println();
        System.out.println("TOUT LE MONDE ATTAQUE :");
        for (creature c : bestiaire) {
            c.attaquer();
        }
    }
}