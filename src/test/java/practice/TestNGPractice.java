package practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(genericUtility.ListenersImplementation.class)
public class TestNGPractice {
	@Test(priority='k')
	public void kishorWakes() {
		System.out.println("Good Morning");
	}
	@Test(priority=2,dependsOnMethods = {"kishorRuns","kishorTravels"})
	public void kishorEats() {
		System.out.println("I love rabbit");
	}
	@Test(priority=2,invocationCount = 4)
	public void kishorRuns() {
		System.out.println(" Running upto 5km");
	}
	@Ignore
	@Test(priority=-4)
	public void kishorSleep() {
		System.out.println("Good Night");
	}
	@Test(priority=6,enabled = true)
	public void kishorTravels() {
		System.out.println("Daily towards metro");
	}
	
	

}
