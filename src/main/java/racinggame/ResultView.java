package racinggame;

import java.util.List;
import java.util.Map;

import racinggame.domain.RoundResult;

public class ResultView {

	private static final String CAR_DELIMITER = " : ";
	private static final String POSITION_PATTERN = "-";
	private static final String WINNER_DELIMITER = ",";
	private static final String ROUND_START = "실행 결과";
	private static final String ROUND_END = "가 최종 우승했습니다.";

	public static void printRoundResult(RoundResult roundResult) {

		for (Map.Entry<String, Integer> car : roundResult.entrySet()) {
			printCar(car.getKey(), car.getValue());
		}

		System.out.println();
	}

	private static void printCar(String name, int position) {
		StringBuilder builder = new StringBuilder(name);
		builder.append(CAR_DELIMITER);
		builder.append(toPositionString(position));
		System.out.println(builder);

	}

	private static String toPositionString(int position) {
		if (isZero(position)) {
			return "";
		}

		return POSITION_PATTERN.repeat(position);

	}

	private static boolean isZero(int position) {
		return position == 0;
	}

	public static void printWinner(List<String> winners) {
		System.out.print(String.join(WINNER_DELIMITER, winners));
		System.out.println(ROUND_END);
	}

	public static void printRoundStart() {
		System.out.println();
		System.out.println(ROUND_START);
	}
}
