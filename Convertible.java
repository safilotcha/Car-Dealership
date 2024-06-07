public class Convertible extends Vehicle implements Driveable, Stoppable {
    boolean isHardTop;
    boolean canLowerTopWhileDriving;

    //extending vehicle
    public Convertible(String make, String model, int year, String color, int numberOfSeats, FuelType fuelType,
            boolean isHardTop, boolean canLowerTopWhileDriving) {
        super(make, model, year, color, numberOfSeats, fuelType);
        this.isHardTop = isHardTop;
        this.canLowerTopWhileDriving = canLowerTopWhileDriving;
    }

    @Override//implementing from interface
    public void drive(){
        System.out.println("your convertible is driving");
    }

    @Override
    public void checkFuelLevel(){
        System.out.println("checking the fuel level of your convertible");
    }

    @Override
    public void stop(){
        System.out.println("your convertible is stopping");
    }

    @Override
    public void checkBrakingDistance(){
        System.out.println("checking the braking distance of your convertible");
    }
    

}
