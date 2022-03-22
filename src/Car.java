public class Car extends Vehicle
{
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric)
    {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public boolean dropOffPassengers(int numOut)
    {
        if (numOut < getPassengers())
        {
            setPassengers(getPassengers() - numOut);
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public double calculateTollPrice()
    {
        if (getPassengers() > 4)
        {
            return getTollFee() * 4;
        }
        return super.calculateTollPrice();
    }

    public void applyDiscount()
    {
        if (isElectric() && !discountApplied)
        {
            discountApplied = true;
            setTollFee(getTollFee() * .5);
        }
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Electric Car?: " + electric);
        System.out.println("Discount applied?: " + discountApplied);
    }

    public boolean isElectric()
    {
        return electric;
    }

    public boolean isDiscountApplied()
    {
        return discountApplied;
    }
}