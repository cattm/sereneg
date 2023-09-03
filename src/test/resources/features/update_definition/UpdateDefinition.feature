Feature: Update a Definition
  In order to keep everything up to date
  As an English student
  I want to EDIT word definitions


  Scenario: Looking up the definition of 'apple'
    Given the user is on the Wikionary home page
    When the user looks up the definition of the word 'apple'
    Then they should be able to edit the definition to be 'something different'
