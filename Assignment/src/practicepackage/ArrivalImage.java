package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrivalImage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver project = new ChromeDriver();
		project.get("http://practice.automationtesting.in");
		
		Thread.sleep(2000);
		//shop Button worked.//
		//project.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
		//Home page Button worked
		project.findElement(By.xpath("//*[@id=\"site-logo\"]/a")).click();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) project;//scrolling up & down(homePage having a slide)//
		jse.executeScript("window.scrollBy(0,1200)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-600)");
		
	}

}
