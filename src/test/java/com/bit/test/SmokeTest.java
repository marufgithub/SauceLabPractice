package com.bit.test;

import java.sql.Driver;

import org.junit.Test;

public class SmokeTest extends BaseTest
{
	@Test
	public void test()
	{
		driver.get("http://www.bluefly.com");
	}

}
