package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class enshu2 {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://rakuplus.jp/");
		
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.cssSelector("#user_login"));
		element.sendKeys("");
		WebElement element2 = driver.findElement(By.cssSelector("#user_pass"));
		element2.sendKeys("");
		element2.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		WebElement element3 = driver.findElement(By.partialLinkText("2022年10月入社QAエンジニア新入社員紹介"));
		element3.click();
		
		Thread.sleep(1000);
		List<WebElement> qaClassamateList = driver.findElements(By.cssSelector("section.entry-content > div"));
		int count = 0;
		for(WebElement classmate:qaClassamateList) {
			if(count > 0) {
				WebElement imgElem = classmate.findElement(By.tagName("img"));			
				WebElement namekanElem = classmate.findElement(By.cssSelector("span.big"));
				WebElement namehiraElem = classmate.findElement(By.cssSelector(".has-text-align-center.has-text-color"));
				System.out.println(namekanElem.getText() + "(" + namehiraElem.getText() + ")");
				String url = imgElem.getAttribute("src");
				System.out.println(url);
			System.out.println("-----------------------------");
			}
			count ++;
		}
	}

}
