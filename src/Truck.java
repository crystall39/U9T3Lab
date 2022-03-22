public class Truck extends Vehicle
{
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
    {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public boolean validateLicensePlate()
    {
        if (hasTrailer)
        {
            if (axles > 4)
            {
                return getLicensePlate().indexOf("MX") == getLicensePlate().length() - 2;
            }
            else
            {
                return getLicensePlate().indexOf("LX") == getLicensePlate().length() - 2;
            }
        }
        return true;
    }

    @Override
    public double calculateTollPrice()
    {
        double returnVal = getTollFee() * axles;
        if (hasTrailer)
        {
            returnVal *= 2;
        }
        return returnVal;
    }
    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Axles " + axles);
        System.out.println("Has Trailer?: " + hasTrailer);
    }
}