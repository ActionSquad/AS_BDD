@Tree
Feature: Tree functionality

  Background: The user logged in to dsAlgo Portal and should be in Tree Page
    Given The user logged in to dsAlgo Portal and should be in Tree Page

  @txteditorfnoverview
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor page of Overview of Trees page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | valid code    | displayed in the console         |
 