package lotto.model;

public enum LottoNumber {
	MIN_LOTTO_NUMBER(1), MAX_LOTTO_NUMBER(45), LOTTO_NUMBERS_COUNT(6);

	private final int value;

	LottoNumber(int value) {
		this.value = value;
	}

	public int value() {
		return this.value;
	}
}
