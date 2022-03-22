public class Taxi extends Car
{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected)
    {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public boolean chargeAndDropOffRiders(double farePerRider)
    {
        fareCollected += (getPassengers() - 1) * farePerRider;
        return dropOffPassengers(getPassengers() - 1);
    }

    public double getFareCollected()
    {
        return fareCollected;
    }

    public void printInfo()
    {
        super.printInfo();
        System.out.println("Fare Collected: " + fareCollected);
    }
}
