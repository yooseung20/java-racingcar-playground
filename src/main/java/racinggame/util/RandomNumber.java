package racinggame.util;

import java.util.Random;

public class RandomNumber {
	public static int createUnits() {
		Random random = new Random();
		return random.nextInt(9);
	}
}
