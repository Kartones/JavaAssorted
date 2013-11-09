package inheritancesample;

public class BigHideout
{
    public void hideVehicle(IBoat boat)
    {
        System.out.println("Boat hidden");
    }
    
    public void hideVehicle(ICar car)
    {
        System.out.println("Car hidden");
    }
    
    // Could have been IVehicle, but this is a better example
}