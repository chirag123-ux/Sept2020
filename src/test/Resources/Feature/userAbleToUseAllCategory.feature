Feature: User able to use all category.

  Given User is on home page

  @category
  Scenario Outline: User can navigate to correct category page.

    When user clicks on "<category>" link from top menu
    Then user should navigate to "<related_category_page>" successfully

    Examples:

    |  category       |   related_category_page                         |
    |  Computers      |    https://demo.nopcommerce.com/computers       |
    |  Electronics    |     https://demo.nopcommerce.com/electronics    |


