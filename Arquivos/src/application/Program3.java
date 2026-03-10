//Este código abre o arquivo, lê e transcreve o que está escrito. O mesmo que o Program 1 e 2
//É apenas otimizado sua leitura já passando informações no () do try.

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {
	public static void main(String[] args) {
		String path = "C:\\Users\\leona\\Eu\\Java\\Nelio\\Material_aulas\\sobre_arquivos\\in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}