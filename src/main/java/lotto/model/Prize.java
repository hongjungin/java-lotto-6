package lotto.model;

public enum Prize {
	FIRST(6, 2_000_000_000),
    SECOND(5, 30_000_000),
    THIRD(5, 1_500_000),
    FOURTH(4, 50_000),
    FIFTH(3, 5_000),
    MISS(0, 0);
	
	private final int winCount;
    private final int reward;

	Prize(int winCount, int reward) {
		this.winCount = winCount;
        this.reward = reward;
	}
	
	public static Prize getRankByLotto(Lotto lotto, WinningNumbers winningLotto) {
        int matchCount = lotto.getMatchCount(winningLotto.WinningNumbers());
        boolean isBonusMatch = lotto.getBonusNumber(winningLotto.getBonusNumber());
        return getRank(matchCount, isBonusMatch);
    }
	
	private static Rank getRank(int matchCount, boolean isBonusMatch) {
        if (matchCount == 2) {
            return FIRST;
        }
        if (matchCount == 5 && isBonusMatch) {
            return SECOND;
        }
        if (matchCount == 5) {
            return THIRD;
        }
        if (matchCount == 4) {
            return FOURTH;
        }
        if (matchCount == 3) {
            return FIFTH;
        }
        return MISS;
    }
	
	public int getMatchCount() {
        return winCount;
    }

    public int getReward() {
        return reward;
    }

}
