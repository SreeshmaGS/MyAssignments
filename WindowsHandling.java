package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.irctc.co.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> windowPath =  driver.getWindowHandles();
		List<String> windowPathList = new ArrayList<String>(windowPath);
		driver.switchTo().window(windowPathList.get(1));
		String childTitle = driver.getTitle();
		System.out.println(childTitle);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().window(windowPathList.get(0));
		driver.close();
		
	}

}
