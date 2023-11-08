package lotto.model;

public enum ErrorMessage {
	IS_NOT_NATURAL_NUMBER("입력된 값이 자연수가 아닙니다."), IS_NOT_IN_RANGE("1 ~ 45 범위의 숫자가 아닙니다."),
	IS_NOT_A_VALID_FORMAT("입력된 값이 숫자가 아닙니다."), IS_NOT_MULTIPLE_OF_THOUSAND("입력된 값이 1000의 배수가 아닙니다."),
	IS_NOT_SIX_NUMBERS("입력된 숫자의 개수가 6개가 아닙니다."), IS_DUPLICATE_VALUE("입력된 값에 중복이 있습니다.");

	private final String message;

	ErrorMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return "[ERROR] " + message;
	}
}
