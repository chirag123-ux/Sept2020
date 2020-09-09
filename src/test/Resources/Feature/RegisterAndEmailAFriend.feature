@register @test2
  Feature: registerUserReferAProductAndEmailAFriend

    Scenario:

       Given click on register button.

        And verify user is on registration page.

        And user enter all registration details.

        And user able to see the message. Your registration completed

        And click on homepage.
        And click on appleMacBook.

        And click on email a friend button.
        Then enter friend email and message.

