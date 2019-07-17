public class Constable extends Characters{
    private String jurisdiction;
    public Constable() {
        setStrength(60);
        setStamina(60);
        setHealth(100);
        setSpeed(20);
        setAttackPower(5);
    }
    public String getJurisdiction(){
        return jurisdiction;
    }
    public void setJurisdiction(String jurisdiction){
        this.jurisdiction = jurisdiction;
    }
    protected int arrest() {
        return 1;
    }
}