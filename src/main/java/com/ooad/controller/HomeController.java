
package com.ooad.controller;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.Charge;

@Controller
public class HomeController {

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public ModelAndView test(HttpServletResponse response, HttpServletRequest request)
			throws IOException, AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
		// Set your secret key: remember to change this to your live secret key
		// in production
		// See your keys here: https://dashboard.stripe.com/account/apikeys
		Stripe.apiKey = "sk_test_p6CPS6oL1GTFMODwOMN0T19E";

		System.out.println("POST");

		// Get the credit card details submitted by the form
		String token = request.getParameter("stripeToken");

		// Create a charge: this will charge the user's card
		try {
			Map<String, Object> chargeParams = new HashMap<String, Object>();
			chargeParams.put("amount", 2000); // Amount in cents
			chargeParams.put("currency", "usd");
			chargeParams.put("source", token);
			chargeParams.put("description", "Example charge");

			Charge charge = Charge.create(chargeParams);
			System.out.println(charge.getPaid());
		} catch (CardException e) {
			// The card has been declined

			System.out.println("here");
		}
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView testGet(HttpServletResponse response, HttpServletRequest request)
			throws IOException, AuthenticationException, InvalidRequestException, APIConnectionException, APIException {

		return new ModelAndView("home");
	}


}
