#Author: trainer@your.domain.com
@tag
Feature: Tours place selecting

@tag2
Scenario: viewing selected link
Given user on the PhpTravel tours page
When the user click the select link
Then the page for the selected link detials should be displayed
