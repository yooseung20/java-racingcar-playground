package racinggame.domain;

import racinggame.strategy.MovableStrategy;

public class Car {
	private static final int MIN_ACCELERATOR = 4;
	private final CarName name;
	private Position position;

	public Car(String name) {
		this.name = new CarName(name);
		this.position = new Position();
	}

	public Car(String name, int position) {
		this.name = new CarName(name);
		this.position = new Position(position);
	}

	public void move(MovableStrategy movableStrategy) {
		if (movableStrategy.isMovable()) {
			this.position = this.position.move();
		}
	}

	private static boolean isMovable(int accelerator) {
		return accelerator >= MIN_ACCELERATOR;
	}

	public int getPosition() {
		return this.position.getPosition();
	}

	public String getName() {
		return this.name.getName();
	}

	public int getMaxPosition(int maxPosition) {
		return this.position.getMaxPosition(maxPosition);
	}

	public boolean isWinner(int maxPosition) {
		return this.position.equals(new Position(maxPosition));
	}
}
