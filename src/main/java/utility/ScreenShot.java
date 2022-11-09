package utility;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class ScreenShot {
	public static void clickScreenshot(String name,WebDriver driver) throws IOException{
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File destination=new File("C:\\Users\\LENOVO\\eclipse-workspace\\java pro\\khanacademy\\Screenshot\\" +name+ ".png");
		  FileHandler.copy(Source,destination);
		 
	}

}
