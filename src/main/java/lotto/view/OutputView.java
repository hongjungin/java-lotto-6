package lotto.view;

import java.util.List;

public class OutputView {
	private static final String INPUT_MONEY_AMOUNT = "구입금액을 입력해 주세요.";
	private static final String INPUT_WINNING_NUMBER = "당첨 번호를 입력해 주세요.";
	private static final String INPUT_BONUS_NUMBER = "보너스 번호를 입력해 주세요.";
	private static final String PURCHASED_LOTTO_COUNT = "%d개를 구매했습니다.";

	public void moneyAmount() {
		System.out.println(INPUT_MONEY_AMOUNT);
	}

	public void printLottoCount(int lottoCount) {
		System.out.printf((PURCHASED_LOTTO_COUNT) + "%n", lottoCount);
	}

	public void printLottoNumbers(List<Integer> numbers) {
		System.out.print("[");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i));
			printComma(numbers, i);
		}
		System.out.println("]");
	}

	private void printComma(List<Integer> numbers, int i) {
		if (i != numbers.size() - 1) {
			System.out.print(", ");
		}

	}

	public void winningNumbers() {
		System.out.println(INPUT_WINNING_NUMBER);
	}

	public void bonusNumber() {
		System.out.println(INPUT_BONUS_NUMBER);
	}

	public void printStatic() {
		System.out.println("당첨 통계");
		System.out.println("---");
	}
}
