package com.qa.base;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Project {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
	 driver=new ChromeDriver();
	 
		
	}
	@Test(priority =0)
	public void linktest() {
		
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		
	}
	@Test(priority =1)
    public void userName() {
	WebElement user=driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[1]/td/input"));
	user.sendKeys("JYOTHIKA");
    	
    	
    }
	@Test(priority=2)
	public void passWord() {
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[2]/td/input"));
		pass.sendKeys("Subeena123#11");
	
	}
	@Test(priority=3)
	public void teXtcom() {
	WebElement commt=driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[3]/td/textarea"));
	commt.clear();
		
	}
	@Test(priority=4)
	public void textcmt() {
		WebElement comment=driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[3]/td/textarea"));
		comment.sendKeys("iam jyothika  registering page for the purpose of stuyding");
	}
	

	
	@Test(priority=5)
		 public void dropdown() {
		  WebElement down=driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[8]/td/select"));
		 
		  Select select =new Select(down);
		  
		   select.deselectByIndex(4);
		   
		   WebElement multi=driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select"));
		   Select selu=new Select(multi);

		   selu.deselectByIndex(0);
		   
		   selu.deselectByIndex(1);
		   selu.deselectByIndex(2);
		  
		  
	}
	@Test(priority=7)
	public void checkbox() {
		WebElement box=driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[5]/td/input[2]"));
		box.click();
		
		WebElement box1=driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[5]/td/input[1]"));
		box1.click();
		
		
	}
	@Test(priority =8)
		public void radiobutton() {
		WebElement radio=driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[6]/td/input[1]"));
		radio.click();
		
			
		}
		
	
	
	
	@AfterTest
	public void teardown() {
		
		
	}
}
