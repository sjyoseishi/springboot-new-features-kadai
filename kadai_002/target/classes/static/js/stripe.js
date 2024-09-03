 const stripe = Stripe('pk_test_51Pit1BENcLso2JcKNuQkXcNc746ENY2kqDcMqK9wQxN0bDiDnWy6SA3ziScHkn0p58QZTtJOmI9XECqwRzRX4vd900fma6uxRM');
 const paymentButton = document.querySelector('#paymentButton');
 
 paymentButton.addEventListener('click', () => {
   stripe.redirectToCheckout({
     sessionId: sessionId
   })
 });