Feature: Free Crm Login Feature

  Application Behavior and its functionality, We could capture all the User acceptance test cases here.
	
  @tag1 
  Scenario: Free Crm Login Test Scenario
    Given user is already on login page 
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
