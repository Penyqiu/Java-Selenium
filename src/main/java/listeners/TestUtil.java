package listeners;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

import configuration.Initialization;

public class TestUtil extends Initialization{

	public static long PAGE_LOAD_TIMEOUT = 10;
	public static long IMPLICIT_WAIT = 10;

	static JavascriptExecutor js;


    public static void takeScreenshotAtEndOfTest() throws IOException {
		//File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		//FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}

    
}
