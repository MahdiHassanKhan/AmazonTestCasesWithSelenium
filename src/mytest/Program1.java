package mytest;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program1 {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Java\\AmazonTestProject\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test
	public void verifyTitle()
	{
		String at = driver.getTitle();
		String et = "Google";
		
	}
	
	@Test
	public void verifyLogo()
	{
		boolean flag = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
	}
	
	@Test
	public void convertToEnglish()
	{
		driver.findElement(By.linkText("English")).click();
	}
	
	@Test
	public void typeAmazon() throws InterruptedException
	{
		driver.findElement(By.id("APjFqb")).sendKeys("amazon");
		Thread.sleep(2000);
		driver.findElement(By.className("gNO89b")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void clickAmazonTitle() throws InterruptedException
	{
		driver.findElement(By.id("APjFqb")).sendKeys("amazon");
		Thread.sleep(2000);
		driver.findElement(By.className("gNO89b")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("LC20lb")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void searchOnAmazon() throws InterruptedException
	{
		driver.findElement(By.id("APjFqb")).sendKeys("amazon");
		Thread.sleep(2000);
		driver.findElement(By.className("gNO89b")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("LC20lb")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi note 11");
		Thread.sleep(2000);
	}

	@Test
	public void clickAmazonSearch() throws InterruptedException
	{
		driver.findElement(By.id("APjFqb")).sendKeys("amazon");
		Thread.sleep(2000);
		driver.findElement(By.className("gNO89b")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("LC20lb")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi note 11");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	
	@Test
	public void clickItem() throws InterruptedException
	{
		driver.findElement(By.id("APjFqb")).sendKeys("amazon");
		Thread.sleep(2000);
		driver.findElement(By.className("gNO89b")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("LC20lb")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi note 11");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".a-size-medium")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void addToCart() throws InterruptedException
	{
		driver.findElement(By.id("APjFqb")).sendKeys("amazon");
		Thread.sleep(2000);
		driver.findElement(By.className("gNO89b")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("LC20lb")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi note 11");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".a-size-medium")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("proceedToRetailCheckout")).click();
	}
	
	@Test
	public void navigate() throws InterruptedException
	{
		driver.findElement(By.id("APjFqb")).sendKeys("amazon");
		Thread.sleep(2000);
		driver.findElement(By.className("gNO89b")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("LC20lb")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi note 11");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".a-size-medium")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("proceedToRetailCheckout")).click();
		driver.navigate().to("https://www.gmail.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit(); 
	}
	
}
