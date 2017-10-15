package is.ru.stringcalculator;

public class Calculator {

	public static int add(String numbers)  {
		if(numbers.isEmpty()) {
			return 0;	
		}
		else{
			String num[] = numbers.split(",");
			if(numbers.contains(",") || numbers.contains("\n")) {
				String numb[] = numbers.split(",|\n");
				return sum(numb);
			}
			return 1;
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
			//total += toInt(numbers[i]);
		return total;
	}		
}