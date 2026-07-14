package base;


import org.testng.annotations.BeforeSuite;

import config.ConfigReader;
import io.restassured.RestAssured;

public class BaseTest {

    @BeforeSuite
    public void setup() {

        RestAssured.baseURI =
                ConfigReader.getProperty("base.url");
        
        System.out.println("Framework Initialized");
        System.out.println("Base URI : " + RestAssured.baseURI);

    }

}