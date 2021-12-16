package com.company;

public class Main {

    public static void main(String[] args) {
        Boss b1 = new Boss();
        b1.setHealth(20);
        b1.setDamage(50);
        b1.setTypeOfProtect("Normal");
        System.out.println(b1.getDamage() + " " + b1.getHealth() + " " + b1.getTypeOfProtect());


    Hero[] heroes = createHeroes();
        for(Hero practice:heroes){
        System.out.println(practice.getDamage());
        System.out.println(practice.getHealth());
        System.out.println(practice.getSuperpower());
    }

}
    public static Hero[] createHeroes(){
        Hero hero = new Hero(50,30,"Jeleznyi");
        Hero hero1 = new Hero(60,57);
        Hero hero2 = new Hero(15,45,"Cat");

        Hero[] so = {hero,hero1,hero2};
        return so;
    }
}
