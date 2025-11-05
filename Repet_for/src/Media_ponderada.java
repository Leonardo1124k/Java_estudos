import java.util.Scanner;
import java.util.Locale;

public class Media_ponderada {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos casos voce vai digitar? ");
		int quant = sc.nextInt();
		double pri, seg, ter, media;
		
		for (int i = 1; i <= quant; i++) {
			System.out.println("Digite três notas: ");
			pri = sc.nextDouble();
			seg = sc.nextDouble();
			ter = sc.nextDouble();
			media = (pri * 2 + seg * 3 + ter * 5) / (2 + 3 + 5);
			
			System.out.printf("MEDIA = %.1f%n", media);
		}
		
		System.out.println("FIM");
		sc.close();
	}

}
