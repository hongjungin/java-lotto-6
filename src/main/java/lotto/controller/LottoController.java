package lotto.controller;

import java.util.List;

import lotto.model.Lotto;
import lotto.model.WinningNumbers;
import lotto.service.LottoService;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {
	OutputView outputView = new OutputView();
	InputView inputView = new InputView(null, null, null);
	LottoService lottoService = new LottoService();

	public void start() {
		outputView.moneyAmount();
		int money = inputView.inputMoneyAmount();
		int lottoCount = money / 1000;
		outputView.printLottoCount(lottoCount);
		for (int i = 0; i < lottoCount; i++) {
			List<Integer> generate = lottoService.generateLottoNumbers();
		}
		outputView.winningNumbers();
		List<Integer> winningNumbers = inputView.inputWinningNumber();
		outputView.bonusNumber();
		int bonusNumber = inputView.inputBonusNumber();
		WinningNumbers winningLotto = new WinningNumbers(winningNumbers, bonusNumber);
		outputView.printStatic();
	}
}
