import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

public class SeleniumBasics {  

    public static void main(String[] args) {  

	//Connecting to Chrome Driver 
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\ChromeDriver\\chromedriver.exe");  
	WebDriver driver=new ChromeDriver();  

        driver.navigate().to("http://www.google.com/");  

	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	driver.close();
	driver.quit();

}

}


