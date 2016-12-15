
package com.ooad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ooad.dto.CreateOrderDto;
import com.ooad.entities.OrderEntity;
import com.ooad.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "/createOrder", method = RequestMethod.GET)
	public ModelAndView createOrder(@ModelAttribute("createOrderDto") CreateOrderDto createOrderDto) {
		// here should be dto to bo mapper
		OrderEntity order = (OrderEntity) createOrderDto;
		orderService.createOrder(order);

		// TODO catch exceptions, redirect
		return new ModelAndView("home");
	}
}
