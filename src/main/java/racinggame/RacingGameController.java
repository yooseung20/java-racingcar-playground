package racinggame;

import java.util.Scanner;

import racinggame.domain.RacingGame;
import racinggame.strategy.MovableStrategy;
import racinggame.strategy.RandomStrategyImpl;
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
		MovableStrategy randomStrategy = new RandomStrategyImpl();

		ResultView.printRoundStart();

		while(race.hasRound()) {
			race.round();
			ResultView.printRoundResult(race.getCarState());
		}

		ResultView.printWinner(race.findWinners());

	}



}
