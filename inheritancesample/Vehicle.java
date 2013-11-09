package inheritancesample;

public abstract class Vehicle implements IVehicle
{
    protected boolean hasEngine;
    
    public Vehicle(boolean hasEngine)
    {
        this.hasEngine = hasEngine;
    }
    
    public void startEngine()
    {
        if (hasEngine)
        {
            System.out.println("Engine started");
        }
    }
    
    public void stopEngine()
    {
        if (hasEngine)
        {
            System.out.println("Engine stopped");
        }
    }
    
    public void displaceTo(String destination)
    {
        System.out.println(" to " + destination);
    }
    
}