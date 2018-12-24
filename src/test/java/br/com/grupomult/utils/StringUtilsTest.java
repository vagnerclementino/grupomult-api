package br.com.grupomult.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class StringUtilsTest {


	private static final String STRING_NULL = null;
	private static final String STRING_VALID = "GRUPOMULT";
	private static final String STRING_EMPTY = "";
	private static final String STRING_BLANK = "          ";
	

	@Test
	public void testIsBlankWithNullStringSuccess() {
		assertTrue(StringUtils.isBlank(STRING_NULL));
	}
	
	@Test
	public void testIsBlankWithEmptyStringSuccess() {
		assertTrue(StringUtils.isBlank(STRING_EMPTY));
	}
	
	@Test
	public void testIsBlankWithBlankStringSuccess() {
		assertTrue(StringUtils.isBlank(STRING_BLANK));
	}
	
	@Test
	public void testIsEmptyWithNullStringSuccess() {
		assertTrue(StringUtils.isEmpty(STRING_NULL));
	}
	
	@Test
	public void testIsEmptyWithEmptyStringSuccess() {
		assertTrue(StringUtils.isEmpty(STRING_EMPTY));
	}
	
	@Test
	public void testIsEmptyWithBlankStringSuccess() {
		assertFalse(StringUtils.isEmpty(STRING_BLANK));
	}
	
	@Test
	public void testIsBlankWithValidStringSuccess() {
		assertFalse(StringUtils.isBlank(STRING_VALID));
	}
	
	@Test
	public void testIsEmptyWithValidStringSuccess() {
		assertFalse(StringUtils.isBlank(STRING_VALID));
	}

	

}
