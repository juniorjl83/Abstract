package com.abstracta.test;

public class StringUtil {

	public static boolean isEmpty(String value) {
		if (value == null) {
			return true;
		} else if (value.length() == 0) {
			return true;
		}
		return false;
	}
}
