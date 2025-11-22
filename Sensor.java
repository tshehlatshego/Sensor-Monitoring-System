public abstract class Sensor 
{
    protected String id;
    protected String location;
    protected double batteryLevel;
    protected boolean status;
    
    public Sensor(String id, String location, double batteryLevel, boolean status) 
    {
        this.id = id;
        this.location = location;
        this.batteryLevel = batteryLevel;
        this.status = status;   
    }
    
    public abstract void activate();
    public abstract void deactivate();
    public abstract double boostBattery();
    public abstract String makeReport();
    
}