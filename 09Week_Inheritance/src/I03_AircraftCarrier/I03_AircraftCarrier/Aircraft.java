package I03_AircraftCarrier;

public class Aircraft {
    private int actualAmmo;     // aktualis löszer
    private int maxAmmo;        // max löszer
    private int damage;
    private int baseDamage;
    private boolean isPriority;

    public Aircraft() {
        this.actualAmmo = 0;
        this.maxAmmo = maxAmmo;
        this.damage = damage;
        this.baseDamage = baseDamage;
    }

    public int fight(){
        actualAmmo -= actualAmmo;
        /*It should use all the ammo (set it to 0) and it should return the damage it deals
        The damage dealt is calculated by multiplying the base damage by the ammunition*/
        return baseDamage *= actualAmmo;
    }

    public void refill(int number){
        int fill = 0;

        /*It should take a number as parameter and subtract as much ammo as possible
        It can't have more ammo than the number or the max ammo (can't get more ammo than what's coming from the parameter
        or the max ammo of the aircraft)
        It should return the remaining ammo
        Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288*/
        setActualAmmo(number - getMaxAmmo());

    }

    //It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
    public void getStatus(){
        System.out.println("Type " + getType() + ", Ammo: " + getActualAmmo() + ", Base Damage: " + getBaseDamage() + ", All Damage: " + getDamage());
    }

    //It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16
    public boolean isPriority(){
        return true;
    }

    public void getType (){
        this.getClass().getSimpleName();
    }

    public int getActualAmmo() {
        return actualAmmo;
    }

    public void setActualAmmo(int actualAmmo) {
        this.actualAmmo = actualAmmo;
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

    public void setPriority(boolean priority) {
        isPriority = priority;
    }
}
