package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsInteraction {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		  driver.findElement(By.id("password")).sendKeys("crmsfa");  
		  driver.findElement(By.className("decorativeSubmit")).click();
		  driver.findElement(By.linkText("CRM/SFA")).click(); 
		  driver.findElement(By.xpath("(//div[@class='x-panel-header'])[3]/a")).click();
		  driver.findElement(By.linkText("Merge Contacts")).click();
		  driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[1]")).click();
			Set<String> window1 = driver.getWindowHandles();
			List<String> allWindows1 = new ArrayList<String>(window1 );
		    driver.switchTo().window(allWindows1.get(1));
		  driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		  driver.switchTo().window(allWindows1.get(0));
		  driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[2]")).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  Set<String> window2 = driver.getWindowHandles();
		  List<String> allWindows2 = new ArrayList<String>(window2);
		  driver.switchTo().window(allWindows2.get(1));
		  driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.switchTo().window(allWindows1.get(0));
		  driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[3]")).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
		  System.out.println(driver.getTitle());
		  driver.quit();
}


	}

