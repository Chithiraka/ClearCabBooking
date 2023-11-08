package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Source {
	WebDriver driver;
	By sername=By.name("user-name");
	By spswd=By.name("password");
	By slogin=By.id("login-button");
	By cart1=By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	By cart2=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
	By cart3=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
	By cart4=By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]");
	By cart5=By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
	By cart6=By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");
	By cartlink=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]");
	By scheckout=By.xpath("//*[@id=\"checkout\"]");
	By sfirstname=By.name("firstName");
	By slastname=By.name("lastName");
	By szip=By.name("postalCode");
	By scontinue=By.id("continue");
	By hamburger=By.xpath("//*[@id=\"react-burger-menu-btn\"]");
	By logout=By.xpath("//*[@id=\"logout_sidebar_link\"]");

	
	public  Source(WebDriver driver)
	{
		this.driver=driver;
	}
	public void firstpage(String username,String pswd)
	{
		driver.findElement(sername).sendKeys(username);
		driver.findElement(spswd).sendKeys(pswd);
		driver.findElement(slogin).click();;
		
	}
	public void cartsclicks()
	{
		driver.findElement(cart1).click();
		driver.findElement(cart2).click();
		driver.findElement(cart3).click();
		driver.findElement(cart4).click();
		driver.findElement(cart5).click();
		driver.findElement(cart6).click();
		driver.findElement(cartlink).click();
		
	}
	public void checking()
	{
		driver.findElement(scheckout).click();
	}
	public void swaglab(String firstname, String lastname,String zip)
	{
		checking();
		driver.findElement(sfirstname).sendKeys(firstname);;
		driver.findElement(slastname).sendKeys(lastname);;
		driver.findElement(szip).sendKeys(zip);;
		driver.findElement(scontinue).click();
		
	}
	public void home()
	{
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(hamburger).click();
		driver.findElement(logout).click();
	}
	

}
