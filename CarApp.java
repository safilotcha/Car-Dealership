import java.util.ArrayList;

public class CarApp {
public static void main(String[] args) {
    Truck ram= new Truck("Ram", "1500 Big Horn", 2024, "grey", 6, FuelType.DIESEL, 500, 900);
    Convertible chevy= new Convertible("Chevy", "Corvette", 2020, "white", 2, FuelType.GASOLINE, true, true);

    //calling all of the methods from truck and convertible
    ram.drive();
    ram.checkBrakingDistance();
    ram.checkFuelLevel();
    ram.stop();

    System.out.println();
    
    chevy.drive();
    chevy.stop();
    chevy.checkFuelLevel();
    chevy.checkBrakingDistance();

    ArrayList<Vehicle> cars= new ArrayList<>();//arraylist accepts the superclass or truck and chevy
    cars.add(ram);
    cars.add(chevy);
}
}
