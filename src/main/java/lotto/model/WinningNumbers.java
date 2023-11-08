package lotto.model;

import java.util.List;

import lotto.validator.BonusNumberValidator;

public class WinningNumbers {

	private final Lotto winningNumber;
	private final Integer bonusNumber;

	public WinningNumbers(List<Integer> winningNumber, Integer bonusNumber) {
		this.winningNumber = new Lotto(winningNumber);
		BonusNumberValidator.validate(bonusNumber);
		this.bonusNumber = bonusNumber;
	}
}
