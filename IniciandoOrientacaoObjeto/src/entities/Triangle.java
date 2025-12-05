package entities; // pacote da classe-> entities 

public class Triangle {
	public double a; //SE TORNAM ATRIBUTOS DA CLASSE;
	public double b; //public mostra que podem ser usados em outros arquivos
	public double c;
	
	//aqui é usado double para indicar o que a funcao/metodo retorna
	//usaria void, caso nao retornasse nenhum valor
	public double area() {
		double p = (a + b + c) / 2.0;
		double result = Math.sqrt(p * (p-a) * (p - b) * (p - c));	
		return result;
	}
}
