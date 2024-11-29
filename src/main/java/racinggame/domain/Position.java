package racinggame.domain;

import java.util.Objects;

public class Position {
	private static final int DEFAULT_POSITION = 0;
	private int position;

	public Position() {
		this.position = DEFAULT_POSITION;
	}

	public Position(int position) {
		this.position = position;
	}

	public Position move() {
		return new Position(this.position + 1);
	}

	public int getMaxPosition(int maxPosition) {
		if (this.position > maxPosition) {
			return this.position;
		}
		return maxPosition;
	}

	public int getPosition() {
		return this.position;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null || getClass() != object.getClass())
			return false;
		Position position1 = (Position)object;
		return position == position1.position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(position);
	}


}
