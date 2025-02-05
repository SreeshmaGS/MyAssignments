package week3.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingAlertInteractions {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://leafground.com/alert.xhtml;jsessionid=node0ticrbmf7p7s597fyayuaj7i8609016.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Thread.sleep(2000);
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		String message = "Sreeshma";
        confirmAlert.sendKeys(message);
        Thread.sleep(2000);
        String text = confirmAlert.getText();
        System.out.println("The alert text is:" +text);
        confirmAlert.accept();
        Thread.sleep(2000);
        
        
		

	}

}
