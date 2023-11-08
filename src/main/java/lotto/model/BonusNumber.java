package lotto.model;

public class BonusNumber {

	private static final int MIN_LOTTO_NUMBER = 1;
	private static final int MAX_LOTTO_NUMBER = 45;

	private int number;

	public BonusNumber(int number) {
		validateInRange(number);
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
	
	private void validateInRange(Integer number) {
        if (number < MIN_LOTTO_NUMBER || number > MAX_LOTTO_NUMBER) {
            throw new IllegalArgumentException();
        }
    }
}
