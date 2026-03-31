package ParcelDeliveryRegistrationSystem.main;

import ParcelDeliveryRegistrationSystem.adapter.InMemoryShipmentRepository;
import ParcelDeliveryRegistrationSystem.application.CreateShipmentUseCase;
import ParcelDeliveryRegistrationSystem.domain.model.Shipment;
import ParcelDeliveryRegistrationSystem.port.ShipmentRepository;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Volume: ");
        double volume = sc.nextDouble();

        System.out.print("Type (STANDARD/EXPRESS): ");
        String type = sc.next();

        ShipmentRepository repository = new InMemoryShipmentRepository();
        CreateShipmentUseCase useCase = new CreateShipmentUseCase(repository);

        try {
            Shipment shipment = useCase.execute(weight, volume, type);
            System.out.println("Price: " + shipment.getPrice());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}