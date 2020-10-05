package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.CartPage;
import pom.HeaderPage;
import pom.HomePage;
import pom.LoginPage;
import pom.MyCoursePage;
import pom.SelectedCourse;

public class TestCase1 {
	
	@Test
	public void Testing() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbhatolia\\Testing\\QuantInsti\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://quantra.quantinsti.com");
		
		HomePage home= new HomePage(driver);
		home.clickOnLoginbutton(driver);
		
		LoginPage login = new LoginPage(driver);
		login.loginToApplication(driver, "Sbhatolia2009@gmail.com", "12345678");
		
		
		MyCoursePage myCoursePage= new MyCoursePage(driver);
		myCoursePage.moveToBrowsecours(driver);
		myCoursePage.clickOnSentimenAnalysisInTrading(driver);
		
		SelectedCourse selectedCourse = new SelectedCourse(driver);
		String courseName =selectedCourse.getTitleOfCourse(driver);
		System.out.println(courseName);
		selectedCourse.clickOnEnrollButton(driver);
		
		int price =selectedCourse.getPriceOfCourse();
		System.out.println(price);
		
		CartPage cart = new CartPage(driver);
		int totalNumberOfItemInCart=cart.getTotalNumberOfItemInCart();
		System.out.println(totalNumberOfItemInCart);
		
		HeaderPage headerPage= new HeaderPage(driver);
		int cartCount=headerPage.getCartCount();
		System.out.println(cartCount);
        
		Assert.assertEquals(totalNumberOfItemInCart, cartCount);
		
		int basePrice=cart.getBasePrice();
		int amaountPayable=cart.getAmountPayable();
		System.out.println("BasePrice :" +basePrice);
		System.out.println("Amount Payable :" +amaountPayable );
		
		cart.clickOnViewDetail();
		
		
		
	    
		
		
	
		
		driver.close();
	}	

}
