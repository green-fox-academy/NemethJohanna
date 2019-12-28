package I03_AircraftCarrier;

public class Aircraft {

    private int actualAmmo;
    private int maxAmmo;
    private int damage;
    private int baseDamage;
    private boolean isPriority;
    private String type;

    public Aircraft() {
        this.actualAmmo = 0;
    }

    public int fight() {
        int damageDealt = baseDamage * actualAmmo;
        actualAmmo = 0;
        return damageDealt;
    }

    public int refill(int ammoToFill) {
        int remainingAmmo = 0;
        if (ammoToFill >= maxAmmo) {
            actualAmmo += getMaxAmmo();
            remainingAmmo = ammoToFill - getMaxAmmo();
        } else {
            actualAmmo += ammoToFill;
        }
        return remainingAmmo;
    }

    public void getStatus() {
        System.out.printf("Type %s, Ammo: %d, Base Damage: %d, All Damage: %d\n", type, actualAmmo, baseDamage, damage);
    }

    public String setType(String type) {
        return this.type = type;
    }

    public int getActualAmmo() {
        return actualAmmo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public void setPriority(boolean priority) {
        isPriority = priority;
    }

    private int getMaxAmmo() {
        return maxAmmo;
    }

    public void setActualAmmo(int ammoStorage) {
        this.actualAmmo = ammoStorage;
    }

}
