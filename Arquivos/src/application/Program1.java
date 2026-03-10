//Exemplo inicial, incluindo o uso completo de try + catch + finally em tratamento de exceção.
//Este código abre o arquivo, lê e transcreve o que está escrito.

package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		// caminho do arquivo
		File file = new File("C:\\Users\\leona\\Eu\\Java\\Nelio\\Material_aulas\\sobre_arquivos\\in.txt");
		Scanner sc = null;
		try {
			//aqui criei um objeto sc que acessa o arquivo in.txt
			sc = new Scanner(file);
			// enquanto houver mais alguma linha dentro do arquivo imprima a próxima linha
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			//Aqui é para caso ocorra algum erro como -> arquivo não encontrado ; 
			//acesso negado; interrupção de hardware...
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}