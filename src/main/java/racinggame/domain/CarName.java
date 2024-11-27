package racinggame.domain;

import java.util.Objects;

public class CarName {
	private static Integer MAX_LENGTH = 5;
	private String name;

	public CarName(String name) {
		this.name = name;
		validate();
	}

	private void validate() {
		validateEmpty();
		validateLength();
	}

	private void validateLength() {
		if (this.name.length() > MAX_LENGTH) {
			throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없다.");
		}
	}

	private void validateEmpty() {
		if (this.name.isEmpty()) {
			throw new IllegalArgumentException("자동차 이름은 비어있을 수 없다.");
		}
	}
	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null || getClass() != object.getClass())
			return false;
		CarName carName = (CarName)object;
		return Objects.equals(this.name, carName.name);
	}

	public String getName() {
		return this.name;
	}
}
