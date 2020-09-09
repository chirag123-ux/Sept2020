@register @1
Feature: User able to register successfully.


  Scenario: User should be able to register successfully.


    Given click on register button.

    And  verify user is on registration page.

    When user enter all registration details.

    Then user able to see the message. Your registration completed