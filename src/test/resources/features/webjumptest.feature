@register
Feature: WebJumpTest

  Background: 
    Given User access page

  @login-CT001 @smoke @regression
  Scenario: Fill out all the avaliables fields
    And user fill out the first name field "<firstName>"
    And user fill out the mid name field "<midName>"
    And user fill out the last name field "<lastName>"
    And user fill out the age field "<age>"
    And user fill out the email field "<email>"
    And user fill out the job field "<job>"
    And user fill out the gender field "<gender>"

    Examples: 
      | firstName | midName | lastName | age | email        | job          | gender |
      | Paulo     | Vitot   | Calil    |  18 | pv@email.com | unemployment | male   |