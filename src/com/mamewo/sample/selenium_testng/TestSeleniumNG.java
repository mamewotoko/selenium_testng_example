package com.mamewo.sample.selenium_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;

public class TestSeleniumNG {
	private WebDriver driver_;

	@BeforeTest
	public void setUp(){
		driver_ = new FirefoxDriver();
	}
	
	@AfterTest
	public void tearDown(){
		driver_.quit();
	}

    @Test
    public void testSimple() {
		driver_.get("http://mamewo.ddo.jp/");
		File tmpFile = ((TakesScreenshot)driver_).getScreenshotAs(OutputType.FILE);
		//Files.move(tmpFile, new File("screenshot.png"), REPLACE_EXISTING);
		tmpFile.renameTo(new File("screenshot.png"));
    }
}

