package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALertGetText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://leafground.com/alert.xhtml;jsessionid=node0ticrbmf7p7s597fyayuaj7i8609016.node0");
		//driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
        Thread.sleep(2000);
        Alert confirmAlert =driver.switchTo().alert();
        String text = confirmAlert.getText();
        System.out.println("The alert text is:" +text);
        //confirmAlert.dismiss();
        confirmAlert.accept();
        Thread.sleep(1000);
        String element = driver.findElement(By.xpath("(//span[text()='Show'])[2]/following::span[@id='result']")).getText();
       // System.out.println("User action is:" +element);

	}

}
