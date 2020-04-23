package assignment2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import pageObject.PageFactory;


public class Assignment2Test {
	//WebDriver driver;
	AndroidDriver driver;
	Dimension size;
	private String TextClock="TextClock";
	private String expandableList="Expandable Lists";

	
  @Test
  public void Tests() throws InterruptedException {
	  
	  PageFactory pf=new PageFactory(driver);
	  

	  //Click on prefernece
	  pf.preference.click();
	  
	  
	  //Click preference dependencies
	  pf.preferenceDependencies.click();
	  
	  //Click wifi checkbox
	  pf.wifiCheckbox.click();
	  Thread.sleep(1000);
	  
	  //Click wifi setting
	  pf.wifiSetting.click();

	  //Enter text 'Hello' in the text box
	  pf.wifiSettingTextbox.sendKeys("Hello");
	  
	  //click OK button in wifi setting
	  pf.OK.click();
	  
	  //Twice back to navigate to starting screen of the app.
	  driver.navigate().back();
	  driver.navigate().back();	  
	  
	  //Click views
	  pf.views.click();
	  	 
	  //Scroll to TextClock and click
	  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+TextClock+"\").instance(0))").click();
		  
	  //Back 
	  driver.navigate().back();	
	  
	  //Scroll to top to Expandable list
	  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+expandableList+"\").instance(0))");

	  //Click expandable list
	  pf.expandableList.click();
	  
	  //Click custom adaptor
	  pf.customAdaptor.click();

	  //Long press on people name
	  TouchAction action = new TouchAction(driver);
	  action.longPress(pf.peopleName).release().perform();
	
	  
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	// Created object of DesiredCapabilities class.
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  
	  // Set android deviceName desired capability.(Device name may be vary)
	  capabilities.setCapability("deviceName", "52032cd54dcdc339");
	  
	  // Set BROWSER_NAME desired capability. It's Android in our case here.
	  capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
	  
	  // Set android VERSION desired capability. Android version may vary
	  capabilities.setCapability(CapabilityType.VERSION, "8.1.0");
	  
	  // Set android platformName desired capability. It's Android in our case here.
	  capabilities.setCapability("platformName", "Android");
	  
	  // Set android appPackage desired capability
	  capabilities.setCapability("appPackage", "io.appium.android.apis");
	  
	  // Set android appActivity desired capability.
	  capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	  
	  // Created object of RemoteWebDriver will all set capabilities.
	  //driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	    }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
