package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class faceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.linkText("Create new account")).click();
	
	driver.findElement(By.name("firstname")).sendKeys("Vara");
	
	driver.findElement(By.name("lastname")).sendKeys("Sen");
	
	driver.findElement(By.name("reg_email__")).sendKeys("9940617025");
	
	driver.findElement(By.id("password_step_input")).sendKeys("Pillayar@1");
	
	WebElement dayelement = driver.findElement(By.id("day"));
	
	Select sec =  new Select (dayelement);
	
	sec .selectByIndex(4);
	
	WebElement yearelement = driver.findElement(By.id("year"));
	
	Select yearDD = new Select (yearelement);
	
	yearDD.selectByVisibleText("1998");
	
	WebElement Monthelement = driver.findElement(By.id("month"));
	
	Select MonthDD = new Select(Monthelement);
	
	MonthDD.selectByValue("3");
	
	driver.findElement(By.className("_8esa")).click();
	
	//driver.findElement(By.id("_6j mvm _6wk _6wl _58mi _3ma _6o _6v")).click();
	
	
	}

}
