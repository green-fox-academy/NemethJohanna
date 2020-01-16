public class Aircraft {

    private int maxAmmo;
    private int baseDamage;
    private int ammoStorage;
    private String type;
    private int damage;
    private boolean isPriority;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setPriority(boolean priority) {
        isPriority = priority;
    }

    public int fight() {
        /*It should use all the ammo (set it to 0) and it should return the damage it deals
        The damage dealt is calculated by multiplying the base damage by the ammunition*/
        this.setAmmoStorage(0);
        this.damage = this.baseDamage * this.ammoStorage;
        return damage;
    }

    public int refill(int ammoToFill) {
        /*It should take a number as parameter and subtract as much ammo as possible
        It can't have more ammo than the number or the max ammo (can't get more ammo than what's coming from the parameter or the max ammo of the aircraft)
        It should return the remaining ammo
        Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288*/
        int remainingAmmo = 0;
        if (ammoToFill + this.ammoStorage < this.maxAmmo) {
            this.ammoStorage += ammoToFill;
            remainingAmmo += 0;
        } else {
            this.ammoStorage += this.maxAmmo - this.ammoStorage;
            remainingAmmo += ammoToFill - (this.maxAmmo - this.ammoStorage);
        }
        return remainingAmmo;

    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return "Type " + this.type + ", Ammo: " + this.ammoStorage + ", Base Damage: " + this.baseDamage + ", All Damage: " + this.damage;
    }

    public boolean isPriority() {
        return isPriority;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getAmmoStorage() {
        return ammoStorage;
    }

    public void setAmmoStorage(int ammoStorage) {
        this.ammoStorage = ammoStorage;
    }
}
