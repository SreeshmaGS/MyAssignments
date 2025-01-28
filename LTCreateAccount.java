package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		 WebElement accountNameField = driver.findElement(By.id("accountName"));
		 String accountName = "Shyam (10667)";
		 accountNameField.sendKeys(accountName);
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		 //driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		 //driver.findElement(By.name("numberEmployees")).sendKeys("10");
		 Thread.sleep(1000);
		 //Industry
		 WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		 Select dd1 =  new Select(industryDD);
		 dd1.selectByIndex(3);
		 //Ownership
		 WebElement ownerShip = driver.findElement(By.name("ownershipEnumId"));
		 Select dd2=new Select(ownerShip);
		 dd2.selectByVisibleText("S-Corporation");
		 //Source
		 WebElement sourceDropdown = driver.findElement(By.id("dataSourceId"));
		 Select dd3=new Select(sourceDropdown);
		 dd3.selectByValue("LEAD_EMPLOYEE");
		 //Marketing Campaign
		 WebElement marketingCamp = driver.findElement(By.id("marketingCampaignId"));
		 Select dd4=new Select(marketingCamp);
		 dd4.selectByIndex(6);
		 //State
		 WebElement state = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		 Select dd5=new Select(state);
		 dd5.selectByValue("TX");
		 Thread.sleep(5000);
		 driver.findElement(By.className("smallSubmit")).click();
		 Thread.sleep(5000);
		 //Entered account name
		 WebElement displayedAccountName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		 String accountNameText = displayedAccountName.getText();
		 //System.out.println(displayedAccountName.getText()); 
		 System.out.println(driver.getTitle());
		 Thread.sleep(5000);
		 if (accountName.equals(accountNameText)) {
             System.out.println("Account name is displayed correctly.");
         } else {
             System.out.println("Account name verification failed.");
         }
		 driver.quit();
	}
}


