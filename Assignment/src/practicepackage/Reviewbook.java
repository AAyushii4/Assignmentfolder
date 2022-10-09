package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reviewbook {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver project = new ChromeDriver();
		project.get("http://practice.automationtesting.in");
		Thread.sleep(2000);
		WebElement selectbook = project.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/img"));
		selectbook.click();
		Thread.sleep(2000);
		WebElement review = project.findElement(By.xpath("//*[@id=\"product-165\"]/div[3]/ul/li[2]/a"));
		review.click();
		Thread.sleep(2000);
		
	}

}
