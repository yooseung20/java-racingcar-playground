package racinggame.utils;


public class NameDelimiter {

	private static final String DELIMITER = ",";

	public static String[] split(String names) {
		return names.split(DELIMITER);
	}
}
