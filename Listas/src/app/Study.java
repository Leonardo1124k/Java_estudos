package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //Aqui é usado o recurso SOBRECARGA
		list.add("Leonardo");
		
		System.out.println("Lista original a seguir: " + list);
		
		System.out.println("Quantidade de elementos na lista: " + list.size()); // vejo a quantidade de elementos na lista
		
		list.remove(5); //o mesmo que -> list.remove("Leonardo");
		
		System.out.println("-".repeat(30));
		list.removeIf(algo -> algo.charAt(0) == 'M');
		System.out.println("Aqui eu removi os nomes que começam com M: " + list);
		System.out.println("-".repeat(30));
		System.out.println("Index of Bob in the list: " + list.indexOf("Bob"));
		System.out.println("Index of Marco (ele não está mais na lista): " + list.indexOf("Marco"));
		System.out.println("-".repeat(30));
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println("Aqui eu criei uma nova lista(result) a partir da original apenas com nomes iniciando com A: ");
		for(String algo : result) { //percorro toda a lista
			System.out.println(algo); // escrevo na tela o objeto usado para percorrer a lista
		}
		System.out.println("-".repeat(30));
		System.out.println("Abaixo eu confiro se algum nome na list inicia com J. Se der certo ele retorna o nome, se não, ele retorna null.");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
	}
}
