//ISSO AQUI JÁ SE TRATA DE CRIAÇÃO DE ARQUIVOS/PASTAS E LEITURA DE DETALHES DO DIRETÓRIO COM O JAVA.

package application;

import java.io.File;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//aqui peço um caminho para uma PASTA
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		//Leio perfeitamente a pasta através da classe File
		File path = new File(strPath);
		//Analiso as pastas dentro da pasta e imprimo cada uma
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		//Analiso os arquivos dentro da pasta e imprimo cada um
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		sc.close();
	}
}