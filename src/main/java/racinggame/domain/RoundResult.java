package racinggame.domain;

import java.util.Map;
import java.util.Set;

public class RoundResult {
	private final Map<String, Integer> carState;

	public RoundResult(Map<String, Integer> carState) {
		this.carState = carState;
	}

	public Set<Map.Entry<String, Integer>> entrySet() {
		return this.carState.entrySet();
	}
}
