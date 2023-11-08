package lotto.validator;

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
				throw new IllegalArgumentException("[ERROR] 입력된 값이 자연수가 아닙니다.");
			}
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("[ERROR] 입력된 값이 숫자가 아닙니다.");
		}
	}

	public void validateMultipleOfThousand(String input) {
		int money = Integer.parseInt(input);
		if (money % 1000 != 0) {
			throw new IllegalArgumentException("[ERROR] 로또 구입 금액은 1000 단위여야 합니다.");
		}
	}

}
