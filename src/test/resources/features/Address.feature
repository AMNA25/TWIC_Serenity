Feature: Change Address from User Profile

  @Address
  Scenario Outline: User should be able to change the address
    Given User is on profile page

    When User fills address form with <line1>, <line2>, <city>, <zipcode> and <state>

    Then address should get updated
    Examples:
      | line1 | line2 | city | zipcode | state |
      | line1 | line2 | "San Francisco "  | 90201 | California |