package com.david.utilitario.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.david.utilitario.util.StrinUtil;
@Ignore("no quiero probar")
public class StringUtilTest {
	@BeforeClass
	public static void beforeClass(){
		System.out.println("--->beforeClass()");
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("-->afterClass()");
	}
	
	@Before
	public  void before(){
		//System.out.println("before each test");
	}
	
	@After
	public  void after(){
	//	System.out.println("after each test");
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	@Test
	@Ignore 
	public void capitalizeTest(){
		System.out.println("capitalizeTest()");
		assertEquals(StrinUtil.capitalize("java"),"Java");
		assertTrue(StrinUtil.capitalize("h0LA").equals("H0la"));
		assertEquals(StrinUtil.capitalize(" ")," ");
		
		
		assertNull(StrinUtil.capitalize(null));
		
	
	}
	@Test
	public void truncate(){
		System.out.println("truncate()");
		assertEquals(StrinUtil.truncate("java", 1),"j");
		assertTrue(StrinUtil.truncate("java", 3).length()==3);
		assertFalse(StrinUtil.truncate("java", 3).length()==2);
		assertEquals(StrinUtil.truncate(" ", 3)," ");
		assertEquals(StrinUtil.truncate("java", 100),"java");
		assertEquals(StrinUtil.truncate("java", 0),"");
		
		assertNull(StrinUtil.truncate(null,12));
		
		
	}
	@Test
	
public void timesTest(){
		System.out.println("timesTest");
		assertEquals(StrinUtil.times("*", 3),"***");
		assertEquals(StrinUtil.times("", 3),"");
		assertNull(StrinUtil.times(null, 2));
		
		
	}
	@Test
	public void stringReplaceTest(){
		thrown.expect(NullPointerException.class);
		"hola".replace("hola", null);
		
	}
	@Test
	public void assertSameAndEquals(){
		String cadena1="java";
		String cadena2="java";
		String cadena3=new String("java");
		assertSame(cadena1,cadena2);//cadena1==cadena2
		assertEquals(cadena1,cadena2);//cadena1.equals(cadena2)
		//assertSame(cadena2,cadena3);//cadena2==cadena3//fail!!!
		assertEquals(cadena2,cadena3);//cadena2.equals(cadena3)
		
	}
	

}
