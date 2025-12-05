import java.util.Scanner;

public class Estudo {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
//		String original = sc.nextLine();
		String original = " Leonardo PRADO Pessoni    ";
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(2);
		String s5 = original.substring(2,9); 
		String s6 = original.replace('a', 'X');
//		String s7 = original.replace("Leo", "YYY");
		int i = original.indexOf("Leo");
		int j = original.lastIndexOf("Leo");
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase (minusculas): -" + s1 + "-");
		System.out.println("toUpperCase (maiusculas): -" + s2 + "-");
		System.out.println("trim (tira os espaços do inicio e fim): -" + s3 + "-");
		System.out.println("substring(2) : -" + s4 + "-");
		System.out.println("substring(2,9) : -" + s5 + "-");
		System.out.println("substring('a', 'X') : -" + s6 + "-");
		System.out.println("Index of 'Leo': -" + i + "-");
		System.out.println("Last index of 'Leo': -" + j + "-");
		
		
	sc.close();
	}
}
