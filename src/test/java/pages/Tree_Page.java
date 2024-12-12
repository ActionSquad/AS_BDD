package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
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
   
	@FindBy(xpath = "//a[@href='tree']") WebElement getstdButton;	
	 @FindBy(linkText ="Overview of Trees") WebElement overviewButton;
	 @FindBy(linkText="Try here>>>") WebElement tryhereButton;
	 @FindBy(xpath="//button[@type='button']") WebElement runButton;  
	 @FindBy(xpath="//div[@role='presentation'and @class='CodeMirror-lines']") WebElement txteditorField;
	 @FindBy(id= "output")WebElement outputField;
	
	 public Tree_Page(WebDriver driver) {
		 
			this.driver = driver;
		    this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));
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
		 
//	 }
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
    		throw new IllegalStateException("alert is not present");
    	}
	
    	
    }
     
    public void AcceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    
    public void TextEditor(String CodeText) {
       wait.until(ExpectedConditions.elementToBeClickable(txteditorField));
    	txteditorField.sendKeys(CodeText);
    }
    
    public String OutputTxtEditorField() {
    	return txteditorField.getText();
    }

}
