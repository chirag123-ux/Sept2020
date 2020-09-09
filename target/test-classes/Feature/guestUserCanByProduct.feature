@register @test5

  Feature: Guest user can buy a product successfully.

    Scenario: Guest user can buy a product.

      Given User is on homepage and click the HtconeMeightAnroid.

      When click on add to cart.
      And click on shppingcart button.
      And click on terms and service.
      And click on checkout button.
      And click on guest checkout button.
      And enter details of  guest email,country,city ,add, postal code and phone.
      And click on countinue buttonone.
      And click on credit card buttton.

      And click on credit card dropdown.
      And enter cardholdername,card number,expiremonth,expireyear,cvvnumber and click on confirm button.
      Then user should be on confirm page.
