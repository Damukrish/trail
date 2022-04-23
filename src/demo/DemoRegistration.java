package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdrive.ie.driver","E:\\Internet Explorer\\server\\IEDriverServer.exe");
		 WebDriver driver =new InternetExplorerDriver();
		 
        driver.get("http://demo.automationtesting.in/Register.html");
        
        System.out.println(driver.getTitle());
        driver.quit();

	}

}
                                                                                   