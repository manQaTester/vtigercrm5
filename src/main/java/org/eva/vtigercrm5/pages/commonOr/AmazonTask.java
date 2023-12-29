package org.eva.vtigercrm5.pages.commonOr;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonTask {
	private static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 14 2");
		List<WebElement> searchList = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		for (WebElement webElement : searchList) {
			String textSugg=webElement.getText().trim();
			if(textSugg.equalsIgnoreCase("iphone 14 256gb")) {
				webElement.click();
				break;
			}
			
		}
		 
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		List<WebElement> iphoneList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		ArrayList<Integer> listMobile = new ArrayList<>();
		for (WebElement iphone : iphoneList) {
			String mobText = iphone.getText().trim().replace(",", "");
			int priceMob = Integer.parseInt(mobText);
			System.out.println(priceMob);
			listMobile.add(priceMob);
		}
		Collections.sort(listMobile);    //// A to Z Order 
		double lowestPrice = listMobile.get(0);  // first Lowest Element 
		System.out.println(lowestPrice + " This is Lower Price");

		for (int i = 0; i < iphoneList.size(); i++) {
			WebElement webObj = iphoneList.get(i);
			String mobText = webObj.getText().trim().replace(",", "");
			int priceMob = Integer.parseInt(mobText);
			if (lowestPrice == priceMob) {
				WebElement iphoneWebObj=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[" + (i + 1) + "]"));
				iphoneWebObj.click();
				System.out.println("the lowest price of all the item is "+lowestPrice+" so Its itemName is clicked successfully");
			}
		}

	}
}
