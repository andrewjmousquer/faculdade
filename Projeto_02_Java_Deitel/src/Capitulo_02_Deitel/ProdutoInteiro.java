package Capitulo_02_Deitel;

import java.util.Scanner; // programa que utiliza o Scanner

// Programa completo que calcula produtos de três inteiros

public class ProdutoInteiro {
	
	public static void main(String[] args) {
		
		// cria Scanner para obter entrada a partir da Janela de comando
		Scanner input = new Scanner (System.in);
		
		int x; // primeiro número inserido pelo usuário
		int y; // segundo número inserido pelo usuário
		int z; // terceiro número inserido pelo usuário
		int result; // produto dos números
		
		System.out.printf("Digite o primeiro número: "); //solitica entrada
		x = input.nextInt(); //lê o primeiro número
		
		System.out.printf("Digite o segundo número: "); //solicita entrada
		y = input.nextInt(); //lê o segundo número
		
		System.out.printf("Digite o terceiro número: "); //solitita entrada
		z = input.nextInt(); //lê o terceiro número
		
		result = x * y * z; // calcula o produto dos números
		
		System.out.printf("Produto é %d%n",result);		
	} // fim método main
}//fim da classe produto
