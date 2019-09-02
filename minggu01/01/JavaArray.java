package minggu01;
import java.util.Arrays;
import java.util.Scanner;

public class JavaArray {
	
	public static void main(String[] args) {
		String[] simpsons = {"Homer", "Marge", "Bart", "Lisa", "Maggie"};
		Number num;
		int[] numbers = new int[10];
		numbers[0] = 1;
		for (int i = 0; i < 10; i++) {
		        numbers[i] = i + 1;
		}
		
		for (int i = 0; i < numbers.length; i++) {
		        System.out.print(numbers[i] + " -- ");
		}
		
		System.out.println();
		System.out.println("Looping data Array ");
		
		for (int i = 0; i < simpsons.length; i++) {
			num = i+1;
	        System.out.println(num+" "+simpsons[i]);
		}
		System.out.println("Sorting Array : ");
		Arrays.sort(simpsons);
		for (String s : simpsons) {
		        System.out.print(s + " ");
		}
		
		System.out.println();
		// example Binary search , input ln , read ln
		Scanner scanner = new Scanner(System.in);
		String[] simpsonsFamily = {"Homer", "Marge", "Bart", "Lisa", "Maggie"};
		System.out.println("Sebutkan 1 Nama Keluarga Simson : ");
		String simpson = scanner.nextLine();
		Arrays.sort(simpsonsFamily);
		int position = Arrays.binarySearch(simpsonsFamily, simpson);
		if (position >= 0) {
		        System.out.println("Ya, ini ["+simpson+"] keluarga Simpson!");
		}
		else {
		        System.out.println("Hey! ini ["+simpson+"] bukan keluarga Simpson!");
		}

		
	}
}
