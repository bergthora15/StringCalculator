package is.ru.stringcalculator;

public class Calculator {

	public static int add(String numbers)  {
		if(numbers.isEmpty()) {
			return 0;	
		}
		else{
			if(numbers.contains(",")) {
				String numb[] = numbers.split(",");
				int total = 0;
				for (String n : numb) {	
					total +=toInt(n);
				}
				return total;
			}
			return 1;
		}
		
	}
	private static int toInt(String numbers) {
		return Integer.parseInt(numbers);
	}
}