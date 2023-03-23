package org.basecls;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseCls {

	public static WebDriver driver;
	
	public static WebDriver chromeBrowser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		return driver;

	}
	 
	public static WebDriver edgeBrowser() {
		WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
		return driver;
			
	}
	public static WebDriver fireFox() {
		WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();
		return driver;

	}
	
	public static void urlLaunch(String url) {
	driver.get(url);

	}
	
	public static void maximize() {
    driver.manage().window().maximize();
    
	}
	public static void minimize() {
		driver.manage().window().maximize();

	}
	public static void implicitywait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}
	
	public static String gettitle() {
		String title = driver.getTitle();
		return title;

	}
	
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	
	public static void quit() {
		driver.quit();
	
	}
	
	public static void close() {
		driver.close();

	}
	
	public static void sendkeys(WebElement e,String data) {
		e.sendKeys(data);

	}
	
	public static void clickWebElement(WebElement e) {
		e.click();

	}
	
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
		
	}	

	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
		
	}
	
	public static String getAttributeText(WebElement e) {
		String attribute = e.getAttribute("inner text");
		return attribute;

	}
	
	public static void moveToElement(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target);

	}
	
	public static void dragAndDrop(WebElement src,WebElement des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des);

	}
	
	public static void contextClick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).perform();	
	
	}
	
	public static void doubleClick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).perform();
	
    }
	
	public static void release(WebElement e) {
		Actions a = new Actions(driver);
		a.release(e).perform();
		
	}
	public static void clickAction(WebElement e) {
		Actions a = new Actions(driver);
		a.click().perform();

	}
	public static void clickAndHold() {
		Actions a = new Actions(driver);
		a.clickAndHold().perform();

	}
	
	public static void selectByIndex(WebElement dropdown,int index) {
		Select s = new Select(dropdown);
		s.selectByIndex(index);

	}
	
	public static Alert accept() {
		Alert a = driver.switchTo().alert();
		a.accept();
		return a;

	}
	
	public static Alert dismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
		return a;

	}
	
	public static Alert alertSendKeys(String value) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(value);
		return a;

	}
	
	public static Alert alertGetText() {
		Alert a = driver.switchTo().alert();
		a.getText();
		return a;

	}
	
	public static void robotDown(int size) throws AWTException {
		Robot r = new Robot();
		for(int i=0;i< size;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
	}
	
	public static void robotEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
		
	public static void robotSelectAll() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);

	}	
		
	public static void robotCut() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
		
	}	
		
	public static void robotTab() throws AWTException {
		Robot r = new Robot();
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);		
		
	}	
		
	public static void robotCopy() throws AWTException {
		Robot r = new Robot();
        r.keyPress(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_C);
		
	}	
		
	public static void robotPaste() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		
	}	
	
	public static void selectByIntex(WebElement e,int a) {
		Select s = new Select(e);
		s.selectByIndex(a);
		
	}
	
	public static void selectByValue(WebElement e,String b) {
		Select s = new Select(e);
		s.selectByValue(b);
		
	}
	
	public static void selectByVisibleText(WebElement e,String c) {
		Select s = new Select(e);
		s.selectByVisibleText(c);

	}
		
	public static List<WebElement> getoptions(WebElement e) {
		Select s = new Select(e);
		List<WebElement> options = s.getOptions();
		return options;
		
	}	
		
	public static boolean isMultiple(WebElement e) {
		Select s = new Select(e);
		boolean multiple = s.isMultiple();
		return multiple;
	
	}	
		
	public static List<WebElement> getAllSelectedOptin(WebElement e) {
		Select s = new Select(e);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
		
	}	
		
	public static WebElement getFirstSelectedOption(WebElement e) {
		Select s = new Select(e);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;	

	}	
	
	public static void deselectedByIndex(WebElement e,int a) {
		Select s = new Select(e);
		s.deselectByIndex(a);

	}
		
	public static void deselectByValue(WebElement e,String b) {
		Select s = new Select(e);
		s.deselectByValue(b);

	}	
	
	public static void deselectByVisibleText(WebElement e,String c) {
		Select s = new Select(e);
		s.deselectByVisibleText(c);

	}
	
	public static void deselectAll(WebElement e) {
		Select s = new Select(e);
		s.deselectAll();
		
	}
	
	public static File takesScreenShot(WebElement e,String value) throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\User\\eclipse-workspace\\TstNgProject\\Screenshot");
		FileUtils.copyFile(screenshotAs, f);
		return f;
		
	}
	
	public static File takesScreenShot(String Value) throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\User\\eclipse-workspace\\TstNgProject\\Screenshot");
		FileUtils.copyFile(screenshotAs, f);
		return f;

	}
	
	public static void frameIndex(int a) {
		driver.switchTo().frame(a);

	}
	
	public static void frameIdName(String value) {
		driver.switchTo().frame(value);

	}
		
	private void frameWebElement() {
		driver.switchTo().frame(0)
	

	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
		
	
	
}
