package domain;

public class Car {
	private static final Integer MAX_LENGTH = 5;
	private static final Integer MIN_ACCELERATION = 4;
	private final String name;
	private int position;

	public Car(String name) {
		validName(name);
		this.name = name;
		this.position = 0; // 0으로 초기화
	}

	public String getName() {
		return this.name;
	}

	private void validName(String name) {
		if (name.isEmpty()) {
			throw new IllegalArgumentException("자동차 이름을 입력해주세요.");
		}
		if (name.length() > MAX_LENGTH) {
			throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
		}
	}

	public int getPosition() {
		return this.position;
	}

	public void move(int acceleration) {
		// 4이상의 가속도가 있는 경우만 앞으로 갈 수 있다.
		if (acceleration >= MIN_ACCELERATION) {
			this.position++;
		}
	}

	public String print() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.name + " : ");
		for(int i =0; i < this.position; i++) {
			builder.append("-");
		}
		return builder.toString();
	}

	public boolean equalsPosition(int position) {
		return this.position == position;
	}
}
