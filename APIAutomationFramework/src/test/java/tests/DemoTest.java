package tests;

import org.testng.annotations.Test;
import config.ConfigReader;

public class DemoTest {

    @Test
    public void verifyConfigReader() {

        System.out.println(ConfigReader.getProperty("base.url"));
        System.out.println(ConfigReader.getProperty("username"));
        System.out.println(ConfigReader.getProperty("password"));

    }
}