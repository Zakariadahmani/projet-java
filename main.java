public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("Zakdz59");
        dragon dragon = new dragon();
        Squelette squelette = new Squelette();

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
        }
    }
