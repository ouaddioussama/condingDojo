package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.dev.FooBarQix;

//classe de test de FooBarQix.java
public class FooBarQixTest {

	static FooBarQix fooBarQix ;
	
	@BeforeClass
	public static void setupTest() {
		fooBarQix=new FooBarQix();
	}
	
	@Test
	public  void VerifDevideddNumberTest() {
		assertEquals("BarQix", fooBarQix.isDevidedByNumber(35));
	}
	
	@Test
	public  void containedNumberTest() {
		assertEquals("FooFooBar", fooBarQix.numberContaines("335"));
	}
	
	@Test
	public  void computeTest() {
		assertEquals("FooFoo*Foo", fooBarQix.compute("303"));
	}
	
	
}
