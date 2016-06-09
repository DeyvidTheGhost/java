package com.david.utilitario.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.david.utilitario.util.StrinUtil;

public class StringUtilTest {
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	@Test
	public void capitalizeTest(){
		assertEquals(StrinUtil.capitalize("java"),"Java");
		assertTrue(StrinUtil.capitalize("h0LA").equals("H0la"));
		assertEquals(StrinUtil.capitalize(" ")," ");
		
		
		assertNull(StrinUtil.capitalize(null));
		
	
	}
	@Test
	public void truncate(){
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
		assertEquals(StrinUtil.times("*", 3),"***");
		assertEquals(StrinUtil.times("", 3),"");
		assertNull(StrinUtil.times(null, 2));
		
		
	}
	@Test
	public void stringReplaceTest(){
		thrown.expect(NullPointerException.class);
		"hola".replace("hola", null);
		
	}
//	@Test
	

}
