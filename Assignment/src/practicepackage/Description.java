package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Description {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver project = new ChromeDriver();
		project.get("http://practice.automationtesting.in");
		Thread.sleep(2000);
		project.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img")).click();
		project.findElement(By.xpath("//*[@id=\"product-160\"]/div[3]/ul/li[1]/a")).click();
		
	}

}
