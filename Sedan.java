public class Sedan extends Vehicle implements Automobile {

    public Sedan(String ownerName, String model) {
        this.ownerName = ownerName;
        this.model = model;
        this.speed = 0;
        this.fuelLevel = 0;
    }

    @Override
    public void accelerate() {
        this.speed = 60;
        System.out.println("Sedan is accelerating to " + this.speed + " km/h.");
    }


    @Override
    public void stop() {
        this.speed = 0;
        System.out.println("Sedan has stopped.");
    }

    @Override
    public void gas() {
        System.out.println("Checking Sedan gas level...");
    }


    @Override
    public void accelerate(int speed) {
        this.speed = speed;
        System.out.println("Sedan is accelerating to " + this.speed + " km/h.");
    }


    @Override
    public void checkTires() {
        System.out.println("Sedan tire pressure is optimal.");
    }

    @Override
    public void checkFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
        System.out.println("Sedan fuel level: " + this.fuelLevel + "/" + fuelCapacity + "L");
    }

    @Override
    public void checkEngine() {
        System.out.println("Sedan engine is running.");
    }
    
}
