package racinggame;

import java.util.Scanner;

import racinggame.domain.RacingGame;

public class RacingApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String cars = InputView.requestNames(scanner);
		int lapCount = InputView.requestLaps(scanner);

		RacingGame racingGame = new RacingGame(cars, lapCount);
		racingGame.race();

	}
}
