package pageObject;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PageFactory {
	
	public PageFactory(AndroidDriver driver) {
		org.openqa.selenium.support.PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	//Xpath of Preference using text
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	public WebElement preference;

	
	//Xpath of Preference Dependencies
	@AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	public WebElement preferenceDependencies;
	
	  //Xpath of wifi checkbox
	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='android:id/checkbox']")
	public WebElement wifiCheckbox;
	
	 //Xpath of Wifi Setting 
	@AndroidFindBy(xpath="//android.widget.TextView[@text='WiFi settings']")
	public WebElement wifiSetting;
	
	 //Xpath of wifi setting text box
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='android:id/edit']")
	public WebElement wifiSettingTextbox;
	
	 //xpath of OK button using ‘className’ with a button widget 
	@AndroidFindBy(xpath="//android.widget.Button[@index='1']")
	public WebElement OK;
	
	  //xpath of Views using textview widget
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Views']")
	public WebElement views;
	
	  //Xpath of expandable list
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Expandable Lists']")
	public WebElement expandableList;
	
	  //Xpath of custom adaptor
	@AndroidFindBy(xpath="//android.widget.TextView[@text='1. Custom Adapter']")
	public WebElement customAdaptor;
	
	 //xpath of people names
	@AndroidFindBy(xpath="//android.widget.TextView[@text='People Names']")
	public WebElement peopleName;
}
