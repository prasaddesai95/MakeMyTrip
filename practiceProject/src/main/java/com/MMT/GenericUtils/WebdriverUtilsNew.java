package com.MMT.GenericUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtilsNew {

	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	
	public void waitForImplicit(WebDriver driver, int sec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	public void waitForPageLoad(WebDriver driver, int sec)
	{
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(sec));
	}
	
	public void waitTillElementClickable(WebDriver driver, int sec, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitTillElementVisible(WebDriver driver,int sec, WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public String getTextFromAlert(WebDriver driver)
	{
		String text=driver.switchTo().alert().getText();
		return text;
	}
	
	public void dataIntoAlert(WebDriver driver, String text)
	{
		driver.switchTo().alert().sendKeys(text);
	}
	
	public void dropDown(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	public void dropDown(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	public void dropDown(String Vtext, WebElement element)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(Vtext);
	}
	
	public void mouseHover(WebDriver driver, WebElement ele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public void dragAndDrop(WebDriver driver, WebElement src, WebElement target)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
	
	public void doubleClick(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}
	
	public void rightClick(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}
	
	public void rightClick(WebDriver driver, WebElement target)
	{
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
	}
	
	public void scrollActionInAction(WebDriver driver, WebElement ele)
	{
		Actions act = new Actions(driver);
		act.scrollToElement(ele);
	}
	
	public void enterKey(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	
	public void KeyPress() throws Throwable
	{
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	
	public void keyRelease() throws Throwable
	{
		Robot rb = new Robot();
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void scrollAction(WebDriver driver)
	{
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("window.ScrollBy(0,500)");
	}
	
	public void scrollAction(WebDriver driver, WebElement element)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0],scrollIntoView(true)", element);
	}
	
	public void switchToFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void switchToFrame(String nameOrId, WebDriver driver)
	{
		driver.switchTo().frame(nameOrId);
	}
	
	public void switchToFrame(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	public void switchToWindow(WebDriver driver, String handles)
	{
		driver.switchTo().window(handles);
	}
	
	public void switchToWindow(String exp,WebDriver driver)
	{
		Set<String> win = driver.getWindowHandles();
		for(String w:win)
		{
			String act = driver.switchTo().window(w).getTitle();
			
			if(act.equals(exp))
			{
				break;
			}
		}
	}
	
	public void getScreenShot(WebDriver driver, String screenshot) throws Throwable
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path="./screenSFolder/"+screenshot+".png";
		File dest= new File(path);
		FileUtils.copyFile(src, dest);
	}
}
