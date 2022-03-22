public class SecondVehicleTests
{
    public static void main(String[] args)
    {
        // ------------------------------------------------
        //                   Test Code 1
        // ------------------------------------------------
        Car myCar = new Car("MK4567", 10.0, 3, true);
        System.out.println(myCar.calculateTollPrice());

        Car myCar2 = new Car("FJ8731", 10.0, 6, true);
        System.out.println(myCar2.calculateTollPrice());

        // the way toll price is calculated for a Vehicle
        // shouldn't have changed
        Vehicle myVehicle = new Vehicle("KX1543", 10.0, 6);
        System.out.println(myVehicle.calculateTollPrice());

        System.out.println("----------------------------");

        // ------------------------------------------------
        //                  Test Code 2
        // ------------------------------------------------
        Truck myTruck = new Truck("TY45LX", 20.0, 3, 5, true);
        System.out.println(myTruck.calculateTollPrice());

        Truck myTruck2 = new Truck("LM90LX", 20.0, 3, 5, false);
        System.out.println(myTruck2.calculateTollPrice());

        // the way toll price is calculated for a Vehicle
        // shouldn't have changed
        Vehicle myVehicle2 = new Vehicle("TR987", 10.0, 6);
        System.out.println(myVehicle2.calculateTollPrice());

        System.out.println("----------------------------");

        // ------------------------------------------------
        //                  Test Code 3
        // ------------------------------------------------
        Taxi myTaxi3 = new Taxi("TX1234", 10.0, 6, true, 0.0);
        System.out.println(myTaxi3.getPassengers()); // should be 6, including driver

        // now let's drop off the 5 riders, charging 3.50 per rider
        boolean success = myTaxi3.chargeAndDropOffRiders(3.50);
        System.out.println(success); // should be true
        System.out.println(myTaxi3.getPassengers()); // should now be 1
        System.out.println(myTaxi3.getFareCollected()); // should be 17.50

        System.out.println("----------------------------");

        // ------------------------------------------------
        //                  Test Code 4
        // ------------------------------------------------
        Vehicle myVehicle3 = new Vehicle("BB8123", 7.0, 3);
        myVehicle3.printInfo();

        System.out.println("----------------------------");

        // ------------------------------------------------
        //                  Test Code 5
        // ------------------------------------------------
        Car myCar3 = new Car("MK4567", 6.75, 4, true);
        myCar3.printInfo();

        System.out.println("----------------------------");

        // ------------------------------------------------
        //                  Test Code 6
        // ------------------------------------------------
        Truck myTruck3 = new Truck("TB12MX", 15.50, 2, 4, true);
        myTruck3.printInfo();

        System.out.println("----------------------------");

        // ------------------------------------------------
        //                  Test Code 6
        // ------------------------------------------------
        Taxi myTaxi4 = new Taxi("TX1412", 13.75, 4, true, 2.0);
        myTaxi4.printInfo();
    }
}
