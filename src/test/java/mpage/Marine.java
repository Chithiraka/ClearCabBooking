package mpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Marine {
	WebDriver driver;
	By leavingfrom=By.xpath("//*[@id=\"country-select-demo\"]");
	By goingto=By.xpath("//*[@id=\"country-select-demo\"]");
	By searching=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[4]/input");
	By depart=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[2]/div[2]/div/div/div/button");
	By month=By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
	By rarrow=By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]/*[1]");
	By day=By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/button[1]");
	By myear=By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]");
	By yarrow=By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/button");
	By mtravels=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[2]/div[3]/ul[1]/li[1]/div[1]");
	By madult=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[1]/div/div/div[3]");
	By mchild=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[2]/div/div/div[3]");
	public Marine(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalue()
	{
		driver.findElement(leavingfrom);
		driver.findElement(goingto);
	}
	
	public void depart()
	{
		driver.findElement(depart).click();
	}
	public void month1()
	{
		WebElement year=driver.findElement(myear);
		 String y=year.getText();
		 if(y.equals("2023"))
		 {
			 System.out.println("2023");
			//break;
		 }
		 else
		 {
			 driver.findElement(yarrow).click();;
		 }
		 WebElement mon=driver.findElement(month);
		 String m1=mon.getText();
		 if(m1.equals("October"))
		 {
			 System.out.println("October");
			// break;
		 }
		 else
		 {
			 driver.findElement(rarrow).click();;
		 }
		 List<WebElement> alldate1= driver.findElements(day);
		 for(WebElement datelement:alldate1)
		 {
				String date=datelement.getText();
				//System.out.println(date);
				if(date.equals("12"))
				{
					datelement.click();
					break;
				}
		 }	 
	}
	public void travels()
	{
		driver.findElement(mtravels).click();
		driver.findElement(madult).click();
		driver.findElement(madult).click();
		driver.findElement(mchild).click();
		
	}
	//public void searchh()
	//{
	//	driver.findElement(searching).click();)
	//}
}
