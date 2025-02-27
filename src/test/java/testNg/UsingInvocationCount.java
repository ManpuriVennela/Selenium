package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingInvocationCount {
	@Test (priority=3)
	public void orange()
	{
		Reporter.log("Test Started orange",true);
	}
	
	@Test (priority=1,invocationCount=4)
	public void guava()
	{
		Reporter.log("Test Started guava",true);
	}
	@Test (priority=2)
	public void apple() {
		Reporter.log("Test Started apple",true);
	}
	}


