package ParcelDeliveryRegistrationSystem.port;

import ParcelDeliveryRegistrationSystem.domain.model.Shipment;

public interface ShipmentRepository {
    void save(Shipment shipment);
}