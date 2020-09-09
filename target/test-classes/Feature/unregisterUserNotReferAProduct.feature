@register @test3

  Feature: Unregister user should not able to refer a product to friend.

    Scenario: unregister user should not able to refer a product to a friend.

      Given click on appleMacBook.
      
      When click on email a friend button.
      And enter friend email and message with user email.

      Then user able to see the error message.

