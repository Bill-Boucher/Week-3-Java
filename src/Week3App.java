import java.util.Arrays;

public class Week3App {

	public static void main(String[] args) {
	//Questions:
	//1a. 
		int[] ages = new int[] {3,9,23,64,2,8,28,93};
		System.out.println(ages[ages.length -1]-ages[0]);
		
	//1b. 
		//int[] newAge = new int []{3,9,23,64,2,8,28,93,100};
		//System.out.println(newAge[newAge.length -1]-newAge[0]);
	//1c.
		double sum = 0;
		for (double age : ages) {
			sum += age;

	}
		double averageAge = sum / ages.length;
		System.out.println(averageAge);
		
	//2a.
		String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int sumOfCharacters = 0;
		for (String name : names) {
			int countString = name.length();
			sumOfCharacters += countString;
					
		}
		double averageNumberLetters = sumOfCharacters / names.length;
		System.out.println(averageNumberLetters);
	//b.
		String allNamesTogether = " ";
		for (String name : names) {
			allNamesTogether += name + " ";
		}
		System.out.println(allNamesTogether);
		
	//3.
		int[] array = {1,2,3,4};
		System.out.println(array [array.length-1]);
	//4.
		System.out.println(array[0]);
	//5.
		int [] nameLengths = new int [names.length];
		for (int i =0; i <names.length; i++) {
			nameLengths[i] = names [i].length();
			
		}System.out.println(Arrays.toString(nameLengths));
	//6.
		int sumOfName = 0; 
		for (int nameLength : nameLengths) {
			sumOfName += nameLength;
		}System.out.println(sumOfName);
	//7.
			System.out.println(repeatMethod("hello", 5));	
	//8.
		System.out.println(fullName("Billy","Boucher"));
	//9.
		int[] numbers = {29, 100 ,29};
		System.out.println(isGreaterthan100(numbers));
	//10.
		double [] elements = {22.2, 33.3, 44.4};
		System.out.println(totalAverage(elements));
	//11. 
		double [] array1 = {99.9,111.3,444.4,555.5};
		double [] array2 = {66.6,77.7,88.8,99.9};
		System.out.println(averageArray(array1, array2));
	//12. 
		boolean isHotOutside = true;
		double moneyInPocket = 9.50;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	//13.
		int ageOfPerson = 22;
		double moneyInWallet = 5.0;
		System.out.println(ageToBuyBeer(ageOfPerson, moneyInWallet));
			
		
	}
	//7 Method
	public static String repeatMethod (String word, int n) {
		String repeatMethod ="";
		for (int i =0; i<n; i++) {
			repeatMethod += word;
		}
		return repeatMethod;
	}
	//8. Method
	
	public static String fullName (String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
//9. Method
	public static boolean isGreaterthan100 (int[] numbers) {
		int total = 0;
		for (int number:numbers) {
			total+=number;
		}
		if (total > 100) {
			return true;
		}else {
			return false;
		}
	}
//10. Method
	public static double totalAverage (double[] elements)	{
		double sum =0;
		for (double element:elements) {
			sum += element;
			
		}
		return sum/elements.length;
	}
//11. Method
	public static boolean averageArray (double [] array1, double[] array2) {
		double totalA1 = 0;
		for (double number:array1) {
			totalA1 += number;
		} double totalA2 =0;
		for (double number2:array2) {
			totalA2 += number2;
		}
		return (totalA1/array1.length) > (totalA2/array2.length);
	} 
//12. Method
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && (moneyInPocket >10.50)) {
			return true;
		} else {
			return false;
		}
	}
//13. Method
	public static String ageToBuyBeer (int ageOfPerson, double moneyInWallet) {
		if (ageOfPerson >= 21 && (moneyInWallet >= 5.0)) {
			return ("Yes! You can buy beer ");
		} else {
			return ("Please wait until you are 21 yrs old ");
		}
	}

}


