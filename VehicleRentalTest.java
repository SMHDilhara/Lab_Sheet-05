
package Lab05;

public class VehicleRentalTest {
    public static void main(String[] args) {
    
        Vehicle vehicle1 = new Car("C-123", "Toyota", 5, 5000.0);
        Vehicle vehicle2 = new Bike("B-456", "Yamaha", 10, 200.0);

        System.out.println("--- Car Details ---");
        vehicle1.displayVehicleInfo();
        System.out.println("Total Cost: " + vehicle1.calculateRentalCost());

        System.out.println("\n--- Bike Details ---");
        vehicle2.displayVehicleInfo();
        System.out.println("Total Cost: " + vehicle2.calculateRentalCost());

        
    }
}
