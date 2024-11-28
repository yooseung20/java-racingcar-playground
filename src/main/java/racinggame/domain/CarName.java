package racinggame.domain;


public class CarName {
	private static final int MAX_LENGTH = 5;
	private final String name;

	public CarName(String name) {
		this.name = name;
		validate();
	}

	private void validate() {
		if (this.name.length() > MAX_LENGTH) {
			throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없다.");
		}
	}
}
