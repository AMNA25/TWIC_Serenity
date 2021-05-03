Feature: Change password in profile
  @changePassword
  Scenario Outline: User should be able to change password

    Given User logins with <email> and <password>
    And User is on profile page
    When User enters <old>, <new> and <confirm> password

    Then password should be changed
    Examples:
      | email | password | old | new | confirm |
      |amna.bibi@emumba.com| foobar123456 | foobar123456 |   foobar123456 |   foobar123456 |