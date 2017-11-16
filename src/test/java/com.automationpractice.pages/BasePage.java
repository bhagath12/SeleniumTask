package com.automationpractice.pages;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.automationpractice.common.CommonFunctions;





public class BasePage {
	
	public static WebDriver driver;
	public static Properties OR=null;
	public static Properties CONFIG = null;
	public static FileInputStream ip=null;
	//public static HeaderMenu menu = null;
	public static CommonFunctions commonFunctions = null;

	
	public BasePage(){
		if(OR==null){
			try{
				OR=new Properties();
				ip=new FileInputStream(System.getProperty("user.dir")+"/src/test/java/com/automationpractice/config/OR.properties");
				OR.load(ip);
				CONFIG = new Properties();
				ip = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/com/automationpractice/config/CONFIG.properties");
				CONFIG.load(ip);
				
			}catch(Throwable t)
			{
				System.err.println("Error in loading files");
			}
			}
		}
	
	public void InitializeDriver(String browser){
		if(CONFIG.getProperty(browser).equalsIgnoreCase("Mozilla")){
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/geckodriver");
		driver=new FirefoxDriver();
		}else if(CONFIG.getProperty(browser).equalsIgnoreCase("ie")){
			driver=new InternetExplorerDriver();
		}else if(CONFIG.getProperty(browser).equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
			driver=new ChromeDriver();
		}
	//	menu = new HeaderMenu();
		commonFunctions = new CommonFunctions();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void navigate(String url){
		driver.get(CONFIG.getProperty(url));
		
	}
	
	public void click(String prop){
		driver.findElement(By.xpath(OR.getProperty(prop))).click();
	}
	
	public  void closeDriver(){
		driver.quit();
		}
	
	
	

}
