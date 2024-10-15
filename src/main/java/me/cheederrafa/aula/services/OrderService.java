package me.cheederrafa.aula.services;

import me.cheederrafa.aula.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {

        double basicValue = order.basic();
        double discountPercentage = order.discount() / 100;
        double discountValue = basicValue * discountPercentage;
        double shippingValue = shippingService.shipment(order);

        return basicValue - discountValue + shippingValue;
    }
}
