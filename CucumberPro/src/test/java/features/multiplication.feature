Feature: Login User

Background: browser lunching
Given given url is present
When running url in browser
Then url open successfully

@tag1
Scenario Outline: login page

Given user navigates to Login page
When I enter correct "<username>" and "<password>"
Then login should be successful

Examples: 
|username|password|
|Sri     |Sri123|