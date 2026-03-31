package ParcelDeliveryRegistrationSystem.adapter;

import ParcelDeliveryRegistrationSystem.domain.model.Shipment;
import ParcelDeliveryRegistrationSystem.port.ShipmentRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryShipmentRepository implements ShipmentRepository {

    private final List<Shipment> storage = new ArrayList<>();

    @Override
    public void save(Shipment shipment) {
        storage.add(shipment);
    }
}