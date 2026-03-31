package ParcelDeliveryRegistrationSystem.domain.service;

import ParcelDeliveryRegistrationSystem.domain.enums.DeliveryType;

public class PriceCalculator {

    public static double calculate(double weight, double volume, DeliveryType type) {

        double base = weight * 5;

        if (type == DeliveryType.EXPRESS) {
            base *= 1.5;
        }

        return base + volume * 2;
    }
}