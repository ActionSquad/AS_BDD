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

    @Then("The user should be navigated to Overview of Trees Page which has TRY HERE button")
    public void the_user_should_be_navigated_to_overview_of_trees_page_which_has_try_here_button() {
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
        String actualAlert = tree_page.AlertText();
    	System.out.println(actualAlert);
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
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The nameerror pop up alert message should be displayed")
    public void the_nameerror_pop_up_alert_message_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user enters the Invalid code2 in Text Editor and clicks RUN button")
    public void the_user_enters_the_invalid_code2_in_text_editor_and_clicks_run_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The syntaxerror pop up alert message should be displayed")
    public void the_syntaxerror_pop_up_alert_message_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

   	
}

