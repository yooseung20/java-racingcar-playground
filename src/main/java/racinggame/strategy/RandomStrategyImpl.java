package racinggame.strategy;


import racinggame.util.RandomNumber;

public class RandomStrategyImpl implements MovableStrategy {

	private static final int MIN_ACCELERATOR = 4;

	@Override
	public boolean isMovable() {
		int random = RandomNumber.createUnits();
		return random > MIN_ACCELERATOR;
	}
}
