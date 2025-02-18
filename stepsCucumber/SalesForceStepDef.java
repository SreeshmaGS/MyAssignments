package stepsCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForceStepDef {

	
	public ChromeDriver driver;
	@Given("Launch the Sales Force browser")
	public void launchBrowserSF() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("Load the Sales Force url")
	public void load_the_SFurl() {
		driver.get("https://login.salesforce.com ");
	}
	
	@Given("Enter the SF username as {string}")
	public void enter_the_SFusername_as(String username) {
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	}

	@Given("Enter the SF password as {string}")
	public void enter_the_SFpassword_as(String password)  {
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("Click on the SF Login button")
	public void click_on_the_SFlogin_button() {
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Click on the Toggle button")
	public void click_on_the_toggle_button() throws InterruptedException {
	    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    
	}

	@When("Click Sales from App Launcher")
	public void click_sales_from_app_launcher() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Click on Acccount Tab")
	public void click_on_acccount_tab() {
		WebElement account =driver.findElement(By.xpath("(//span[text()='Accounts'])[1]"));
	    driver.executeScript("arguments[0].click();", account);
	}

	@When("Click on New button")
	public void click_on_new_button() {
		driver.findElement(By.xpath("//a[@title='New']")).click();
	}

	@When("Enter Account Name")
	public void enter_account_name() {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Sreeshma");
	}

	@When("Select Ownership as Public")
	public void select_ownership_as_public() {
		WebElement ownership = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
		driver.executeScript("arguments[0].click();", ownership);
		WebElement ownershipValue= driver.findElement(By.xpath("//span[text()='Public']"));
		driver.executeScript("arguments[0].click();", ownershipValue);
		//Select dd1 = new Select (ownership);
		//dd1.selectByVisibleText("Public");
		//driver.executeScript("arguments[0].click();", dd1);
	}

	@When("Click Save")
	public void click_save() {
	    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	 @Then("Verify Account Name") public void verify_account_name() {
		 boolean alert = driver.findElement(By.xpath("//div[contains(@class,'toastContent')]")).isDisplayed();
		  String alertmsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage ')]/a/div")).getText();
		  if (alert) {
			   System.out.println("Success confirmation is succesfully displayed! and the account name is: " + alertmsg);
			  } else {
			   System.out.println("Success confirmation is not displaying");
			  }
			  driver.close();
	 }
	 
	 
}
