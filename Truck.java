public class Truck extends Vehicle implements Driveable, Stoppable {
int towingCapacity;
int truckBedLength;

public Truck(String make, String model, int year, String color, int numberOfSeats, FuelType fuelType,
        int towingCapacity, int truckBedLength) {
    super(make, model, year, color, numberOfSeats, fuelType);
    this.towingCapacity = towingCapacity;
    this.truckBedLength = truckBedLength;
}

    @Override
    public void drive(){
        System.out.println("your truck is driving");
    }

    @Override
    public void checkFuelLevel(){
        System.out.println("checking your truck's fuel level");
    }

    @Override
    public void stop(){
        System.out.println("your truck is stopping");
    }

    @Override
    public void checkBrakingDistance(){
        System.out.println("checking your truck's braking distance");
    }

}
