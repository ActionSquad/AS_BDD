@Tree
Feature: Tree functionality

  Background: The user logged in to dsAlgo Portal and should be in Tree Page
    Given The user logged in to dsAlgo Portal and should be in Tree Page

  @treeintro @one
  Scenario: Verify that user is able to navigate to OVERVIEW OF TRESS page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks OVERVIEW OF TRESS tab
    Then The user should be navigated to Overview of Trees Page

  @tryhere
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor in it
    Given The user is on the OVERVIEW OF TRESS page
    When The user clicks TRY HERE button in the Overview of Trees Page
    Then The user should be navigated to try Editor page with a RUN button to test

  @txteditorfnoverview
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor page of Overview of Trees page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @backtooverview
  Scenario: Verify The user is able to navigate back to The OVERVIEW OF TREES page
    Given The user is in The TRY EDITOR page
    When The user clicks The left arrow in The browser
    Then The user should be navigated to Overview of Trees Page

  @Terminologies @two
  Scenario: Verify that user is able to navigate to TERMINOLOGIES page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks TERMINOLOGIES tab
    Then The user should be navigated to Terminologies page

  @tryhere
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor
    Given The user is in The TERMINOLOGIES  page
    When The user clicks TRY HERE button in The Terminologies page
    Then The user should be navigated to try Editor page with a RUN button to test

  @txteditforTerminologies
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor in Terminologies page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @backtoTerminologies
  Scenario: Verify The user is able to navigate back to The TERMINOLOGIES page
    Given The user is in The TRY EDITOR page
    When The user clicks The left arrow in The browser
    Then The user should be navigated to Terminologies page

  @typesoftrees @three
  Scenario: Verify that user is able to navigate to TYPES OF TREES page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks TYPES OF TREES tab
    Then The user should be navigated to Types of Trees page

  @tryheretypesoftrees
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor
    Given The user is in The TYPES OF TREES  page
    When The user clicks TRY HERE button in The Types of Trees page
    Then The user should be navigated to try Editor page with a RUN button to test

  @txteditorfntypesoftrees
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor in Types of Trees page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @backtotypesoftrees
  Scenario: Verify The user is able to navigate back to The TYPES OF TREES
    Given The user is in The TRY EDITOR page
    When The user clicks The left arrow in The browser
    Then The user should be navigated to Types of Trees page

  @treetraversals @four
  Scenario: Verify that user is able to navigate to TREE TRAVERSALS page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks TREE TRAVERSALS tab
    Then The user should be navigated to Trees Traversals page

  @treetraversalstrtryhere
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor in Tree Traversals
    Given The user is in The TYPES OF TREES  page
    When The user clicks TRY HERE button in The Tree Traversals page
    Then The user should be navigated to try Editor page with a RUN button to test

  @txteditorfntreetraversals
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor in TreeTraversals
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @backtotreetraversals
  Scenario: Verify The user navigates back to The TREE TRAVERSALS page
    Given The user is on the Try Editor
    When The user clicks The left arrow in The browser
    Then The user should be navigated to Trees Traversals page

 