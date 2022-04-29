package Capitulo_02_Deitel;

import java.util.Scanner;

//Compara inteiros utilizando instruções if, operadores relacionais e operadores de igualdade.

public class Comparison {
	
	//método main inicia a execução do aplicativo Java
	public static void main(String[] args) {
		
		//Cria Scanner para obter entrada a partir da linha de comando
		Scanner input = new Scanner(System.in);
		
		int number1; //primeiro número a comparar
		int number2; //segundo número a comparar
		
		System.out.print("Digite o primeiro número: "); // prompt
		number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
		
		System.out.print("Digite o segundo número: "); // prompt
		number2 = input.nextInt(); //lê o segundo número fornecido pelo usuário
		
		if (number1 == number2)
			System.out.printf("%d == %d %n", number1, number2);
		if (number1 != number2)
			System.out.printf("%d != %d %n", number1, number2);
		if (number1 < number2)
			System.out.printf("%d < %d %n", number1, number2);
		if (number1 > number2)
			System.out.printf("%d > %d %n", number1, number2);
		if (number1 <= number2)
			System.out.printf("%d <= %d %n", number1, number2);
		if (number1 >= number2)
			System.out.printf("%d >= %d %n", number1, number2);
		
	} // fim do método main

} // fim da classe Comparison
