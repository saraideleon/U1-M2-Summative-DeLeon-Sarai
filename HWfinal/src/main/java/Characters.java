import java.util.Scanner;

public class Characters {
    protected String name;
    protected int strength;
    protected int health;
    protected int stamina;
    protected int speed;
    protected int attackPower;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void set_values(String a, int b, int c, int d, int e, int f) {
        name = a;
        strength = b;
        health = c;
        stamina = d;
        speed = e;
        attackPower = f;
    }
    public void run() {
        System.out.println("You are running!");
    }

    public void attack () {
        System.out.println("You are attacking!");
    }

    public void heal () {
        System.out.println("You are healing!");
    }

    public void decreasingHealth () {
        System.out.println("Your health is decreasing!");
    }

    public void increaseStamina () {
        System.out.println("Your stamina is increasing!");
    }

    public void decreaseStamina () {
        System.out.println("Your stamina is decreasing!");
    }
}

