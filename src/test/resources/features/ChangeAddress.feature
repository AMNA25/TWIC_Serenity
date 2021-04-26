Feature: Change Address

    @currentTest
    Scenario Outline: User changes the Address
        Given User is on the profile page
        When User changes the address
            | addressLine1   | addressLine2   | zipCode   | city   |
            | <addressLine1> | <addressLine2> | <zipCode> | <city> |
        Then The first address line should be equal to <addressLine1>
        And The second address line should be equal to <addressLine2>
        And The zipcode field should be equal to <zipCode>
        And The city field should be equal to <city>
        Examples:
            | addressLine1 | addressLine2 | zipCode | city |
            | emumba       | I/10-3       | 46000   | ISL  |