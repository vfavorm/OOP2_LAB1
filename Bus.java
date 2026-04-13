public class Bus extends Vehicle{

    public Bus(String ownerName, String model) {
        this.ownerName = ownerName;
        this.model = model;
        this.speed = 0;
        this.fuelLevel = 0;
    }

    @Override
    public void accelerate() {
        this.speed = 100;
        System.out.println("Bus is accelerating to " + this.speed + " km/h.");
    }
    @Override
    public void stop() {
        this.speed = 0;
        System.out.println("Bus has stopped.");
    }   
    @Override
    public void gas() {
        System.out.println("Checking Bus gas level...");
    }


    
}