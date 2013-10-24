package com.sun.maven.hello;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloMavenTest {

	public HelloMavenTest() {
		
	}
	HelloMaven hm;
	@Before
	public void setUp(){
		hm=new HelloMaven();
		System.out.println("start");
	}
	@Test
	public void testSayHello(){
		Assert.assertEquals(hm.sayHello("maven"), "hello maven");
	}
	@After
	public void tearDown(){
		hm=null;
		System.out.println("end");
	}

}
