package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class enshu1 {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();

		driver.get("http://www.google.com/");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf.emcav > div.RNNXgb > div > div.a4bIc > input"));
		element.sendKeys("selenium");
		element.sendKeys(Keys.ENTER);
		System.out.println(element.getTagName());
	}

}
