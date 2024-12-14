package stepDefinitions;

import java.util.List;
import java.util.Map;
import appHook.Hooks;
import driverFactory.DriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Graph_Page;
import pages.Home_Page;
import pages.Login_Page;

public class Graph_Step {
	
	Graph_Page graph_page = new Graph_Page(DriverConfig.getDriverInstance());
	Login_Page login_page = new Login_Page(DriverConfig.getDriverInstance());
	Home_Page home_page = new Home_Page(DriverConfig.getDriverInstance());
	
	List<Map<String, String>> Login = Hooks.Login;
	

}
