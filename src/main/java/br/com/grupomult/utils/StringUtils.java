package br.com.grupomult.utils;

public class StringUtils {
	
	private StringUtils() {
		
	}
	public static boolean isEmpty(String value) {
		return (value == null || value.isEmpty());
	}
	
	public static boolean isBlank(String value) {
		return (value == null || "".equals(value.trim()));
	}

}
