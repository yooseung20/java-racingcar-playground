package racinggame.domain;

import java.util.Objects;

public class Round {
	private final static int ZERO = 0;
	private final int round;

	public Round(int round) {
		this.round = round;
	}

	public boolean isContinue() {
		return this.round > ZERO;
	}

	public Round decrease() {
		return new Round(this.round -1);
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null || getClass() != object.getClass())
			return false;
		Round round1 = (Round)object;
		return round == round1.round;
	}

	@Override
	public int hashCode() {
		return Objects.hash(round);
	}
}
