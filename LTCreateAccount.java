package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LTCreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 Thread.sleep(5000);
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Accounts")).click();
		 driver.findElement(By.linkText("Create Account")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.id("accountName")).sendKeys("Sreeshma GS");
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		 driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		 driver.findElement(By.name("numberEmployees")).sendKeys("10");
		 Thread.sleep(5000);
		 driver.findElement(By.className("smallSubmit")).click();
		 System.out.println(driver.getTitle());
		 Thread.sleep(5000);
		 driver.quit();
	}
}


