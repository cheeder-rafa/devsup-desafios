package me.cheederrafa.aula;

import me.cheederrafa.aula.entities.Order;
import me.cheederrafa.aula.services.OrderService;
import me.cheederrafa.aula.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		ShippingService shippingService = new ShippingService();
		OrderService orderService = new OrderService(shippingService);

		//Exemplo 1
		Order order1 = new Order(1034, 150.00, 20.0);
		double orderTotal1 = orderService.total(order1);
		System.out.println("Pedido código " + order1.code());
		System.out.println("Valor total: R$ " + orderTotal1);

		//Exemplo 2
		Order order2 = new Order(2282, 800.00, 10.0);
		double orderTotal2 = orderService.total(order2);
		System.out.println("Pedido código " + order2.code());
		System.out.println("Valor total: R$ " + orderTotal2);

		//Exemplo 3
		Order order3 = new Order(1309, 95.9, 0.0);
		double orderTotal3 = orderService.total(order3);
		System.out.println("Pedido código " + order3.code());
		System.out.println("Valor total: R$ " + orderTotal3);
	}
}
