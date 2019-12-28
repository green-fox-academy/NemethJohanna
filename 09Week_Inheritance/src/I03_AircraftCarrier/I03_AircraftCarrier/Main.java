package I03_AircraftCarrier;

public class Main {
    public static void main(String[] args) {
        Carrier carrier1 = new Carrier("carrier1");
        Carrier carrier2 = new Carrier("carrier2");

        F16 sas = new F16();
        F35 tiger = new F35();
        F16 thunder = new F16();
        F35 starFighter = new F35();

       carrier1.add(sas);
       carrier1.add(tiger);
       carrier2.add(thunder);
       carrier2.add(starFighter);


    }
}
