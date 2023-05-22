public abstract class Vehicle {
    protected int maxSpeed;
    protected String type;
    
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    
    public abstract double calculateAllowedSpeed();
    
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    public String getType() {
        return type;
    }
}