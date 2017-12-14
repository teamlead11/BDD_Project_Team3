Feature: Verify Booking Functionality of Flight Page 

Scenario Outline: To verify user can able to book a flight 
	Given I am on Fligh Details page 
	When I enter the Booking Page by pressing on Book as Guest Button 
	When I enter the <firstName> <lastName> <phone> <email> <nationality> <cardNumber> <cvvNumber> in the Booking Summary page 
	Then I verify Booking has been Confirmed 
	
	Examples: 
		|firstName|lastName	  |phone	|email			|nationality|cardNumber		 |cvvNumber|
		|Rajasekar|Arunachalam|123456	|raj@gmail.com	|indian		|5241524152415241|123	   |