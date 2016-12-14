<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<h1>Hello World!</h1>
	<p>This is the payment page!</p>
	
	<br>

	<form action="/ooadp/pay" method="POST">
		<script src="https://checkout.stripe.com/checkout.js"
			class="stripe-button" data-key="pk_test_5UtU8PRSvk44dV8GX0z6OwVL"
			data-amount="2000" data-name="Stripe.com"
			data-description="2 widgets"
			data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
			data-locale="auto" data-zip-code="true">
			
		</script>
	</form>
</body>
</html>