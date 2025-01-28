package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookDropDown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sree");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("GS");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sree@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("ABCD");
		//date
		WebElement Date = driver.findElement(By.name("birthday_day"));
		Select dd1 =  new Select(Date);
		dd1.selectByIndex(6);
		//Month
		WebElement Month = driver.findElement(By.name("birthday_month"));
		Select dd2 =  new Select(Month);
		dd2.selectByIndex(11);
		//Year
		WebElement Year = driver.findElement(By.name("birthday_year"));
		Select dd3 =  new Select(Year);
		dd3.selectByVisibleText("1995");
		//Gender
		driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click();
		driver.quit();		
	}

}
