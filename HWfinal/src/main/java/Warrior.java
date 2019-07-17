public class Warrior extends Characters {
    private int shieldStrength = 100;

    public Warrior() {
        setStrength(75);
        setStamina(100);
        setHealth(100);
        setSpeed(50);
        setAttackPower(10);
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    protected int decreaseShieldStrength() {
        return 1;
    }
}
