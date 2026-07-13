package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class RetryTestDemo extends BaseTest{
	
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)
	public void retryDemo() {
		System.out.println("Executing Test");
		Assert.fail("Intentional failure");
	}

		
	}


