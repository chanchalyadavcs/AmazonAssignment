package mainjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonRegistration {
	public static WebDriver driver;
	public static String uname = "abc";
	public static String mob ="+91 111111111";
	public static String pass ="password123";
	public static String repass ="password123";
	
		public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\sele\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
		  driver = new ChromeDriver(options);
		  driver.get("https://www.amazon.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
         registration();
		 login();
	}
			
		public static void registration() throws InterruptedException {
		WebElement accountAndlist = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		accountAndlist.click();

		WebElement createAccountButton = driver.findElement(By.id("createAccountSubmit"));
		createAccountButton.click();
				
		Thread.sleep(1000);
		WebElement nameinput = driver.findElement(By.id("ap_customer_name"));
		nameinput.sendKeys(uname);

		Thread.sleep(1000);
		WebElement moboremail = driver.findElement(By.id("ap_email"));
		moboremail.sendKeys("+91 7755939903");

		Thread.sleep(1000);
		WebElement password_input = driver.findElement(By.id("ap_password"));
		password_input.sendKeys(pass);

		Thread.sleep(1000);
		WebElement repassword_input = driver.findElement(By.id("ap_password_check"));
		repassword_input.sendKeys(repass);

		Thread.sleep(1000);
		WebElement create_account = driver.findElement(By.id("continue"));
		create_account.click();
	}
		
		public static void login() throws InterruptedException {
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

		WebElement emailinput = driver.findElement(By.id("ap_email"));
		emailinput.sendKeys(mob);
				
		WebElement continues = driver.findElement(By.id("continue"));
		continues.click();
				
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys(pass);
		
		Thread.sleep(2000);
		WebElement loginn = driver.findElement(By.id("signInSubmit"));
		loginn.click();
	}
}


