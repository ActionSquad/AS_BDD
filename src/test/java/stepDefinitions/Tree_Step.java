package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import appHook.Hooks;
import driverFactory.DriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login_Page;
import pages.Tree_Page;

public class Tree_Step {
	
	Tree_Page tree_page = new Tree_Page(DriverConfig.getDriverInstance());
	Login_Page login_page = new Login_Page(DriverConfig.getDriverInstance());
	
    List<Map<String, String>> Login = Hooks.Login; //if you want to use login sheet
  

   @Given("The user logged in to dsAlgo Portal and should be in Tree Page")
   public void the_user_logged_in_to_ds_algo_portal_and_should_be_in_tree_page() {
	login_page.GetstdButton();//common
   	login_page.SigninButton();//common
   	login_page.LoginwithvalidCred();//common
   	tree_page.GetStdButton();//This is only for Tree Module(Change according to your module)
    
}

    @Given("The user is in the TREE INTRODUCTION Page")
    public void the_user_is_in_the_tree_introduction_page() {
    	
    	String actualTitle = login_page.PageTitle();
		String expectedTitle = Login.get(2).get("title");
		Assert.assertEquals(actualTitle, expectedTitle);
    	
    }

    @When("The user clicks OVERVIEW OF TRESS tab")
    public void the_user_clicks_overview_of_tress_tab() {
    	tree_page.OverviewBtn();
            }

    @Then("The user should be navigated to Overview of Trees Page")
    public void the_user_should_be_navigated_to_overview_of_trees_page() {
    	String actualTitle = login_page.PageTitle();
		String expectedTitle = Login.get(1).get("title");
		Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Given("The user is on the OVERVIEW OF TRESS page")
    public void the_user_is_on_the_overview_of_tress_page() {
    	
    	tree_page.OverviewBtn();
    	
            }

    @When("The user clicks TRY HERE button in the Overview of Trees Page")
    public void the_user_clicks_try_here_button_in_the_overview_of_trees_page() {
    	tree_page.TryhereBtn();
    	
            }

    @Then("The user should be navigated to try Editor page with a RUN button to test")
    public void the_user_should_be_navigated_to_try_editor_page_with_a_run_button_to_test() {
    	String actualTitle = login_page.PageTitle();
		String expectedTitle = Login.get(3).get("title");
		Assert.assertEquals(actualTitle, expectedTitle);
    	
           }
    
    @Given("The user is on the Try Editor page of Overview of Trees page")
    public void the_user_is_on_the_try_editor_page_of_overview_of_trees_page() {
    	tree_page.OverviewBtn();
    	tree_page.TryhereBtn();
        
    }

   @When("The user enters the Empty in Text Editor and clicks RUN button")
    public void the_user_enters_the_empty_in_text_editor_and_clicks_run_button() {
    
	   tree_page.RunBtn();
   }

    @Then("The Error message in alert window should be displayed")
    public void the_error_message_in_alert_window_should_be_displayed() {
        Assert.assertTrue(tree_page.IsAlertPresent());
        
    }

    @When("The user enters the valid code in Text Editor and clicks RUN button")
    public void the_user_enters_the_valid_code_in_text_editor_and_clicks_run_button() {
    	String CodeText = Login.get(0).get("code");
    	tree_page.TextEditor(CodeText);
    	 tree_page.RunBtn();
    	 
    }

    @Then("The displayed in the console should be displayed")
    public void the_displayed_in_the_console_should_be_displayed() {
    	String actualcode= tree_page.OutputTxtEditorField();
		String expectedcode = Login.get(0).get("output");
		Assert.assertEquals(actualcode,expectedcode );
        
    }

    @When("The user enters the Invalid code1 in Text Editor and clicks RUN button")
    public void the_user_enters_the_invalid_code1_in_text_editor_and_clicks_run_button() {
    	String CodeText = Login.get(1).get("invalidcode");
    	tree_page.TextEditor(CodeText);
    	tree_page.RunBtn();       
    }

    @Then("The nameerror pop up alert message should be displayed")
    public void the_nameerror_pop_up_alert_message_should_be_displayed() {
    	String actualalert = tree_page.AlertText();
    	tree_page.AcceptAlert();
    	String expectedalert = Login.get(5).get("alert");
    	Assert.assertEquals(actualalert,expectedalert);
    	
    }

    @When("The user enters the Invalid code2 in Text Editor and clicks RUN button")
    public void the_user_enters_the_invalid_code2_in_text_editor_and_clicks_run_button() {
    	String CodeText = Login.get(0).get("invalidcode");
    	tree_page.TextEditor(CodeText);
    	tree_page.RunBtn();       
    	
            }

    @Then("The syntaxerror pop up alert message should be displayed")
    public void the_syntaxerror_pop_up_alert_message_should_be_displayed() {
    	String actualalert = tree_page.AlertText();
    	tree_page.AcceptAlert();
    	String expectedalert = Login.get(4).get("alert");
    	Assert.assertEquals(actualalert,expectedalert);    
    }
    
    @Given("The user is in The TRY EDITOR page")
    public void the_user_is_in_the_try_editor_page() {
    	tree_page.OverviewBtn();
    	tree_page.TryhereBtn();
           
            }

    @When("The user clicks The left arrow in The browser")
    public void the_user_clicks_the_left_arrow_in_the_browser() {
        tree_page.DriverNavigation();
    }
    
//---------------------------------------------------------------------------------------------------------------------------------------------
//Terminologies
    
    @When("The user clicks TERMINOLOGIES tab")
    public void the_user_clicks_terminologies_tab() {
    	tree_page.TerminologiesBtn();

    }

    @Then("The user should be navigated to Terminologies page")
    public void the_user_should_be_navigated_to_terminologies_page() {
    	String actualTitle = login_page.PageTitle();
    	String expectedTitle = Login.get(29).get("title");
    	Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Given("The user is in The TERMINOLOGIES  page")
    public void the_user_is_in_the_terminologies_page() {
    	tree_page.TerminologiesBtn(); 
    }

    @When("The user clicks TRY HERE button in The Terminologies page")
    public void the_user_clicks_try_here_button_in_the_terminologies_page() {
    	tree_page.TryhereBtn();   
    }

    @Given("The user is on the Try Editor in Terminologies page")
    public void the_user_is_on_the_try_editor_in_terminologies_page() {
    	tree_page.TerminologiesBtn();
    	tree_page.TryhereBtn();
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------
//	Types of Trees
    
    @When("The user clicks TYPES OF TREES tab")
    public void the_user_clicks_types_of_trees_tab() {
    	tree_page.TypesOfTreesBtn();
    }

    @Then("The user should be navigated to Types of Trees page")
    public void the_user_should_be_navigated_to_types_of_trees_page() {
    	String actualTitle = login_page.PageTitle();
    	String expectedTitle = Login.get(30).get("title");
    	Assert.assertEquals(actualTitle,expectedTitle);       

    }

    @Given("The user is in The TYPES OF TREES  page")
    public void the_user_is_in_the_types_of_trees_page() {
    	tree_page.TypesOfTreesBtn();
    }

    @When("The user clicks TRY HERE button in The Types of Trees page")
    public void the_user_clicks_try_here_button_in_the_types_of_trees_page() {
    	tree_page.TryhereBtn();
        
    }

    @Given("The user is on the Try Editor in Types of Trees page")
    public void the_user_is_on_the_try_editor_in_types_of_trees_page() {
    	tree_page.TypesOfTreesBtn();
    	tree_page.TryhereBtn();
    }
//--------------------------------------------------------------------------------------------------------------------------------------------
//Tree Traversals
    @When("The user clicks TREE TRAVERSALS tab")
    public void the_user_clicks_tree_traversals_tab() {
        tree_page.TreeTraversalsBtn();
    }

    @Then("The user should be navigated to Trees Traversals page")
    public void the_user_should_be_navigated_to_trees_traversals_page() {
    	String actualTitle = login_page.PageTitle();
    	String expectedTitle = Login.get(31).get("title");
    	Assert.assertEquals(actualTitle,expectedTitle);       
    }

    @When("The user clicks TRY HERE button in The Tree Traversals page")
    public void the_user_clicks_try_here_button_in_the_tree_traversals_page() {
       tree_page.TryhereBtn();
    }

    @Given("The user is on the Try Editor in TreeTraversals")
    public void the_user_is_on_the_try_editor_in_tree_traversals() {
    	tree_page.TreeTraversalsBtn();
    	tree_page.TryhereBtn();
    }

   
    
    
    
    
    
}

