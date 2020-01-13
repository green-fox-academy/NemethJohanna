package HeroBattle;

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Batman", 50);
        Hero hero2 = new Hero("Superman", 40);

        System.out.println(hero1);
        System.out.println(hero2);
        hero1.punch(hero2);
        hero2.punch(hero1);

        System.out.println(hero1);
        System.out.println(hero2);

        hero1.punch(hero2);
        System.out.println(hero1);
        System.out.println(hero2);

    }

}
