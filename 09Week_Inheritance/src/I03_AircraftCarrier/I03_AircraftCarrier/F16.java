package I03_AircraftCarrier;

public class F16 extends Aircraft {

    public F16 (){
        super();
        this.setType("F16");
        this.setMaxAmmo(8);
        this.setBaseDamage(30);
        this.setPriority(false);
    }
}
