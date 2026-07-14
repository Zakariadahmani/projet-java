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
        dragon.loot();


        System.out.println();

        System.out.println("SQUELETTE ");
        squelette.afficher();
        squelette.attaquer();
        squelette.loot();

        System.out.println();
        
        System.out.println("LOUP ");
        loup.afficher();
        loup.attaquer(); 
        }
    }
