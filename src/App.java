public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Toyota", "Camry", 14, 32);
        Car car2 = new Car("Ford", "F-150", 26, 20);

        car1.drive(200);
        car1.refuel(5);
        car1.printGallonsLeft(); //does all getters

        car2.drive(150);
        car2.refuel(100);
        car2.printGallonsLeft();
    }
}
