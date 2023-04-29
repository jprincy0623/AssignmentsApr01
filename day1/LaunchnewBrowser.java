package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchnewBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver create=new ChromeDriver();
		   
        create.get("https://www.leafground.com/input.xhtml");
        create.manage().window().maximize();
        
        create.findElement(By.id("j_idt88:name")).sendKeys("Princy");
	}

}
