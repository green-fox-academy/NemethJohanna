package I03_AircraftCarrier;

public class Aircraft {

    private int actualAmmo;    // aktualis löszer
    private int maxAmmo;        // max löszer
    private int damage;         //
    private int baseDamage;
    private boolean isPriority;
    private String type;

    public Aircraft() {
        this.actualAmmo = 0;
        this.maxAmmo = maxAmmo;
        this.damage = damage;
        this.baseDamage = baseDamage;
    }

    public int fight(){
         /*It should use all the ammo (set it to 0) and it should return the damage it deals
        The damage dealt is calculated by multiplying the base damage by the ammunition*/
        int damageDealt = baseDamage * actualAmmo;
        actualAmmo = 0;
        return damageDealt;
    }

    public int refill(int ammoToFill){
         /*It should take a number as parameter and subtract as much ammo as possible
        It can't have more ammo than the number or the max ammo (can't get more ammo than what's coming from the parameter
        or the max ammo of the aircraft)
        It should return the remaining ammo
        Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288*/
        int remainingAmmo = 0;
        actualAmmo += (ammoToFill - maxAmmo);
        if (ammoToFill >= maxAmmo){
            actualAmmo += getMaxAmmo();
            remainingAmmo = ammoToFill - getMaxAmmo();
        } else {
            actualAmmo += ammoToFill;
        }
        return remainingAmmo;
    }

    //It should return the type of the aircraft as a string
    public String getType (){
        return type;
    }

    public String setType(String type){
        return this.type = type;
    }

    // It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
    public void getStatus(){
        System.out.printf("Type %s, Ammo: %d, Base Damage: %d, All Damage: %d\n", type, actualAmmo, baseDamage, damage);
    }

    //It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16
    public boolean getIsPriority(){
        return isPriority;
    }

    public int getActualAmmo() {
        return actualAmmo;
    }

    public int getDamage() {
        return damage;
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
