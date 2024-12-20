package common;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import driverFactory.DriverConfig;
import io.cucumber.java.Scenario;


		public class Screenshot {

	    public static void takeScreenshot(Scenario scenario) {
	        WebDriver driver = DriverConfig.getDriverInstance(); 

	        if (driver instanceof TakesScreenshot) {
	            TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
	            File screenshot = screenshotDriver.getScreenshotAs(OutputType.FILE);
	            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	            String screenshotName = scenario.getName().replaceAll(" ", "_")  +timestamp+ ".png";
	            File destinationFile = new File("screenshots/" + screenshotName);
	            try {
	                FileUtils.copyFile(screenshot, destinationFile);
	             //   System.out.println("Screenshot saved to: " + destinationFile.getAbsolutePath());
	                LoggerLoad.info("Screenshot saved to:" + destinationFile.getAbsolutePath());
	            } catch (IOException e) {
	            	LoggerLoad.error("Screenshot IOException" +e.getMessage());
	                e.printStackTrace();
	            }
	        } else {
	          //  System.out.println("WebDriver does not support taking screenshots");
	            LoggerLoad.warn("Driver is not supporting to take the Screenshot");
	        }
	    }
	}
