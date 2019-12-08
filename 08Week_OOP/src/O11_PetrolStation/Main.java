package O11_PetrolStation;

public class Main {
    public static void main(String[] args) {

/*      Station
        - gasAmount
        - refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
       Car
         - gasAmount
         - capacity
         - create constructor for Car where:
            * initialize gasAmount -> 0
            * initialize capacity -> 100*/

    Car Toyota = new Car();

    Station station = new Station();


    station.reFill(Toyota);

        System.out.println("The car's capacity is: " + Toyota.capacity);
        System.out.println("The station's gasamount is: " + station.gasAmount);

    }
}
