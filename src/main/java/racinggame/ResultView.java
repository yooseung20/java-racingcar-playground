package racinggame;

import java.util.List;

import racinggame.domain.Car;
import racinggame.domain.CarName;
import racinggame.domain.Position;

public class ResultView {
	private static final String POSITION = "-";

	public static void printStartMessage() {
		System.out.println();
		System.out.println("실행 결과");
	}

	public static void printLapScore(CarName carName, Position position) {
		System.out.print(carName.getName() + " : ");
		System.out.println(POSITION.repeat(position.getPosition()));
	}
	public static void printLapEnd() {
		System.out.println();
	}

	public static void printWinners(List<String> carNames) {

		System.out.print(String.join(",", carNames));
		System.out.print("가 최종 우승했습니다.");
	}
}
