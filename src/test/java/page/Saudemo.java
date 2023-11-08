package page;

//import java.time.Duration;
import java.util.List;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class Saudemo 
{
WebDriver driver;

By username=By.name("user-name");
By password=By.name("password");
By login=By.name("login-button");
By Acart=By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
By Bcart=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
By Ccart=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
By Dcart=By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]");
By Ecart=By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
By Fcart=By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");
//By cart=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
By c=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]");
By checkouts=By.xpath("//*[@id=\"checkout\"]");
By firstnames=By.xpath("//*[@id=\"first-name\"]");
By lastnames=By.xpath("//*[@id=\"last-name\"]");
By zippostalcode=By.xpath("//*[@id=\"postal-code\"]");
By continues=By.xpath("//*[@id=\"continue\"]");
By hamberger=By.xpath("//*[@id=\"react-burger-menu-btn\"]");
By logouts=By.xpath("//*[@id=\"logout_sidebar_link\"]");
public Saudemo(WebDriver driver)
{
	this.driver=driver;
}
public void setvalues(String Username,String Password)
{
	driver.findElement(username).sendKeys(Username);
	driver.findElement(password).sendKeys(Password);
}
public void login()
{
	driver.findElement(login).click();
}
public void Addtocart()
{
	driver.findElement(Acart).click();
	driver.findElement(Bcart).click();
	driver.findElement(Ccart).click();
	driver.findElement(Dcart).click();
	driver.findElement(Ecart).click();
	driver.findElement(Fcart).click();
		
}
public void cart1()
{
	driver.findElement(c).click();
}
public void checkout()
{
	driver.findElement(checkouts).click();
	
}
public void reg(String Firstnames, String Lastname,String zippostalcodes )
{
	driver.findElement(firstnames).sendKeys(Firstnames);
	driver.findElement(lastnames).sendKeys(Lastname);
	driver.findElement(zippostalcode).sendKeys(zippostalcodes);
}
public void continuess()
{
	driver.findElement(continues).click();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();

}
public void hamburgers()
{
	driver.findElement(hamberger).click();
}
public void logout()
{
	driver.findElement(logouts).click();
}
}

