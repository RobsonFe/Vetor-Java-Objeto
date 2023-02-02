package Programa;

import java.util.Locale;
import java.util.Scanner;
import entidades.Produtos;

public class Vetor_Objeto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		int n = leia.nextInt();
		
		Produtos[] vect = new Produtos[n];
		
		for(int i=0; i<vect.length; i++) {
			leia.nextLine();
			String nome = leia.nextLine();
			double preco = leia.nextDouble();
			vect[i] = new Produtos(nome,preco);
		}
		// a função "vect.length" faz com que o programa já saiba quantos espaços ele tem sem que a gente precise determinar.
		//Nesse vetor eu instancio os objetos para armazenar em cada local da memoria do vetor.
		// Em cada espaço do vetor, terá as informações que eu pedir, como nome e preço.
		
		double soma = 0.0; // toda variavel que tiver numeros acumulados, começará em zero.
		for(int i = 0; i<vect.length; i++) {
					
					soma += vect[i].getPreco();
					// nesse caso eu acesso o vetor na posição i, pegando apenas o preço. 
					//por isso tem "getPreco();".
				}
		double media = soma/ vect.length;
		
		System.out.printf("A media de preços do produto é %.2f%n", media);
		//Neste caso, eu coloquei um "printf" (referencia a linguagem C) para para poder editar o numero de casas decimais.
		// "%.2f%n" esse numero 2 significa o numero de casas decimais que eu quero que seja impresso no resultado.
		
		leia.close();
	}

}
