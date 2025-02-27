package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_DataProviders {

	
	@DataProvider 
	public Object[][] data()
	{
		Object[][] obj=new Object[2][2];
		
		obj[0][0]="d1";
		obj[0][1]="d2";
		obj[1][0]="d3";
		obj[1][1]="d4";
		
		return obj;
	}
	@Test (dataProvider = "data")
	public void demo(String data1,String data2)
	{
		System.out.println(data1+data2);
	}
}
