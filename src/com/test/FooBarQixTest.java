package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.dev.foobarqix.FooBarQix;
import com.dev.foobarqix.FooBarQix2;

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
		//assertEquals("FooFoo*Foo", fooBarQix.compute("303"));

		//assertEquals("FooFoo*Foo", FooBarQix2.compute("303"));
		assertEquals("1*1", FooBarQix2.compute("101"));
		assertEquals("FooFoo*Foo", FooBarQix2.compute("303"));
		assertEquals("FooBarQix*Bar", FooBarQix2.compute("105"));
		assertEquals("FooQix**", FooBarQix2.compute("10101"));
 
	
	}
	
	
}
