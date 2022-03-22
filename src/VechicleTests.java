public class VechicleTests
{
    public static void main(String[] args)
    {
        // -------------- LAB PART 1 -----------------
        // a. write code to create a Vehicle object with license "MC56WQ",
        //    toll fee of 10.75, and 5 passengers.
        //    Print out the calculated toll TollPrice.
        Vehicle myVehicle = new Vehicle("MC56WQ", 10.75, 5);
        System.out.println(myVehicle.calculateTollPrice());

        System.out.println("----------------------------");
        // b. write code to create an electric Car with license "KXN73F",
        //    toll fee of 8.50, and 2 passengers.
        //    Print out the calculated toll price
        Car myElectricCar = new Car("KXN73F", 8.50, 2, true);
        System.out.println(myElectricCar.calculateTollPrice());

        System.out.println("----------------------------");
        // c. add a printCar() void method to the Car class that prints the
        //    Car's license plate, toll fee, number of passengers, whether it is electric,
        //    and whether a discount has been applied.
        //    Add getter methods as necessary to the Vehicle superclass.
        //
        // d. call the method on the Car you made in b to test it.
        myElectricCar.printInfo();

        System.out.println("----------------------------");
        // e. write code to create a Truck with license "3K9JMX",
        //    a toll fee of 24.75, 4 passengers, 6 axles, with a trailer.
        //    Print out the calculated toll price
        Truck myTruck = new Truck("3K9JMX", 24.75, 4, 6, true);
        System.out.println(myTruck.calculateTollPrice());

        System.out.println("----------------------------");
        // f. add a printTruck() void method to the Truck class that prints the
        //    Truck's license plate, toll fee, number of passengers, number of axles,
        //    and whether it has a trailer.
        //    Add getter methods as necessary to the Vehicle superclass.
        //
        // g. call the method on the Truck you made in e to test it.
        myTruck.printInfo();

        System.out.println("----------------------------");
        // ------------ LAB PART 2 ---------------
        // ----- instructions in lab sheet -------

        Taxi myTaxi = new Taxi("8KM23Z", 9.25, 3, true, 5);
        myTaxi.printInfo();

        System.out.println(myTaxi.getLicensePlate());
        System.out.println(myTaxi.getTollFee());
        System.out.println(myTaxi.getPassengers());
        System.out.println(myTaxi.calculateTollPrice());

        System.out.println(myTaxi.isElectric());
        System.out.println(myTaxi.isDiscountApplied());

        System.out.println(myTaxi instanceof Taxi);
        System.out.println(myTaxi instanceof Car);
        System.out.println(myTaxi instanceof Vehicle);

        System.out.println("----------------------------");
        // ------------ LAB PART 3 ---------------
        // ----- instructions in lab sheet -------

        System.out.println("--- Testing method on a Car object ---");
        Car testCar1 = new Car("KXN73F", 8.50, 5, true);
        System.out.println(testCar1.getPassengers());
        System.out.println("-----------");
        boolean success = testCar1.dropOffPassengers(3);
        System.out.println(success);
        System.out.println(testCar1.getPassengers());
        System.out.println("-----------");
        success = testCar1.dropOffPassengers(3);
        System.out.println(success);
        System.out.println(testCar1.getPassengers());
        System.out.println("--- Testing method on a Taxi object ---");
        Taxi testTaxi1 = new Taxi("JMD645", 10.35, 3, false, 5.0);
        System.out.println(testTaxi1.getPassengers());
        System.out.println("-----------");
        success = testTaxi1.dropOffPassengers(3);
        System.out.println(success);
        System.out.println(testTaxi1.getPassengers());
        System.out.println("-----------");
        success = testTaxi1.dropOffPassengers(2);
        System.out.println(success);
        System.out.println(testTaxi1.getPassengers());
        System.out.println("-----------");

        System.out.println("----------------------------");

        System.out.println("--- Testing method on a Car object ---");
        Car testCar2 = new Car("KXN73F", 8.50, 5, true);
        testCar2.applyDiscount();
        System.out.println(testCar2.isDiscountApplied());
        System.out.println(testCar2.getTollFee());
        System.out.println("-----------");
        testCar2.applyDiscount(); // try applying again
        System.out.println(testCar2.isDiscountApplied());
        System.out.println(testCar2.getTollFee());
        System.out.println("--- Testing method on Taxi objects ---");
        Taxi testTaxi2 = new Taxi("JMD645", 10.0, 3, false, 5.0); // not electric
        testTaxi2.applyDiscount();
        System.out.println(testTaxi2.isDiscountApplied());
        System.out.println(testTaxi2.getTollFee());
        System.out.println("-----------");
        Taxi testTaxi3 = new Taxi("ABC645", 12.0, 3, true, 5.0);
        testTaxi3.applyDiscount();
        System.out.println(testTaxi3.isDiscountApplied());
        System.out.println(testTaxi3.getTollFee());
        System.out.println("-----------");

        System.out.println("----------------------------");

        System.out.println("--- Testing method on Truck objects ---");
        Truck testTruck1 = new Truck("7645MX", 10.50, 3, 7, true);
        boolean validLicensePlate = testTruck1.validateLicensePlate();
        System.out.println(validLicensePlate);
        System.out.println("-----------");
        Truck testTruck2 = new Truck("7645PX", 10.50, 3, 7, true);
        validLicensePlate = testTruck2.validateLicensePlate();
        System.out.println(validLicensePlate);
        System.out.println("-----------");
        Truck testTruck3 = new Truck("7645LX", 10.50, 3, 4, true);
        validLicensePlate = testTruck3.validateLicensePlate();
        System.out.println(validLicensePlate);
        System.out.println("-----------");
        Truck testTruck4 = new Truck("7645L9", 10.50, 3, 4, true);
        validLicensePlate = testTruck4.validateLicensePlate();
        System.out.println(validLicensePlate);
        System.out.println("-----------");
        Truck testTruck5 = new Truck("7645L9", 10.50, 3, 4, false);
        validLicensePlate = testTruck5.validateLicensePlate();
        System.out.println(validLicensePlate);
        System.out.println("-----------");
        Truck testTruck6 = new Truck("7645PX", 10.50, 3, 7, false);
        validLicensePlate = testTruck6.validateLicensePlate();
        System.out.println(validLicensePlate);

    }
}