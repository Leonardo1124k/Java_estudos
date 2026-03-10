//FileReader e BufferedReader aplicados
// Maneira mais rápida e leve para a memória do pc do que o Program 1
// Faz a mesma coisa que o Program 1 -> abre o arquivo, lê e transcreve o que está ali.
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) {
		String path = "C:\\Users\\leona\\Eu\\Java\\Nelio\\Material_aulas\\sobre_arquivos\\in.txt";
		//BufferedReader lê texto de um fluxo de entrada de caracteres, armazenando
		//caracteres de modo a fornecer leitura eficiente de caracteres
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			//aqui vou ler cada linha no arquivo .txt
			String line = br.readLine();
			//enquanto line ainda tiver algo, escreva na tela
			while (line != null) {
				System.out.println(line);
				//aqui tenho que ler a próxima linha novamente
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}