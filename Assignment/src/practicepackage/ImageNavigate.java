package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageNavigate {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver project = new ChromeDriver();
		project.get("http://practice.automationtesting.in");
		Thread.sleep(2000);
		
		project.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img")).click();
		WebElement Addbook = project.findElement(By.xpath("//*[@id=\"product-160\"]/div[2]/form/button"));
		
		//WebElement addbook1 = project.findElement(By.xpath("")); add numbers of books.
		Addbook.click();
		Thread.sleep(2000);
		WebElement viewbasket = project.findElement(By.xpath("//*[@id=\"content\"]/div[1]/a"));
		viewbasket.click();
	}

}
