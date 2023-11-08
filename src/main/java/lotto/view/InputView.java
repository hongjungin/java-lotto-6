package lotto.view;

import java.util.Arrays;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import lotto.validator.Validator;

public class InputView {
	private static final String INPUT_MONEY_AMOUNT = "구입금액을 입력해 주세요.";
	private static final String INPUT_WINNING_NUMBER = "당첨 번호를 입력해 주세요.";
	private static final String INPUT_BONUS_NUMBER = "보너스 번호를 입력해 주세요.";

	private final Validator<String> InputValidator;
	private final Validator<String> BonusNumberValidator;

	public InputView(Validator<String> InputValidator, Validator<String> BonusNumberValidator) {
		this.InputValidator = InputValidator;
		this.BonusNumberValidator = BonusNumberValidator;
	}

	public int inputMoneyAmount() {
		System.out.println(INPUT_MONEY_AMOUNT);
		String money = Console.readLine();
		InputValidator.validate(money);
		return Integer.parseInt(money);
	}

	public List<Integer> inputWinningNumber() {
		System.out.println(INPUT_WINNING_NUMBER);
		String numbers = Console.readLine();
		return toIntegerList(numbers);
	}

	public int inputBonusNumber() {
		System.out.println(INPUT_BONUS_NUMBER);
		String bonusNumber = Console.readLine();
		BonusNumberValidator.validate(bonusNumber);
		return Integer.parseInt(bonusNumber);
	}

	private List<Integer> toIntegerList(String numbers) {
		return Arrays.stream(numbers.split(",")).map(Integer::parseInt).toList();
	}
}
