package rc;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class rc //ctrl+click
{
public static void main(String[] args) {

	System.setProperty("webdriver.gecko.driver", "E:\\Selenium Practise\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	FirefoxDriver ref=new FirefoxDriver();
	ref.get("https://www.facebook.com");
	WebElement login=ref.findElement(By.id("loginbutton"));
	Actions ac=new Actions(ref);
	ac.keyDown(Keys.CONTROL).click(login).keyUp(Keys.CONTROL).perform();
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




}
	
	
	
}
