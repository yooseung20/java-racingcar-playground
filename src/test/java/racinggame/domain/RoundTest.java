package racinggame.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RoundTest {

	@Test
	void 남아있는_경기가_있다() {
		Round round = new Round(1);
		assertThat(round.isContinue()).isTrue();
	}

	@Test
	void 남아있는_경기가_없다() {
		Round round = new Round(0);
		assertThat(round.isContinue()).isFalse();
	}

	@Test
	void 라운드감소() {
		Round round = new Round(1);
		Round decreasedRound =  round.decrease();
		assertThat(decreasedRound).isEqualTo(new Round(0));
	}

}