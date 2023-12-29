package org.eva.vtigercrm5.pages.common;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FlipkartTask {
	
	private static WebDriver driver;
	private static Actions act;
	private static JavascriptExecutor js;
	 
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		  driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  act = new Actions(driver);
		act.sendKeys(Keys.ESCAPE).perform();
		WebElement webSearch = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		webSearch.sendKeys("Tv", Keys.ENTER);
		WebElement webTvList = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]"));
for (int i = 3; i <=9; i++) {
	webTvList = driver.findElement(By.xpath("(//div[@class='_4rR01T'])["+i+"]"));
	System.out.println((i-2)+">> productName - "+webTvList.getText());
	webTvList.click();
	windowHandles("LG 80 cm (32 inch) HD Ready LED Smart WebOS TV Online at best Prices In India");
	placeOrder();
	windowHandles("Tv- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
	System.out.println((i-2)+"- time mobile send successfull");
 }
 	}
	
	public static void windowHandles(String title) {
		Set<String> setWindowHandles = driver.getWindowHandles();
		for (String handleValue : setWindowHandles) {
			driver.switchTo().window(handleValue);
			String actPageTitle = driver.getTitle();
			if (actPageTitle.equalsIgnoreCase(title)) {
				break;
			}
		}
	}
	 
	public static void placeOrder() throws InterruptedException {
		WebElement webAddCart=driver.findElement(By.xpath("//button[text()='Add to cart']"));
		webAddCart.click();
		Thread.sleep(2000);
		WebElement lastPage = driver.findElement(By.xpath("//a[text()='Help Center']"));
		act.scrollToElement(lastPage).build().perform();
		WebElement plusButton = driver.findElement(By.xpath("//button[text()='+']"));
		Thread.sleep(3000);
		clikeJavaScript(plusButton);
		Thread.sleep(3000);
		WebElement webPlaceOrder=driver.findElement(By.xpath("//span[text()='Place Order']"));
		clikeJavaScript(webPlaceOrder);
		WebElement webMob=driver.findElement(By.xpath("//input[@type='text']"));
		webMob.sendKeys("8081157129");
	}
	
	public static void clikeJavaScript(WebElement webObj) {
		  js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", webObj);
	}	
 
}
