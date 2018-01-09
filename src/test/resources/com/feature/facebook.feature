@tag
Feature: Title of your feature

  @tag2
  Scenario Outline: whether verify facebook page
    Given I am on facebook pages
    When I enter "<Username>" and "<password>"
    Then I verify the <status> in step

    Examples: 
      | username | password |
      | gopinath | nathgopi |
