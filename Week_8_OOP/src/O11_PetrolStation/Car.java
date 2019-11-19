package O11_PetrolStation;

public class Car {

//    Car
//         - gasAmount
//         - capacity
//         - create constructor for Car where:
//            * initialize gasAmount -> 0
//            * initialize capacity -> 100*/

    int gasAmount;
    int capacity;

    public Car (){
        this.gasAmount = 0;
        this.capacity = 100;
    }

    public Car (int gasAmount , int capacity){
        this.gasAmount = gasAmount;
        this.capacity = capacity;

    }
}
