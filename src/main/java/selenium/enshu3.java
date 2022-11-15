package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.event.ListDataEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class enshu3 {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.e-procurement.metro.tokyo.lg.jp/index.jsp");

		Thread.sleep(1000);
		WebElement infoelem = driver.findElement(By.cssSelector("body > div.noticeofurlchange > div > button"));
		infoelem.click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#menu_1 > a > span")).click();

		Set<String> set = driver.getWindowHandles();
		// それぞれのウインドウハンドルを別々の変数に保存
		Iterator<String> it = set.iterator();
		// ウィンドウハンドル1
		String window1 = it.next();
		System.out.println(window1);
		// ウィンドウハンドル２
		String window2 = it.next();
		System.out.println(window2);
		driver.switchTo().window(window2);
		driver.findElement(By.cssSelector("#topMenuBtn03 > a")).click();

		Thread.sleep(1000);
		driver.findElement(By.cssSelector(
				"body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(2)"))
				.sendKeys("04");
		driver.findElement(By.cssSelector(
				"body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(3)"))
				.sendKeys("11");
		driver.findElement(By.cssSelector(
				"body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(4)"))
				.sendKeys("15");
		driver.findElement(By.cssSelector(
				"body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(8)"))
				.sendKeys("04");
		driver.findElement(By.cssSelector(
				"body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(9)"))
				.sendKeys("12");
		driver.findElement(By.cssSelector(
				"body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(10)"))
				.sendKeys("15");
		driver.findElement(By.cssSelector(
				"body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table:nth-child(2) > tbody > tr > td > a"))
				.click();

		Thread.sleep(1000);
		//for文
//		WebElement tableElem = driver.findElement(By.cssSelector("table.list-data"));
//		List<WebElement> trElem = tableElem.findElements(By.tagName("tr"));
//		for (WebElement listData : trElem) {
//			List<WebElement> tdElement = listData.findElements(By.tagName("td"));
//			int count = 0;
//			for (WebElement data : tdElement) {
//				if (count < 3) {
//					System.out.print(data.getText() + "\t");
//					if (count == 2) {
//						String herfUrl = data.findElement(By.tagName("a")).getAttribute("href");
//						System.out.println(herfUrl + "\t");
//					}
//				}
//				count++;
//			}
//			System.out.println("---------------------------------------------------");
		
		//forを使わない
    	WebElement tableElem = driver.findElement(By.cssSelector("table.list-data"));
		List<WebElement> trElem = tableElem.findElements(By.tagName("td"));
		List<WebElement> herf = tableElem.findElements(By.tagName("a"));
		WebElement data1 = trElem.get(0);
		WebElement data2 = trElem.get(1);
		WebElement data3 = trElem.get(2);
		WebElement herfData1 = herf.get(0);
		String hrfUrl1 = herfData1.getAttribute("herf");

 		System.out.println(data1.getText() + "\t" +  data2.getText() + "\t" + data3.getText() + "\t" + hrfUrl1);
 		System.out.println("=================");
 		
 		WebElement data4 = trElem.get(11);
		WebElement data5 = trElem.get(12);
		WebElement data6 = trElem.get(13);
		WebElement herfData2 = herf.get(1);
		String hrfUrl2 = herfData2.getAttribute("herf");
		
 		System.out.println(data4.getText() + "\t" + data5.getText() + "\t" + data6.getText() + "\t" + hrfUrl2);
 		System.out.println("=================");
 		
 		WebElement data7 = trElem.get(22);
		WebElement data8 = trElem.get(23);
		WebElement data9 = trElem.get(24);
		WebElement herfData3 = herf.get(2);
		String hrfUrl3 = herfData3.getAttribute("herf");
		
 		System.out.println(data7.getText() + "\t" + data8.getText() + "\t" + data9.getText() + "\t" + hrfUrl3);
 		System.out.println("=================");
 		
 		WebElement data10 = trElem.get(33);
		WebElement data11 = trElem.get(34);
		WebElement data12 = trElem.get(35);
		WebElement herfData4 = herf.get(3);
		String hrfUrl4 = herfData4.getAttribute("herf");
		
 		System.out.println(data10.getText() + "\t" + data11.getText() + "\t" + data12.getText()+ "\t" + hrfUrl4);
 		System.out.println("=================");
 		
 		WebElement data13 = trElem.get(44);
		WebElement data14 = trElem.get(45);
		WebElement data15 = trElem.get(46);
		WebElement herfData5 = herf.get(4);
		String hrfUrl5 = herfData5.getAttribute("herf");
		
 		System.out.println(data13.getText() + "\t" + data14.getText() + "\t" + data15.getText()+ "\t" + hrfUrl5);
 		System.out.println("=================");
 		
 		WebElement data16 = trElem.get(55);
		WebElement data17 = trElem.get(56);
		WebElement data18 = trElem.get(57);
		WebElement herfData6 = herf.get(5);
		String hrfUrl6 = herfData6.getAttribute("herf");
		
 		System.out.println(data16.getText() + "\t" + data17.getText()+ "\t"  + data18.getText()+ "\t" + hrfUrl6);
 		System.out.println("=================");
 		
 		WebElement data19 = trElem.get(66);
		WebElement data20 = trElem.get(67);
		WebElement data21 = trElem.get(68);
		WebElement herfData7 = herf.get(6);
		String hrfUrl7 = herfData7.getAttribute("herf");
		
 		System.out.println(data19.getText() + "\t" + data20.getText() + "\t" + data21.getText()+ "\t" + hrfUrl7);
 		System.out.println("=================");
 		
		}
		
	}