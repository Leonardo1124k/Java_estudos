// ISSO AQUI JÁ SE TRATA DE CRIAÇÃO DE ARQUIVOS COM O JAVA.

package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {
	public static void main(String[] args) {
		//Digo o que deve estar dentro do arquivo .txt
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good nightt" };
		//digo onde deverá ser colocado
		String path = "C:\\Users\\leona\\Eu\\Java\\Nelio\\Material_aulas\\sobre_arquivos\\out.txt";
		//instancio a criação do meu arquivo já na variável bw
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				//escrevo todas as linhas passadas ali emcima na criação deste arquivo.
				bw.write(line);
				//crio mais uma linha necessária
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}