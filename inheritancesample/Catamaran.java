package inheritancesample;

public class Catamaran extends Vehicle implements IBoat
{
    public Catamaran()
    {
        super(false);
    }
    
    public void sail(String destination)
    {
        System.out.print("Sailing");
        super.displaceTo(destination);
    }
}