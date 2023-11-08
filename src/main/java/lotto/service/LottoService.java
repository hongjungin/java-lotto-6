package lotto.service;

import java.util.List;
import java.util.stream.Collectors;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.model.Lotto;

public class LottoService {

	private static final int MIN_LOTTO_NUMBER = 1;
	private static final int MAX_LOTTO_NUMBER = 45;
	private static final int LOTTO_NUMBERS_COUNT = 6;

	public Lotto generate() {
		return new Lotto(generateLottoNumbers());
	}

	public List<Integer> generateLottoNumbers() {
		List<Integer> numbers = Randoms.pickUniqueNumbersInRange(MIN_LOTTO_NUMBER, MAX_LOTTO_NUMBER,
				LOTTO_NUMBERS_COUNT);
		return numbers.stream().toList();
	}

}
