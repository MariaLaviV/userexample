package com.example.userexample.util;


import org.modelmapper.ModelMapper;

public class ServicesUtil {
	private static ModelMapper mapper = new ModelMapper();

	public static <T, S> T mapModel(S source, Class<T> type) {
		return mapper.map(source, type);
	}

	public static void enforceMandatory(String field, Object value) throws IllegalArgumentException {
		if (ServicesUtil.isEmpty(value)) {
			String message = field + " can't be empty";
			throw new IllegalArgumentException(message, null);
		}
	}

	public static void enforceMandatory(String field, String value) throws IllegalArgumentException {
		if (ServicesUtil.isEmpty(value)) {
			String message = field + " can't be empty";
			throw new IllegalArgumentException(message, null);
		}
	}

	public static void enforceMandatory(String field, Integer value) throws IllegalArgumentException {
		if (ServicesUtil.isEmpty(value)) {
			String message = field + " can't be empty";
			throw new IllegalArgumentException(message, null);
		}
	}

	public static boolean isEmpty(Object[] objs) {
		if (objs == null || objs.length == 0) {
			return true;
		}
		return false;
	}

	public static boolean isEmpty(Object o) {
		if (o == null) {
			return true;
		}
		return false;
	}

	public static boolean isEmpty(String o) {
		if (o == null || o.isEmpty()) {
			return true;
		}
		return false;
	}

}
