package lotto.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
	private final List<Lotto> lottos;

	public Result(List<Lotto> lottos) {
		this.lottos = lottos;
	}

	public Map<Prize, Integer> checkResult(WinningNumbers winningLotto) {
		Map<Prize, Integer> result = new HashMap<>();
		for (Lotto lotto : lottos) {
			Prize prize = Prize.getRankByLotto(lotto, winningLotto);
			result.put(prize, result.getOrDefault(prize, 0) + 1);
		}
		return result;
	}

	public double calculateReturnRate(Map<Prize, Integer> result, int money) {
		double totalReward = 0;
		for (Prize rank : result.keySet()) {
			totalReward += rank.getReward() * result.get(rank);
		}
		return (double) Math.round(totalReward / money * 100 * 100) / 100.0;
	}
}
