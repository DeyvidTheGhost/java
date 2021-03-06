package com.david.utilitario.borrar;

import static org.junit.Assert.*;
import org.junit.Test;

import com.david.utilitario.util.StrinUtil;

public class StringUtilBorrar {
	@Test
	public void capitalizeTest() {

		assertEquals(StrinUtil.capitalize("unac"), "Unac");
		assertNull(StrinUtil.capitalize(null));
		assertEquals(StrinUtil.capitalize(""), "");

	}

	@Test
	public void swapCase() {
		assertTrue(StrinUtil.swapCase("java").equals("JAVA"));
		assertTrue(StrinUtil.swapCase("jAva").equals("JaVA"));
		assertNull(StrinUtil.swapCase(null));
		assertEquals(StrinUtil.swapCase(""), "");
	}

	@Test
	public void reverse() {
		assertTrue(StrinUtil.reverse("java").equals("avaj"));
		assertNull(StrinUtil.reverse(null));
		assertEquals(StrinUtil.reverse(""), "");
	}

	@Test
	public void times() {
		assertTrue(StrinUtil.times("hoy", 2).equals("hoyhoy"));
		assertNull(StrinUtil.times(null, 2), null);
		assertEquals(StrinUtil.times("", 2), "");

	}

	@Test
	public void truncate() {
		assertTrue(StrinUtil.truncate("unac", 3).equals("una"));
		assertNull(StrinUtil.truncate(null, 2), null);
		assertEquals(StrinUtil.truncate("", 4), "");

	}

	// **probar cada metodo
	//
}
