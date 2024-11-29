package racinggame;

import java.util.Scanner;

public class InputView {
	private static final String CARS_REQUEST = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
	private static final String ROUND_REQUEST = "시도할 회수는 몇회인가요?";
	public static String getCars(Scanner scanner) {
		System.out.println(CARS_REQUEST);
		String cars = scanner.nextLine();

		return cars;
	}

	public static int getRound(Scanner scanner) {
		System.out.println(ROUND_REQUEST);

		int round = scanner.nextInt();

		return round;
	}

}
