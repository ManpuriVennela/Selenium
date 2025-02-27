package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ByUsingPriorityFlag {

	
	@Test (priority=3)
	public void orange()
	{
		Reporter.log("Test Started orange",true);
	}
	
	@Test (priority=1)
	public void guava()
	{
		Reporter.log("Test Started guava",true);
	}
	@Test (priority=2)
	public void apple() {
		Reporter.log("Test Started apple",true);
	}
	}

