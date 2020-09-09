@register @test4

  Feature: User able to buy a product successfully.

    Scenario: User should be able to buy a product successfully.

      Given click on register button.

      And verify user is on registration page.

      And user enter all registration details.

      And user able to see the message. Your registration completed

      And click on homepage.

      And click on HTCONEM8Anroid.
      And click on add to cart.
      And click on shppingcart button.
      And click on terms and service.
      And click on checkout button.
      And enter details of country,city ,add, postal code and phone.
      And click on countinue buttonone.
      And click on credit card buttton.

      And click on credit card dropdown.
      And enter cardholdername,card number,expiremonth,expireyear,cvvnumber and click on confirm button.
      Then user should be on confirm page.
