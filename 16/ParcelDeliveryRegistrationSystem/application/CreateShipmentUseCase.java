package ParcelDeliveryRegistrationSystem.application;

import ParcelDeliveryRegistrationSystem.domain.enums.DeliveryType;
import ParcelDeliveryRegistrationSystem.domain.model.Shipment;
import ParcelDeliveryRegistrationSystem.port.ShipmentRepository;

public class CreateShipmentUseCase {

    private final ShipmentRepository repository;

    public CreateShipmentUseCase(ShipmentRepository repository) {
        this.repository = repository;
    }

    public Shipment execute(double weight, double volume, String typeInput) {

        DeliveryType type = DeliveryType.valueOf(typeInput.toUpperCase());

        Shipment shipment = new Shipment(weight, volume, type);

        shipment.calculatePrice();

        repository.save(shipment);

        return shipment;
    }
}