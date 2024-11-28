package racinggame.domain;

public class Car {
	private static final int MIN_ACCELERATOR = 4;
	private final CarName name;
	private Position position;

	public Car(String name) {
		this.name = new CarName(name);
		this.position = new Position();
	}

	public void move(int accelerator) {
		if (isMovable(accelerator)) {
			this.position = this.position.move();
		}
	}

	private static boolean isMovable(int accelerator) {
		return accelerator >= MIN_ACCELERATOR;
	}

	public Position getPosition() {
		return this.position;
	}
}
