package genericUtility;

	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Set;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class SeleniumUtility {
		
		public void accessApplication(WebDriver d, String url) {
			d.get(url);
		}
		
		public void maximizeWindow(WebDriver d) {
			d.manage().window().maximize();
		}
		
		public void implicitWait(WebDriver d,int maxTime) {
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
		}
		
		public void quitBrowser(WebDriver d) {
	        d.quit();
	    }

	    
		
	    /////////////Dropdown////////////////

		public void selectOptionByValue(WebElement dropDownElement, String value) {
			Select sel = new Select(dropDownElement);
			sel.selectByValue(value);
		}
		
		
		public void selectOptionByIndex(WebElement dropDownElement, int index) {
			Select sel = new Select(dropDownElement);
			sel.selectByIndex(index);
		}
		
		 public void selectOptionByVisibleText(WebElement ele, String text) {
		        Select sel = new Select(ele);
		        sel.selectByVisibleText(text);
		 }
		 
		 /////////Actions////////////
		public void mouseHovering(WebDriver d,WebElement ele) {
			new Actions(d).moveToElement(ele).perform();
		}
		
		public void rightClick(WebDriver d,WebElement ele) {
			new Actions(d).contextClick().perform();
		}
		
		public void scrollWebpage(WebDriver d,WebElement ele) {
			new Actions(d).scrollToElement(ele).perform();
		}
		
		////////////////Alerts/////////////
		
		 public void acceptAlert(WebDriver d) {
		        d.switchTo().alert().accept();
		    }
		 
		public void cancelAlert(WebDriver d) {
			d.switchTo().alert().dismiss();
		}
		
		//////////////Frames//////////////

		public void switchToFrameUsingIndex(WebDriver d, int index) {
	        d.switchTo().frame(index);
	    }

	    public void switchToFrameusingNameOrID(WebDriver d, String nameOrId) {
	        d.switchTo().frame(nameOrId);
	    }


	    ///////FileUpload////////////
	    
	    public void uploadFile(WebElement ele,String filePath) {
	    	ele.sendKeys(filePath);
	    }
	    
	    /////////////Window Handles////////
	    public void switchToWindowFor2Tabs(WebDriver d) {
	    	String pid = d.getWindowHandle();
	    	Set<String> allIds = d.getWindowHandles();
	    	for(String id:allIds) {
	    		if(!id.equals(pid)) {
	    			d.switchTo().window(id);
	    		}
	    	}
	    }
	    

	    public void switchToWindowForMultipleTabs(WebDriver d, String partialTitle) {

	        Set<String> allWindows = d.getWindowHandles();

	        for (String window : allWindows) {
	            d.switchTo().window(window);

	            if (d.getTitle().contains(partialTitle)) {
	                break;
	            }
	        }
	    }
	    
		/////////////Screenshot////////////
		
	    public String captureScreenshot(WebDriver d, String screenshotName)
	            throws IOException {

	        TakesScreenshot ts = (TakesScreenshot)d;
	        File src = ts.getScreenshotAs(OutputType.FILE);
	        File dest = new File(".\\Screenshots" + screenshotName + ".png");
	        FileUtils.copyFile(src, dest);
	        return dest.getAbsolutePath();//for listeners
	    }

		public void closeBrowser(WebDriver driver) {
			driver.quit();
			
		}
	}
	
	    
	        

	

