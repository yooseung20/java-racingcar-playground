package racinggame.domain;

public class Position {
	private static final int DEFAULT_POSITION = 0;
	private static final String PRINT_PATTERN = "-";

	private int position;

	public Position(int position) {
		validate(position);
		this.position = position;
	}

	public Position() {
		this.position = DEFAULT_POSITION;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Position)) {
			return false;
		}

		Position other = (Position)obj;
		return this.position == other.position;

	}

	public void increase() {
		this.position++;
	}

	private void validate(int position) {
		if (position < DEFAULT_POSITION) {
			throw new IllegalArgumentException("위차값은 양수만 가능하다.");
		}
	}

	public boolean isGraterThan(Position comparePosition) {
		return this.position > comparePosition.position;
	}


	public int getPosition() {
		return this.position;
	}
}
