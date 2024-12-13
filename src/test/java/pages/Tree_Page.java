package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tree_Page {
	
   WebDriver driver;
   WebDriverWait wait;
   
<<<<<<< Updated upstream
  
	@FindBy(xpath = "//a[@href='tree']") WebElement getstdButton;	
	 @FindBy(linkText ="Overview of Trees") WebElement overviewButton;
	 @FindBy(linkText="Try here>>>") WebElement tryhereButton;
	 @FindBy(xpath="//button[@type='button']") WebElement runButton;  
=======
	 @FindBy(xpath = "//a[@href='tree']") WebElement getstdButton;	
	 @FindBy(linkText ="Overview of Trees") WebElement overviewButton;
	 @FindBy(linkText="Try here>>>") WebElement tryhereButton;
	 @FindBy(xpath="//button[text()='Run']") WebElement runButton;  
>>>>>>> Stashed changes
	 @FindBy(xpath ="//div[@class='input']/div/div/textarea") WebElement txteditorField;
	 @FindBy(id= "output")WebElement outputField;
	 @FindBy(linkText ="Terminologies")WebElement terminologiesButton;
	 @FindBy(linkText ="Types of Trees")WebElement typesoftreesButton;
	 @FindBy(linkText ="Tree Traversals")WebElement treetraversalsButton;
	// @FindBy(linkText ="Terminologies")WebElement terminologiesButton;
	// @FindBy(linkText ="Terminologies")WebElement terminologiesButton;
	 
	 
	 

	 
	 
	
	 public Tree_Page(WebDriver driver) {
		 
			this.driver = driver;
		    this.wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		    PageFactory.initElements(driver, this);
			
		}
	 
	 public void OverviewBtn() {
		 overviewButton.click();
	 }
	/* public String OverviewPageTitle() {
			return driver.getTitle();
	 }*/
	 public void TryhereBtn() {
		 tryhereButton.click();
		
	 }
//	 public static boolean isrunButtonEnabled() {
//		return runButton.isEnabled();
		 
	 public void RunBtn() {
		 wait.until(ExpectedConditions.elementToBeClickable(runButton));
		 runButton.click();
	 
	 }
	 
    public void GetStdButton() {
    	getstdButton.click();
    }
    
    public  boolean IsAlertPresent() {
    	try {
    		wait.until(ExpectedConditions.alertIsPresent());
    	return true;
    }catch (NoAlertPresentException e) {
    	return false;
    }
    }
    public String AlertText() {
    	if(IsAlertPresent()) {
    		Alert alert = driver.switchTo().alert();
    		return alert.getText();
    	}else {
    		System.out.println("Alert is not present");
    	}
		return null;
    }
     
    public void AcceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    
<<<<<<< Updated upstream
    public void TextEditor(String code) {
       wait.until(ExpectedConditions.elementToBeClickable(txteditorField));
    	txteditorField.sendKeys(code);
    } 
   
=======
    public void TextEditor(String code)
    {String text=code;
    ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value','"+text+"')", txteditorField);
    txteditorField.sendKeys(code);
 
    	}
>>>>>>> Stashed changes
    
    public String OutputTxtEditorField() {
    	return outputField.getText();
    }
    public void TerminologiesBtn() {
    	terminologiesButton.click();
    }
    public void TypesOfTreesBtn() {
    	typesoftreesButton.click();
    }
    public void TreeTraversalsBtn() {
    	treetraversalsButton.click();
    }
    
    public void DriverNavigation() {
    	driver.navigate().back();  	
    }

}
