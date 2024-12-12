package stepDefinitions;

import org.testng.Assert;
import java.util.List;
import java.util.Map;

import driverFactory.DriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Home_Page;
import pages.Login_Page;
import pages.Queue_Page;
import appHook.Hooks;

public class Queue_Step {
	
	Queue_Page queue_page = new Queue_Page(DriverConfig.getDriverInstance());
	Login_Page login_page = new Login_Page(DriverConfig.getDriverInstance());
	Home_Page home_page = new Home_Page(DriverConfig.getDriverInstance());
	
	List<Map<String, String>> Login = Hooks.Login;

@Given("The user logged in to dsAlgo Portal and should be in Queue Page")
public void the_user_logged_in_to_ds_algo_portal_and_should_be_in_queue_page() {
	login_page.GetstdButton();
   	login_page.SigninButton();
   	login_page.LoginwithvalidCred();
   	home_page.QueueStrtBtn();
}

@Given("the user is in the queue page after logged in")
public void the_user_is_in_the_queue_page_after_logged_in() {
	String actualTitle = queue_page.PageTitle();
	String expectedTitle = Login.get(28).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks implementation of queue in python link")
public void the_user_clicks_implementation_of_queue_in_python_link() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the user is navigated to implementation of queue in python page")
public void the_user_is_navigated_to_implementation_of_queue_in_python_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user clicks implementation using collections deque link in queue page")
public void the_user_clicks_implementation_using_collections_deque_link_in_queue_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the user is navigated to implementation using collections deque page")
public void the_user_is_navigated_to_implementation_using_collections_deque_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user clicks implementation using array link in queue page")
public void the_user_clicks_implementation_using_array_link_in_queue_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the user is navigated to implementation using array page")
public void the_user_is_navigated_to_implementation_using_array_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user clicks queue operations link")
public void the_user_clicks_queue_operations_link() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the user is navigated to queue operations page")
public void the_user_is_navigated_to_queue_operations_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the user is in implementation of queue in python page")
public void the_user_is_in_implementation_of_queue_in_python_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user clicks Try here>>> button")
public void the_user_clicks_try_here_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the user is navigated to tryeditor window")
public void the_user_is_navigated_to_tryeditor_window() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is on the Try Editor implementation of queue page")
public void the_user_is_on_the_try_editor_implementation_of_queue_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the user is in tryeditor window")
public void the_user_is_in_tryeditor_window() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user click browser back arrow")
public void the_user_click_browser_back_arrow() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user clicks implementation using collections deque link")
public void the_user_clicks_implementation_using_collections_deque_link() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the user is in implementation using collections deque page")
public void the_user_is_in_implementation_using_collections_deque_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is on the Try Editor implementation using collections deque page")
public void the_user_is_on_the_try_editor_implementation_using_collections_deque_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user clicks implementation using array link")
public void the_user_clicks_implementation_using_array_link() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the user is in implementation using array page")
public void the_user_is_in_implementation_using_array_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is on the Try Editor implementation using array page")
public void the_user_is_on_the_try_editor_implementation_using_array_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the user is in queue operations page")
public void the_user_is_in_queue_operations_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is on the Try Editor queue operations page")
public void the_user_is_on_the_try_editor_queue_operations_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user clicks Practice Questions link")
public void the_user_clicks_practice_questions_link() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the user is navigated to Practice Questions page")
public void the_user_is_navigated_to_practice_questions_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user clicks Sign out")
public void the_user_clicks_sign_out() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the user is directed to homepage with message logged out successfully")
public void the_user_is_directed_to_homepage_with_message_logged_out_successfully() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
}