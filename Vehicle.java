public class Vehicle {
String make;
String model;
int year;
String color;
int numberOfSeats;
FuelType fuelType;

public Vehicle(String make, String model, int year, String color, int numberOfSeats, FuelType fuelType) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
    this.numberOfSeats = numberOfSeats;
    this.fuelType = fuelType;
}

public String getMake() {
    return make;
}

public void setMake(String make) {
    this.make = make;
}

public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

public int getYear() {
    return year;
}

public void setYear(int year) {
    this.year = year;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

public int getNumberOfSeats() {
    return numberOfSeats;
}

public void setNumberOfSeats(int numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
}

public FuelType getFuelType() {
    return fuelType;
}

public void setFuelType(FuelType fuelType) {
    this.fuelType = fuelType;
}


@Override//for the print out
public String toString() {
    return  this.year + " "+ this.make + " " + this.model + " " + this.color +" " +this.numberOfSeats;// format
}
  


}
