package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LTCreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 Thread.sleep(1000);
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		 driver.findElement(By.xpath("//span[text()='Forename']/following::*[@name='firstName']")).sendKeys("Sreeshma");
		 driver.findElement(By.xpath("//span[text()='Surname']/following::*[@name='lastName']")).sendKeys("GS");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sanal");
		 driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("K");
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("PS");
		 Thread.sleep(2000);
		 driver.findElement(By.className("smallSubmit")).click();
		 Thread.sleep(3000);
		 System.out.println(driver.getTitle());
		 driver.close();
	}


	}

