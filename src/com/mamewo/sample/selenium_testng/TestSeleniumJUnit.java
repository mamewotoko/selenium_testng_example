package com.mamewo.sample.selenium_testng;

import org.junit.Test;
//import static java.nio.file.StandardCopyOption.*;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

//import java.nio.file.Files;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;

public class TestSeleniumJUnit {
	private WebDriver driver_;

	@Before
	public void setUp(){
		driver_ = new FirefoxDriver();
	}
	
	@After 
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

