package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Array_Page {

		WebDriver driver;
		
		//ArrayPage
		@FindBy (linkText = "Arrays in Python")WebElement arraysInPythonLink;
		@FindBy (linkText = "Arrays Using List")WebElement arraysUsingListLink;
		@FindBy (linkText ="Basic Operations in Lists")WebElement basicOpinListsLink;
		@FindBy (linkText ="Applications of Array")WebElement appOfArrayLink;
		@FindBy (xpath="//a[@href='/tryEditor']")WebElement TryHereLink;
		
		//@FindBy (xpath="//a[@href='/array/practice']")WebElement practiceQueLink;
		//@FindBy (xpath="//a[@href='/question/1']")WebElement searchArrayLink;
		//@FindBy (xpath="//a[@href='/question/2']")WebElement mostConOnesLink;
		//@FindBy (xpath="//a[@href='/question/3']")WebElement findEvenNumLink;
		//@FindBy (xpath="//a[@href='/question/4']")WebElement sqOfSortedArrayLink;		

		//@FindBy (xpath="//*[@id='answer_form']")WebElement answerform;
		//@FindBy (xpath="//textarea[@tabindex='0']")WebElement editorInput;
		//@FindBy (xpath="//*[@id='answer_form']/button")WebElement runButton;
		//@FindBy (xpath="//*[@class='button']")WebElement submitButton;
		//@FindBy (id="output")WebElement output;
		
		
		public Array_Page(WebDriver driver) {
			 this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public String PageTitle() {
			return driver.getTitle();	
		}

		public void clickOnarraysInPythonLink() {
			arraysInPythonLink.click();
		}
		public void clickArraysUsingList() {
			arraysUsingListLink.click();

		}
		public void clickBasicOpInLists() {
			basicOpinListsLink.click();

		}
		public void clickAppOfArray() {
			appOfArrayLink.click();

		}

		public void OnClickTryhere() {
			TryHereLink.click();
		}
		
		public void BrowserBack() {
			driver.navigate().back();
		}
	
		/*
		public void clickOnRunButton() {
			runButton.click();

		}

		public String getErrorText() {
			String errorMsg = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			return errorMsg;

		}
		public void clickPracticeQue() {
			practiceQueLink.click();

		}

		public void SearcharrayLink() {
			searchArrayLink.click();

		}

		public void clickOnSubmitButton() {
			submitButton.click();
		}


		public void navigateTo(String pagename) {
			String urlName = ConfigReader.getProperty(pagename);
			driver.get(urlName);
		}

		public void maxConsOnes() {
			mostConOnesLink.click();

		}
		public void findNumbers() {
			findEvenNumLink.click();

		}

		public void squaresSortedArray() {
			sqOfSortedArrayLink.click();
		}
		
		*/
		
	}



