package testingPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 

public class testngExample2 {    
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("Executing BeforeSuite2");
    }
    
    @AfterSuite
    public void AfterSuite(){
        System.out.println("Executing AfterSuite2");
    }

 

    @BeforeTest
    public void BeforeTest(){
        System.out.println("Executing BeforeTest2");
    }
    
    @AfterTest
    public void AfterTest(){
        System.out.println("Executing AfterTest2");
    }
    
    @BeforeClass
    public void BeforeClass(){
        System.out.println("Executing BeforeClass2");
    }
    
    @AfterClass
    public void AfterClass(){
        System.out.println("Executing AfterClass2");
    }
    
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Executing BeforeMethod2");
    }
    
    @AfterMethod
    public void AfterMethod(){
        System.out.println("Executing AfterMethod2");
    }    
    
    @Test
    public void Test1(){
        System.out.println("Test1-2nd file");
        
    }
    @Test
    public void Test2(){
        System.out.println("Test2-2nd File");
        
    }
}