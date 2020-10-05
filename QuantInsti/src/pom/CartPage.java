package pom;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartPage {

	WebDriver driver;
	
	@FindBy(xpath="//div[@class='cart-item']")
	private List<WebElement> cartItems;
	
	@FindBy(xpath = "(//h5[@class='font-bold']/span")
	private WebElement amountPayable;
	
	@FindBy(xpath = "//a[@href='/course/python-for-trading'][contains(.,'View Details')]")
	private WebElement viewDetail;
	

	
	
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public int getTotalNumberOfItemInCart() {
		int items =driver.findElements(By.xpath("//div[@class='cart-item']")).size();
		System.out.println("Numner of Items in a cart : " +items);
		return items;
	}
	
	public int  getAmountPayable() {
		return Integer.parseInt(amountPayable.getText());
	}
	
	
	public int getBasePrice() {
		int baseprice=Integer.parseInt(driver.findElements(By.xpath("//div[@class='cart-summary-item']/div[@class='cart-summary-right']")).get(0).getText());
		return baseprice;
	}
	
	public void clickOnViewDetail() throws InterruptedException {
		viewDetail.click();
		Thread.sleep(4000);
		driver.close();
	}
	
	
	
}
