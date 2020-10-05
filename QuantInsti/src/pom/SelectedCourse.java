package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectedCourse {
	
	@FindBy(xpath = "//h1[contains(.,'Learning Track: Sentiment Analysis in Trading')]")
	private WebElement courseName;
	
	@FindBy(xpath="(//span[contains(.,'₹22575')])[2]")
	private WebElement getPrice;
	
	@FindBy(xpath = "//button[contains(@class,'vue-ui-button btn button tertiary')]")
	private WebElement enrollButton;
	
	public SelectedCourse(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String  getTitleOfCourse(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.visibilityOf(courseName)).getText();
		
	}
	
	public int getPriceOfCourse() {
		return getPriceOfCourse();
	}
	
	public void clickOnEnrollButton(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOf(enrollButton)).click();
		
	}
}
