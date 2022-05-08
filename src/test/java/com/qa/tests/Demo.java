package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void sum() {
		System.out.println("added new features from rachana");
		System.out.println("Sum method");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
		
	}
	@Test
	public void sub() {
		System.out.println("Sub method");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a-b);
		
	}
	@Test
	public void mul() {
		System.out.println("Mul method");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a*b);
		
	}
	@Test
	public void div() {
		System.out.println("Div method");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a/b);
		
	}
}
