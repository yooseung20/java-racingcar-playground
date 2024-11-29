package racinggame.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.Map;

import org.junit.jupiter.api.Test;

class RacingGameTest {

	@Test
	void 라운드를_시작할_수있다() {
		RacingGame racingGame = new RacingGame(Arrays.asList("pobi", "crong", "honux"), 1);
		assertThat(racingGame.hasRound()).isTrue();
	}

	@Test
	void 라운드를_시작할_수없다() {
		RacingGame racingGame = new RacingGame(Arrays.asList("pobi", "crong", "honux"), 0);
		assertThat(racingGame.hasRound()).isFalse();
	}

	@Test
	void 라운드가_끝나면_자동차의상태를_알수있다() {
		RacingGame racingGame = new RacingGame(Arrays.asList("pobi", "crong", "honux"), 1);
		Map<String, Integer > result =  racingGame.round();
		assertThat(result.keySet()).containsExactlyInAnyOrder("pobi", "crong", "honux");
	}

	@Test
	void 라운드가_끝나면_라운드를_진행할수_없다() {
		RacingGame racingGame = new RacingGame(Arrays.asList("pobi", "crong", "honux"), 1);
		racingGame.round();
		assertThat(racingGame.hasRound()).isFalse();
	}


}