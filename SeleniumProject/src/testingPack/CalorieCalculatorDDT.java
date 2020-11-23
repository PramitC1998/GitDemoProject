package testingPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalorieCalculatorDDT {
   @Test(dataProvider = "getLogindata")
   public void Login(String username, String password) {
	   System.out.println("Enter username= "+username);
	   System.out.println("Enter password= "+password);
	   System.out.println("Click on submit button");   
   }
   @DataProvider
   public Object[][] getLogindata(){
	   String[][] data = new String[2][2];
	   data[0][0] = "user1";
	   data[0][1] = "pass1";
	   data[1][0] = "user2";
	   data[1][1] = "pass2";
	   return data;
   }

}
