package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import appHook.Hooks;
import driverFactory.DriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Array_Page;
import pages.Home_Page;
import pages.Login_Page;

public class Array_Step {
	
	Array_Page array_page= new Array_Page(DriverConfig.getDriverInstance());
	Login_Page login_page = new Login_Page(DriverConfig.getDriverInstance());
	Home_Page home_page = new Home_Page(DriverConfig.getDriverInstance());
	
	List<Map<String, String>> Login = Hooks.Login;
	

@Given("The user logged in to dsAlgo Portal and should be in Array Page")
public void the_user_logged_in_to_ds_algo_portal_and_should_be_in_array_page() {
	login_page.GetstdButton();
   	login_page.SigninButton();
   	login_page.LoginwithvalidCred();
   	home_page.ArrayStrtBtn();
}

@Given("the user is in the Array page after logged in")
public void the_user_is_in_the_array_page_after_logged_in() {
	String actualTitle = array_page.PageTitle();
	String expectedTitle = Login.get(7).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks Arrays in Python link")
public void the_user_clicks_arrays_in_python_link() {
	array_page.clickOnarraysInPythonLink();
}

@Then("the user is navigated to Arrays in Python page")
public void the_user_is_navigated_to_arrays_in_python_page() {
	String actualTitle = array_page.PageTitle();
	String expectedTitle = Login.get(8).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks Arrays using List link")
public void the_user_clicks_arrays_using_list_link() {
	array_page.clickArraysUsingList();
}

@Then("the user is navigated to Arrays using List page")
public void the_user_is_navigated_to_arrays_using_list_page() {
	String actualTitle = array_page.PageTitle();
	String expectedTitle = Login.get(9).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks Basic operations in Lists link")
public void the_user_clicks_basic_operations_in_lists_link() {
	array_page.clickBasicOpInLists();
}

@Then("the user is navigated to Basic operations in Lists page")
public void the_user_is_navigated_to_basic_operations_in_lists_page() {
	String actualTitle = array_page.PageTitle();
	String expectedTitle = Login.get(10).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@When("the user clicks Applications of Array in link")
public void the_user_clicks_applications_of_array_in_link() {
	array_page.clickAppOfArray();
}

@Then("the user is navigated to Applications of Array page")
public void the_user_is_navigated_to_applications_of_array_page() {
	String actualTitle = array_page.PageTitle();
	String expectedTitle = Login.get(11).get("title");
	Assert.assertEquals(actualTitle, expectedTitle);
}

@Given("the user is in Arrays in Python page")
public void the_user_is_in_arrays_in_python_page() {
	array_page.clickOnarraysInPythonLink();
}

@Given("The user is on the Try Editor of Arrays in Python page")
public void the_user_is_on_the_try_editor_of_arrays_in_python_page() {
	array_page.clickOnarraysInPythonLink();
	array_page.OnClickTryhere();
}

@Given("the user is in Arrays Using List page")
public void the_user_is_in_arrays_using_list_page() {
	array_page.clickArraysUsingList();	
}

@Given("The user is on the Try Editor Arrays Using List page")
public void the_user_is_on_the_try_editor_arrays_using_list_page() {
	array_page.clickArraysUsingList();
	array_page.OnClickTryhere();
}

@Given("the user is in Basic Operations in Lists page")
public void the_user_is_in_basic_operations_in_lists_page() {
	array_page.clickBasicOpInLists();
}

@Given("The user is on the Try Editor Basic Operations in Lists page")
public void the_user_is_on_the_try_editor_basic_operations_in_lists_page() {
	array_page.clickBasicOpInLists();
	array_page.OnClickTryhere();
}

@Given("the user is in Applications of Array page")
public void the_user_is_in_applications_of_array_page() {
	array_page.clickAppOfArray();
}

@Given("The user is on the Try Editor Applications of Array page")
public void the_user_is_on_the_try_editor_applications_of_array_page() {
	array_page.clickAppOfArray();
	array_page.OnClickTryhere();
}

}
