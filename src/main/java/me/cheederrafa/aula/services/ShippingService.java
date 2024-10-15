package me.cheederrafa.aula.services;

import me.cheederrafa.aula.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {

        double basic = order.basic();
        double shippingCost = 0.0;

        if (basic < 100.0) {
            shippingCost = 20.0;
        }

        if (basic > 100.0 && basic < 200.0) {
            shippingCost = 12.0;
        }

        return shippingCost;
    }
}
