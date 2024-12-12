@Tree
Feature: Tree functionality

  Background: The user logged in to dsAlgo Portal and should be in Tree Page
  Given The user logged in to dsAlgo Portal and should be in Tree Page
  @treeintro
  Scenario: Verify that user is able to navigate to OVERVIEW OF TRESS page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks OVERVIEW OF TRESS tab
    Then The user should be navigated to Overview of Trees Page which has TRY HERE button

  @tryhere
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor in it
    Given The user is on the OVERVIEW OF TRESS page
    When The user clicks TRY HERE button in the Overview of Trees Page
    Then The user should be navigated to try Editor page with a RUN button to test

  @txteditorfn
 Scenario Outline: : Verify TextEditor Functionality with different Input
  Given The user is on the Try Editor page of Overview of Trees page
  When The user enters the <code> in Text Editor and clicks RUN button
  Then The <alert> should be displayed
   Examples: 
       Examples: 
      | code        | alert | 
      | Empty       | Error message in alert window| 
      |valid code   | displayed in the console | 
      |Invalid code1| nameerror pop up alert message  |
      |Invalid code2| syntaxerror pop up alert message |               
      