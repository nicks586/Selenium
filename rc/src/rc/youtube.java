package rc;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class youtube 
{
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practise\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ref=new ChromeDriver();
		ref.get("https://www.youtube.com");
		ref.manage().window().maximize();
		
		WebElement search_field=ref.findElement(By.cssSelector("input[id='search']"));
		search_field.sendKeys("shaktiman");
		
		WebElement search_button=ref.findElement(By.cssSelector(";
		
		Actions ac=new Actions(ref);
		ac.keyDown(Keys.CONTROL).click(search_button).keyUp(Keys.CONTROL).perform();//keydown to press and hold , keyup to release the key
		System.out.println("before switching url is  " + ref.getCurrentUrl());
		
		String current_window=ref.getWindowHandle();
		
		Set<String> all_window=ref.getWindowHandles();
		
		System.out.println("total window" + all_window.size());
		for(String s: all_window)
		{
			ref.switchTo().window(s);
		}
		System.out.println("current url   "+ref.getCurrentUrl());
		ref.switchTo().window(current_window);
		System.out.println("again"+ref.getCurrentUrl());
		//List<WebElement> ls=ref.findElements(By.id("video-title"));
		//System.out.println(ls.size());
		
		




	}
}
