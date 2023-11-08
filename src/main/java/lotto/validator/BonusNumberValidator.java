package lotto.validator;

import lotto.model.ErrorMessage;

public class BonusNumberValidator implements Validator<String> {

	@Override
	public void validate(String input) {
		validateNaturalNumber(input);
		validateInRange(input);
	}

	private void validateNaturalNumber(String input) {
		try {
			int number = Integer.parseInt(input);
			if (number <= 0) {
				throw new IllegalArgumentException(ErrorMessage.IS_NOT_NATURAL_NUMBER.getMessage());
			}
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(ErrorMessage.IS_NOT_A_VALID_FORMAT.getMessage());
		}
	}

	private void validateInRange(String input) {
		int number = Integer.parseInt(input);
		if (number < 1 || number > 45) {
			throw new IllegalArgumentException(ErrorMessage.IS_NOT_IN_RANGE.getMessage());
		}
	}

}
