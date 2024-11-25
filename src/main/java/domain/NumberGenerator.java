package domain;

import java.util.Random;

public class NumberGenerator {
	private static final int MIN = 1;
	private static final int MAX = 8;

	public static int units() {
		Random random = new Random();
		return MIN + random.nextInt(MAX);
	}
}
