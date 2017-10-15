package is.ru.stringcalculator;

public class Calculator {

	public static int add(String numbers)  {
		if(numbers.isEmpty()) {
			return 0;	
		}
		else{
			String delimeter = ",|\n";
			if(numbers.startsWith("//")) {
				delimeter = numbers.substring(2, 3);
				numbers = numbers.substring(4, numbers.length());
			}
			String numb[] = numbers.split(delimeter);
			return sum(numb);
		}
	}
	private static int toInt(String numbers) {
		return Integer.parseInt(numbers);
	}
	private static int sum(String[] numbers) {
		int total = 0;
		for (int i = 0; i < numbers.length; i++) {	
			if(toInt(numbers[i]) < 0) {
				throw new RuntimeException("Negatives not allowed: " + numbers[i]);
			}
			if(toInt(numbers[i]) <= 1000) {
				total += toInt(numbers[i]);
			}
		}
		return total;
	}		
}