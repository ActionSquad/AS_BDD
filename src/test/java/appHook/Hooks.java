package appHook;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import common.ConfigReader;
import common.ExcelReader;
import common.LoggerLoad;
import common.Screenshot;
import driverFactory.DriverConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

	public class Hooks {
		
		 public WebDriver driver;
		    
		    public static List<Map<String, String>> Login;
		    public static List<Map<String, String>> Code;
		    public static List<Map<String, String>> Python;
		    @Before(order = 1)
		    public static void setUpDriver() {
		    	{
		            DriverConfig.getdriver(ConfigReader.getProperty("Browser"));
		            LoggerLoad.info("Browser is opened" );
		        }
		    }
		    	
		    @Before(order = 2) 
		    public void setUp() {
		        try {
		        	String Path = "src/test/resources/TestData/ExcelData.xlsx" ;         
		        	LoggerLoad.info("Excel is Initialised and Path :" + Path);
		            ExcelReader excelreader= new ExcelReader();
		            Login = excelreader.getData(Path, "login");
		             Code = excelreader.getData(Path, "code");
		             Python = excelreader.getData(Path, "python");
		          } catch (Exception e) {
		           e.printStackTrace();
		           LoggerLoad.error("Error initializing Excel data: " + e.getMessage());
		           throw new RuntimeException("Error initializing Excel data: " + e.getMessage());
		           
		       }
		    }
		    
		    @After(order=2)
		    public void afterScenario1(Scenario scenario) {
				if(scenario.isFailed()) 
				LoggerLoad.info("ScreenShot is created for Failure Scenarios");
				Screenshot.takeScreenshot(scenario);
		    }
		    
		    
		   @After(order=1)
		  public static void tearDown() {
			   LoggerLoad.info("Driver Instance is Closed");
		
		        DriverConfig.quitdriver();
		        
	}

		}
