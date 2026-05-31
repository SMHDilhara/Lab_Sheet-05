
package Lab05;
public class DeliveryChargeTest {
    public static void main(String[] args) {
        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        System.out.println("Base Charge: " + calculator.calculateCharge(1000.0));
        System.out.println("With Distance (5km): " + calculator.calculateCharge(1000.0, 5.0));
        System.out.println("With Distance (5km) & Weight (2kg): " + calculator.calculateCharge(1000.0, 5.0, 2.0));
        System.out.println("Express Delivery: " + calculator.calculateCharge(1000.0, true));

    }
}
