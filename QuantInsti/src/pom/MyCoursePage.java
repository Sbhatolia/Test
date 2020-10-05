package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyCoursePage {
	@FindBy(xpath = "//a[contains(.,'Browse Courses')]")
	private WebElement browseCourse;
	
	@FindBy(xpath = "//span[contains(.,'Sentiment Analysis in Trading')]")
	private WebElement SentimentAnalysisinTrading;
	
	public MyCoursePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void moveToBrowsecours(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(browseCourse)).click();
		
	}
	
	public void clickOnSentimenAnalysisInTrading(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(SentimentAnalysisinTrading)).click();
	}

}
