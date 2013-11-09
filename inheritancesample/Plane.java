package inheritancesample;

public class Plane extends Vehicle implements IPlane
{
    public Plane()
    {
        super(true);
    }
    
    public void fly(String destination)
    {
        System.out.print("Flying");
        super.displaceTo(destination);
    }
}