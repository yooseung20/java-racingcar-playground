package racinggame.util;

import java.util.List;

public class NameSplitter {

	private static final String REGEX = ",";

	public static List<String> split(String input) {
		return List.of(input.split(REGEX));
	}

}
