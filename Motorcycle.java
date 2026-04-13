public class Motorcycle extends Vehicle{

    public Motorcycle(String ownerName, String model) {
        super();
        this.ownerName = ownerName;
        this.model = model;
        this.speed = 0;
        this.fuelLevel = 0;
    }

    @Override
    public void accelerate() {
        this.speed = 100;
        System.out.println("Motorcycle is accelerating to " + this.speed + " km/h.");
    }
    @Override
    public void stop() {
        this.speed = 0;
        System.out.println("Motorcycle has stopped.");
    }   
    @Override
    public void gas() {
        System.out.println("Checking motorcycle gas level...");
    }


    
}