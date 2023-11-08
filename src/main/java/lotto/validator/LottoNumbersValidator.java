package lotto.validator;

import java.util.HashSet;
import java.util.Set;

import lotto.model.ErrorMessage;

public class LottoNumbersValidator implements Validator<String> {

	private static final int MIN_LOTTO_NUMBER = 1;
	private static final int MAX_LOTTO_NUMBER = 45;
	private static final int LOTTO_NUMBERS_COUNT = 6;

	@Override
	public void validate(String input) {
		validateLottoNumbers(input);
		validateNaturalNumber(input);
		validateInRange(input);
	}

	private void validateLottoNumbers(String input) {
		String[] numbers = input.split(",");
		if (numbers.length != LOTTO_NUMBERS_COUNT) {
			throw new IllegalArgumentException(ErrorMessage.IS_NOT_SIX_NUMBERS.getMessage());
		}
		Set<Integer> numberSet = new HashSet<>();
		for (String number : numbers) {
			validateNaturalNumber(number);
			validateInRange(number);
			numberSet.add(Integer.parseInt(number));
		}
		if (numberSet.size() != LOTTO_NUMBERS_COUNT) {
			throw new IllegalArgumentException(ErrorMessage.IS_DUPLICATE_VALUE.getMessage());
		}
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
		if (number < MIN_LOTTO_NUMBER || number > MAX_LOTTO_NUMBER) {
			throw new IllegalArgumentException(ErrorMessage.IS_NOT_IN_RANGE.getMessage());
		}
	}

}
