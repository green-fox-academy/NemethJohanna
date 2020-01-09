package P11_PetrolStation;

public class Station {

    int gasAmount;

    public Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void reFill (Car car){
        this.gasAmount--;
        car.gasAmount++;
    }
}
