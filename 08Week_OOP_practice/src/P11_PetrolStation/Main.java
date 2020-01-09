package P11_PetrolStation;

public class Main {

    public static void main(String[] args) {
        Station station = new Station(20);
        Car car = new Car();

        station.reFill(car);

        System.out.println(car.gasAmount);
        System.out.println(station.gasAmount);
    }

}
