package lv00_foundation;

public class Ex07 {
	//코딩 기초 영어가 싫어요 
	public long solution(String numbers) {

		String[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		for (int i = 0; i < digits.length; i++) {

			numbers = numbers.replace(digits[i], i + "");
		}

		long l1 = Long.parseLong(numbers);

		return l1;
	}

	public static void main(String[] args) {

	}

}
