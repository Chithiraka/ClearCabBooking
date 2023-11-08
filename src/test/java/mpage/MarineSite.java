package mpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarineSite {
	public WebDriver driver;
	By leavingfrom=By.name("origin");
	By goingto=By.id("country-select-demo");
	public MarineSite(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String leave,String going  )
	{
		driver.findElement(leavingfrom).sendKeys(leave);
		driver.findElement(goingto).sendKeys(going);

	}
	
}
