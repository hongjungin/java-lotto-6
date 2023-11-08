package lotto.validator;

import lotto.model.ErrorMessage;

public class BonusNumberValidator {

	private static final int MIN_LOTTO_NUMBER = 1;
	private static final int MAX_LOTTO_NUMBER = 45;

	public static void validate(Integer number) {
		validateInRange(number);
	}

	private static void validateInRange(Integer number) {
		if (isInRange(number)) {
			throw new IllegalArgumentException();
		}
	}

	public static boolean isInRange(int number) {
		return number >= MIN_LOTTO_NUMBER && number <= MAX_LOTTO_NUMBER;
	}
}
