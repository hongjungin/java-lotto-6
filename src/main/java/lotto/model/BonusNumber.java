package lotto.model;

public class BonusNumber {

	private static final int MIN_LOTTO_NUMBER = 1;
	private static final int MAX_LOTTO_NUMBER = 45;

	private int number;

	public BonusNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}
