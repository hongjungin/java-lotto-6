package lotto.service;

import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class LottoService {
	
	private static final int MIN_LOTTO_NUMBER = 1;
	private static final int MAX_LOTTO_NUMBER = 45;
	private static final int LOTTO_NUMBERS_COUNT = 6;
    
    public List<Integer> generateLottoNumbers() {
        return Randoms.pickUniqueNumbersInRange(MIN_LOTTO_NUMBER, MAX_LOTTO_NUMBER, LOTTO_NUMBERS_COUNT);
    }

}
