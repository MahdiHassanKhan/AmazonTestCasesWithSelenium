import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Java\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("English")).click();
		Thread.sleep(2000);
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
		driver.findElement(By.name("proceedToRetailCheckout")).click();
		driver.navigate().to("https://www.gmail.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.quit();
	}
}