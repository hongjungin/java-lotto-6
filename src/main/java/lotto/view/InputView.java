package lotto.view;

import java.util.Arrays;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import lotto.validator.Validator;

public class InputView {

	private final Validator<String> InputValidator;
	private final Validator<String> BonusNumberValidator;
	private final Validator<String> LottoNumbersValidator;

	public InputView(Validator<String> InputValidator, Validator<String> BonusNumberValidator,
			Validator<String> LottoNumbersValidator) {
		this.InputValidator = InputValidator;
		this.BonusNumberValidator = BonusNumberValidator;
		this.LottoNumbersValidator = LottoNumbersValidator;
	}


	public int inputMoneyAmount() {
		String money = Console.readLine();
		InputValidator.validate(money);
		return Integer.parseInt(money);
	}

	public List<Integer> inputWinningNumber() {
		String numbers = Console.readLine();
		LottoNumbersValidator.validate(numbers);
		return toIntegerList(numbers);
	}

	public int inputBonusNumber() {
		String bonusNumber = Console.readLine();
		BonusNumberValidator.validate(bonusNumber);
		return Integer.parseInt(bonusNumber);
	}

	private List<Integer> toIntegerList(String numbers) {
		return Arrays.stream(numbers.split(",")).map(Integer::parseInt).toList();
	}
}
