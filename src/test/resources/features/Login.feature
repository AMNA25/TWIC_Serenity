Feature: Positive Login
  @Login
  Scenario Outline: Login with valid credentials
    Given User is on Login page

    When User enters valid <email> and <password>
    Then User should be able to see <email> in settings page

    Examples:
      | email | password |
      | amna.bibi@emumba.com | foobar123456 |