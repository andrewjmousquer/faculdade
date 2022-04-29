package Capitulo_02_Deitel;

import java.util.Scanner;

// Programa de adição que insere dois números, então exibe a soma deles.

public class AdicaoSubtracaoMultiplicacaoDivisaoModulo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numero1; // primeiro número a somar
		int numero2; // segundo número a somar
		int resultado; // soma do numero1 e numero2

		System.out.print("Digite o primeiro número: ");
		numero1 = input.nextInt(); // lê primeiro o número fornecido pelo usuário

		System.out.printf("Digite o segundo número: ");
		numero2 = input.nextInt(); // lê segundo o número fornecido pelo usuário

		resultado = numero1 + numero2; // soma os números, depois armazena o total em soma

		System.out.printf("Soma é %d %n", resultado); // exibe a soma

		System.out.printf("Bacana! Agora vamos subtrair!!! %n %n");

		///
		///

		System.out.print("Digite o primeiro número: ");
		numero1 = input.nextInt(); // lê primeiro o número fornecido pelo usuário

		System.out.printf("Digite o segundo número: ");
		numero2 = input.nextInt(); // lê segundo o número fornecido pelo usuário

		resultado = numero1 - numero2; // subtrai os números, depois armazena o total em subtração

		System.out.printf("Subtração é %d %n", resultado); // exibe a soma

		System.out.printf("Bacana! Agora vamos multiplicar!!! %n %n");

		
		
		///
		///

		System.out.print("Digite o primeiro número: ");
		numero1 = input.nextInt(); // lê primeiro o número fornecido pelo usuário

		System.out.printf("Digite o segundo número: ");
		numero2 = input.nextInt(); // lê segundo o número fornecido pelo usuário

		resultado = numero1 * numero2; // multiplica os números, depois armazena o total em multiplicão

		System.out.printf("Multiplicação é %d %n", resultado); // exibe a soma

		System.out.printf("Bacana! Agora vamos Dividir!!! %n %n");

	
		
		///
		///

		System.out.print("Digite o primeiro número: ");
		numero1 = input.nextInt(); // lê primeiro o número fornecido pelo usuário

		System.out.printf("Digite o segundo número: ");
		numero2 = input.nextInt(); // lê segundo o número fornecido pelo usuário

		resultado = numero1 / numero2; // divide os números, depois armazena o total em divisão

		System.out.printf("Divisão é %d %n", resultado); // exibe a soma

		System.out.printf("Bacana! Agora vamos ver o resto da divisão!!! %n %n");

		
		
		///
		///
		
		System.out.print("Digite o primeiro número: ");
		numero1 = input.nextInt(); // lê primeiro o número fornecido pelo usuário

		System.out.printf("Digite o segundo número: ");
		numero2 = input.nextInt(); // lê segundo o número fornecido pelo usuário

		resultado = numero1 % numero2; // divide resultando no resto da divisão dos números, depois armazena o total em modulo

		System.out.printf("Divisão é %d %n", resultado); // exibe a soma

		System.out.printf("FIM!!!");

		input.close();

	}// fim do método main
}// fim da classe Adicoes
