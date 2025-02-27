package baseClassUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeSuite
	public void BS()
	{
		System.out.println("connect with the database");
	}
	
	@AfterSuite
	public void AS()
	{
		System.out.println("disconnect with the data base");
	}
	
	@BeforeTest
	public void BT()
	{
		System.out.println("parallel execution");
	}
	
	@AfterTest
	public void AT()
	{
		System.out.println("close the parallel execution");
	}
	@BeforeClass
	public void BC()
	{
		System.out.println("Open the browser");
	}
	
	@AfterClass
	public void AF()
	{
		System.out.println("close the browser");
	}
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("login");
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("logout");
	}
}
