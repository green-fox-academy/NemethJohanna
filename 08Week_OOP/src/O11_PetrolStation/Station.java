package O11_PetrolStation;

public class Station {

//    Station
//        - gasAmount
//        - refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount

    int gasAmount;

    public Station(){
        this.gasAmount = 1000;
    }

    public void reFill (Car car) {
        this.gasAmount -= car.capacity;
        car.gasAmount = car.capacity;
    }

}
