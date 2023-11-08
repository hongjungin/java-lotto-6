package lotto.model;

import java.util.List;

public class Lotto {
	private final List<Integer> numbers;

	public Lotto(List<Integer> numbers) {
		validate(numbers);
		this.numbers = numbers;
	}

	private void validate(List<Integer> numbers) {
		if (numbers.size() != 6) {
			throw new IllegalArgumentException();
		}
	}

	public int getMatchCount(List<Integer> winningLottoNumbers) {
		return (int) numbers.stream().filter(winningLottoNumbers::contains).count();
	}

	public boolean getBonusNumber(Integer bonusNumber) {
		return numbers.contains(bonusNumber);
	}

	public List<Integer> getNumbers() {
		return numbers;
	}
}
