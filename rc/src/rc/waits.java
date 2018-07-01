package rc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class waits {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Practise\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		FirefoxDriver ref=new FirefoxDriver();
		Thread.sleep(10000); // Thread wait
		ref.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait
		ref.get("https://www.facebook.com");
		ref.manage().window().maximize();
		
	}
	
	
	

}
