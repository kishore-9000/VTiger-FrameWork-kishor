package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {
	JavaUtility jutil =new JavaUtility();
	String datetimestamp = jutil.getCalendarDetails("dd-MM-YY hh-mm-ss");
	ExtentReports reports;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname+"--On Test Start Executed");

		test =reports.createTest(methodname);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname+"--On Test Success Executed");

		test.log(Status.PASS,methodname+"successully executed");
	}


	@Override
	public void onTestFailure(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname+"--On Test Failure Executed");

		test.log(Status.FAIL,methodname+"Failed");
		test.log(Status.INFO,result.getThrowable());


		//Screen Shots
		String Screenshotname = methodname+"-"+datetimestamp;
		SeleniumUtility sutil = new SeleniumUtility();
		try {
			String path = sutil.captureScreenshot(BaseClass.sDriver,Screenshotname);
			test.addScreenCaptureFromPath(path);
		}catch(IOException e) {
			e.printStackTrace();
		}

	}



	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname+"--On Test Skipped Executed");

		test.log(Status.SKIP,methodname+"-skipped");
	}


	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}


	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}


	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start Executed");

		//configuration of extent reports
		ExtentSparkReporter reporter = new ExtentSparkReporter(".\\ExtentReports\\report-"+datetimestamp+".html");
		reporter.config().setDocumentTitle("Extent Reports");
		reporter.config().setReportName("VTiger Report");
		reporter.config().setTheme(Theme.STANDARD);

		//Generate an empty report
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Base URL","http://localhost:8888/");		
		reports.setSystemInfo("Base OS","WINDOWS");		
		reports.setSystemInfo("Base BROWSER","Chrome");		
		reports.setSystemInfo("TEST ENGINEER","kishore");		

	}


	@Override
	public void onFinish(ITestContext context) {
		System.out.println("--On finish Executed");
		reports.flush();
	}


}
