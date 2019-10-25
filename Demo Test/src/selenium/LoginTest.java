package selenium;

import org.testng.annotations.*;

public class LoginTest {

	//make data provider link wit test
	//number of input parameters in the test
	
	
	@Test(dataProvider = "getData") 
	public void doLogin(String username, String password) {
		
		System.out.println("Executing login test"+ username + "--" + password);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][2]; //[row][column]
		//1st row
		data[0][0] = "U1";
		data[0][1] = "P1";

		//2st row
		data[1][0] = "U2";
		data[1][1] = "P2";
		
		//3st row
		data[2][0] = "U3";
		data[2][1] = "P3";
		
		return data;
		
	}
	
}
