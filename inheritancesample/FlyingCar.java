package inheritancesample;

public class FlyingCar extends Vehicle implements ICar, IPlane
{
    private ICar car;
    private IPlane plane;
    
    public FlyingCar(ICar car, IPlane plane)
    {
        super(true);
        this.car = car;
        this.plane = plane;
    }
    
    @Override
    public void drive(String destination)
    {
        car.drive(destination);
    }
    
    @Override
    public void fly(String destination)
    {
        plane.fly(destination);
    }
}