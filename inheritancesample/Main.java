package inheritancesample;

public class Main 
{
    public static void main(String[] args) 
    {
        Car audi = new Car();
        Plane jet = new Plane();
        Catamaran smallCatamaran = new Catamaran();
        FlyingCar jamesBondCar = new FlyingCar(new Car(), new Plane());
        BigHideout hideout = new BigHideout();
        
        audi.drive("Madrid");
        jet.fly("Barcelona");
        smallCatamaran.sail("Canary Islands");
        
        jamesBondCar.drive("London");
        jamesBondCar.fly("China");
        
        hideout.hideVehicle(smallCatamaran);
        hideout.hideVehicle(audi);
        hideout.hideVehicle(jamesBondCar);
        
    }
}
