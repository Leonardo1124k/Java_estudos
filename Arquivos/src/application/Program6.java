//ISSO AQUI JÁ SE TRATA DE CRIAÇÃO DE ARQUIVOS/PASTAS E LEITURA DE DETALHES DO DIRETÓRIO COM O JAVA.

package application;

import java.io.File;
import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Peço o caminho de uma pasta
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		//Obtenho as informações da pasta através da classe File
		File path = new File(strPath);
		//Obtenho o caminho da pasta
		System.out.println("getPath: " + path.getPath());
		//Obtenho a pasta pai
		System.out.println("getParent: " + path.getParent());
		//Obtenho o nome
		System.out.println("getName: " + path.getName());
		sc.close();
	}
}