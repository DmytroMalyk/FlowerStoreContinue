package ua.edu.ucu.apps.demo.flowerStore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.demo.Order;
import ua.edu.ucu.apps.demo.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.demo.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.demo.flower.Flower;
import ua.edu.ucu.apps.demo.flower.FlowerColor;
import ua.edu.ucu.apps.demo.flower.FlowerType;
import ua.edu.ucu.apps.demo.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.demo.payment.PayPalPaymentStrategy;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {

	@GetMapping
	public static List<Order> getOrders() {
		return List.of(
			new Order(List.of(
			new Flower(5, FlowerColor.RED, 120, FlowerType.ROSE),
			new Flower(3, FlowerColor.BLUE, 80, FlowerType.ROSE),
			new Flower(8, FlowerColor.BLUE, 120, FlowerType.TULIP)
			), new DHLDeliveryStrategy(), new CreditCardPaymentStrategy()),

			new Order(List.of(
			new Flower(5, FlowerColor.RED, 120, FlowerType.ROSE),
			new Flower(3, FlowerColor.BLUE, 80, FlowerType.ROSE),
			new Flower(8, FlowerColor.BLUE, 120, FlowerType.TULIP)
			), new PostDeliveryStrategy(), new PayPalPaymentStrategy())
		);
	}
}
