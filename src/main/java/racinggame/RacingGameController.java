package racinggame;

import java.util.Scanner;

import racinggame.domain.RacingGame;
import racinggame.util.NameSplitter;

public class RacingGameController {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			String cars = InputView.getCars(scanner);
			int round = InputView.getRound(scanner);

			RacingGame race = new RacingGame(NameSplitter.split(cars), round);
			start(race);
		}

	}

	private static void start(RacingGame race) {
		ResultView.printRoundStart();

		while(race.hasRound()) {
			race.round();
			ResultView.printRoundResult(race.getCarState());
		}

		ResultView.printWinner(race.findWinners());

	}



}
