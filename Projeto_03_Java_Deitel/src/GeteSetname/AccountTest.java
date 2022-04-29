package GeteSetname;

// Cria e manipula um objeto Account
//import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		
//		//Cria um objeto Scanner para obter entrada a partir da janela de comando
//		Scanner input = new Scanner(System.in);
//		
//		//Cria um objeto Account e o atribui a myAccount
//		Account myAccount = new Account();
//		
//		//exibe o valor inicial do nome (null)
//		System.out.printf("Inicial do nome é: %s%n%n", myAccount.getName());
//		
//		//solicita e lê o nome
//		System.out.println("Por favor, Digite seu nome:");
//		 String theName = input.nextLine();// lê a linha do texto
//		 myAccount.setName(theName);//insere theName em myAccount
//		 System.out.println();//gera saída de uma linha em branco
//		
//		// exibe o nome armazenado no objeto myAccount
//		System.out.printf("Nome do objeto myAccount é:%n%s%n",myAccount.getName());
//		
//		input.close();
		
		//cria dois objetos Account
		Account account1 = new Account(" Andrew JM");
		Account account2 = new Account(" Jonasson Mousquer");
		
		//exibe o valor inicial de nome para cada Account
		System.out.printf("account1 nome é:%s%n", account1.getName());
		
		System.out.printf("account2 nome é:%s%n", account2.getName());
	}
} //fim da classe AccountTest
