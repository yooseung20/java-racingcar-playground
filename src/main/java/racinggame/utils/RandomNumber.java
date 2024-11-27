package racinggame.utils;

import java.util.Random;

public class RandomNumber {
	private static final int MAX = 9;

	public static int createUnits() {
		Random random = new Random();
		return random.nextInt(MAX);
	}
}
