package inheritancesample;

public class Car extends Vehicle implements ICar
{
    public Car()
    {
        super(true);
    }

    public void drive(String destination)
    {
        System.out.print("Driving");
        super.displaceTo(destination);
    }
}