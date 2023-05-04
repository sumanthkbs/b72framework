package script;

//import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Basetest;
import generic.Excel;
import page.Loginpage;

public class DemoTest extends Basetest
{
	@Test
	public void demoTest1() throws InterruptedException {
			String data = Excel.getData(XL_PATH,"sheet1",1,0);
			Reporter.log("test data:"+data,true);
			
			Loginpage g=new Loginpage(driver);
		g.setSearch(data);
			Thread.sleep(3000);

	}
}
