package lotto.validator;

import lotto.model.ErrorMessage;

public class InputMoneyValidator implements Validator<String> {

	@Override
	public void validate(String input) {
		validateNaturalNumber(input);
		validateMultipleOfThousand(input);
	}

	private void validateNaturalNumber(String input) {
		try {
			int money = Integer.parseInt(input);
			if (money <= 0) {
				throw new IllegalArgumentException(ErrorMessage.IS_NOT_NATURAL_NUMBER.getMessage());
			}
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(ErrorMessage.IS_NOT_A_VALID_FORMAT.getMessage());
		}
	}

	public void validateMultipleOfThousand(String input) {
		int money = Integer.parseInt(input);
		if (money % 1000 != 0) {
			throw new IllegalArgumentException(ErrorMessage.IS_NOT_MULTIPLE_OF_THOUSAND.getMessage());
		}
	}

}
