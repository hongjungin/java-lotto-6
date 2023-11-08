package lotto.view;

import java.util.List;
import java.util.Map;

import lotto.model.Prize;

public class OutputView {
	private static final String INPUT_MONEY_AMOUNT = "구입금액을 입력해 주세요.";
	private static final String INPUT_WINNING_NUMBER = "당첨 번호를 입력해 주세요.";
	private static final String INPUT_BONUS_NUMBER = "보너스 번호를 입력해 주세요.";
	private static final String PURCHASED_LOTTO_COUNT = "%d개를 구매했습니다.";
	private static final String THREE_MATCH = "3개 일치 (5,000원) - %d개";
	private static final String FOUR_MATCH = "4개 일치 (50,000원) - %d개";
	private static final String FIVE_MATCH = "5개 일치 (1,500,000원) - %d개";
	private static final String FIVE_MATCH_WITH_BONUS = "5개 일치, 보너스 볼 일치 (30,000,000원) - %d개";
	private static final String SIX_MATCH = "6개 일치 (2,000,000,000원) - %d개";
	private static final String TOTAL_PROFIT = "총 수익률은 %.1f%%입니다.";

	public void moneyAmount() {
		System.out.println(INPUT_MONEY_AMOUNT);
	}

	public void printLottoCount(int lottoCount) {
		System.out.print("\n");
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
		System.out.print("\n");
		System.out.println(INPUT_WINNING_NUMBER);
	}

	public void bonusNumber() {
		System.out.print("\n");
		System.out.println(INPUT_BONUS_NUMBER);
	}

	public void printStatic(Map<Prize, Integer> result) {
		System.out.print("\n");
		System.out.println("당첨 통계");
		System.out.println("---");
		System.out.println(String.format(THREE_MATCH, result.getOrDefault(Prize.FIFTH, 0)));
		System.out.println(String.format(FOUR_MATCH, result.getOrDefault(Prize.FOURTH, 0)));
		System.out.println(String.format(FIVE_MATCH, result.getOrDefault(Prize.THIRD, 0)));
		System.out.println(String.format(FIVE_MATCH_WITH_BONUS, result.getOrDefault(Prize.SECOND, 0)));
		System.out.println(String.format(SIX_MATCH, result.getOrDefault(Prize.FIRST, 0)));

	}

	public void printTotalProfit(double profit) {
		System.out.println(String.format(TOTAL_PROFIT, profit));
	}
}
