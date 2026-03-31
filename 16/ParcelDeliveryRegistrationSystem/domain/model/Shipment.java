package ParcelDeliveryRegistrationSystem.domain.model;

import ParcelDeliveryRegistrationSystem.domain.enums.DeliveryType;
import ParcelDeliveryRegistrationSystem.domain.service.PriceCalculator;

public class Shipment {

    private final double weight;
    private final double volume;
    private final DeliveryType type;
    private double price;

    public Shipment(double weight, double volume, DeliveryType type) {
        if (weight <= 0 || weight > 50) {
            throw new IllegalArgumentException("Weight must be 0-50 kg");
        }
        if (volume <= 0 || volume > 100) {
            throw new IllegalArgumentException("Volume must be 0-100");
        }

        this.weight = weight;
        this.volume = volume;
        this.type = type;
    }

    public void calculatePrice() {
        this.price = PriceCalculator.calculate(weight, volume, type);
    }

    public double getPrice() {
        return price;
    }
}