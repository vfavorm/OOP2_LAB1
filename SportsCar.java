public class SportsCar extends Vehicle implements Automobile{

    public SportsCar(String ownerName, String model) {
        this.ownerName = ownerName;
        this.model = model;
        this.speed = 0;
        this.fuelLevel = 0;
    }

    @Override
    public void accelerate() {
        this.speed = 200;
        System.out.println("SportsCar is accelerating to " + this.speed + " km/h.");
    }

    @Override
    public void stop() {
        this.speed = 0;
        System.out.println("SportsCar has stopped.");
    }

    @Override
    public void gas() {
        System.out.println("Checking SportsCar gas level...");
    }

    @Override
    public void accelerate(int speed) {
        this.speed = speed;
        System.out.println("SportsCar is accelerating to " + this.speed + " km/h.");
    }

    @Override
    public void checkTires() {
        System.out.println("SportsCar tire pressure is optimal.");
    }

    @Override
    public void checkFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
        System.out.println("SportsCar fuel level: " + this.fuelLevel + "/" + fuelCapacity + "L");
    }

    @Override
    public void checkEngine() {
        System.out.println("SportsCar engine is running.");
    }
    
}
