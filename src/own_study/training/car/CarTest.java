package own_study.training.car;


class CarTest {


    public static void main(String[] args) {
        Car testCar = new Car ();
        testCar.make = "Ford";
        testCar.color = "Red";
        testCar.year = 1965;

        String testCarMake = testCar.make;
        String testCarColor = testCar.color;
        int testCarYear = testCar.year;

        System.out.println ("This car make is " + testCarMake);
        System.out.println ("This car color is " + testCarColor);
        System.out.println ("This car was made in year " + testCarYear);
    }
}
