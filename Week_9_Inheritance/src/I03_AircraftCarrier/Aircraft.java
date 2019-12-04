package I03_AircraftCarrier;

public class Aircraft {
    private int ammo = 0;       // aktualis löszer
    private int maxAmmo;        // max löszer
    private String type;        // ammunition = lőszer
    private int damage;
    private int baseDamage;


    public void fight(){
        /*It should use all the ammo (set it to 0) and it should return the damage it deals
        The damage dealt is calculated by multiplying the base damage by the ammunition*/

    }

    public void refill(int number){
        /*It should take a number as parameter and subtract as much ammo as possible
        It can't have more ammo than the number or the max ammo (can't get more ammo than what's coming from the parameter or the max ammo of the aircraft)
        It should return the remaining ammo
        Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288*/
        setAmmo();

    }

    //It should return the type of the aircraft as a string
    public String getType(){
        return type;
    }

    //It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
    public String getStatus(){
        return ;
    }

    //It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16
    public boolean isPriority(){
        return
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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
}
